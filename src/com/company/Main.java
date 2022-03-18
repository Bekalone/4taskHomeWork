package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (listA.size() < 5) {
                System.out.print("Заполните список - A: ");
                listA.add(scanner.next());
            } else {
                System.out.println("list A: " + listA);
                break;
            }
        }

        while (true) {
            if (listB.size() < 5) {
                System.out.print("Заполните список - B: ");
                listB.add(scanner.next());
            } else {
                System.out.println("list B: " + listB);
                break;
            }
        }

        Collections.reverse(listB);
        listC.add(listA.get(0));
        listC.add(listB.get(0));
        listC.add(listA.get(1));
        listC.add(listB.get(1));
        listC.add(listA.get(2));
        listC.add(listB.get(2));
        listC.add(listA.get(3));
        listC.add(listB.get(3));
        listC.add(listA.get(4));
        listC.add(listB.get(4));
        System.out.println("list C: " + listC);

        Collections.sort(listC, new Comp());
        System.out.println("Отсортированный list C по длинне слова: " + listC);
    }
}
