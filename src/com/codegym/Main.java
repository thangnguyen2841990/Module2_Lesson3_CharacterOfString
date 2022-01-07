package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        char character;
        System.out.println("Enter string ");
        str = scanner.nextLine();
        System.out.println("Enter Character");
        character = scanner.next().charAt(0); // nhập ký tự
        System.out.println("Số lần xuất hiện của ký tự: "+ character+" là: "+characrter(str,character));
        System.out.println("Ký tự ở vị trí: "+indexOfCharacrter(str,character));

    }

    // xay dung ham dem tong so ky tu
    public static int characrter(String string, char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character)
                count++;
        }
        return count;
    }
    // Hien thi vi tri cua ky tu trong chuoi
    public static int indexOfCharacrter(String string, char character) {
       int index = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character)
                index = i;

        }
        return index;
    }

}
