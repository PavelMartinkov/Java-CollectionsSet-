package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static practice.Main.WRONG_EMAIL_ANSWER;

public class EmailList {

    TreeSet <String> treeSet = new TreeSet<>();

    public void add(String email) {

        String regex = "[a-z0-9+_.-]+@[a-z]+\\.[a-z]{2,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            treeSet.add(email);
            System.out.println("Добавлен email :" + email.toLowerCase());
        } else {
                System.out.println(WRONG_EMAIL_ANSWER);
            }
        }
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод

    public List<String> getSortedEmails() {
        ArrayList<String> arrayList = new ArrayList<>(treeSet);
        Collections.sort(arrayList);
        for (String newEmail : arrayList) {
            System.out.println(newEmail);
        }
        return arrayList;
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
    }
}
