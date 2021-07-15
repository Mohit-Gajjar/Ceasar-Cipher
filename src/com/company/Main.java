package com.company;

import java.util.Scanner;

public class Main {
    String encryptedText = "", decryptedText = "";
    public String encrypt(String plainText, int key){
       if (key == 3){
           int length = plainText.length();
           for (int i = 0; i < length; i++){
               char temp = plainText.charAt(i);
                char temp1  = (char) (temp + 3);
                encryptedText += temp1;
           }
       }
        return encryptedText;
    }
    public String decrypt(String cipherText, int key){
        if (key == 3){
            int length = cipherText.length();
            for (int i = 0; i < length; i++){
                char temp = cipherText.charAt(i);
                char temp1  = (char) (temp - 3);
                decryptedText += temp1;
            }
        }
        return decryptedText;
    }
    public static void main(String[] args) {
	    Main test = new Main();
	    Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.println("TEXT ENCRYPTION");
        System.out.println("==========================================================");
        System.out.print("Enter the Plain Text: ");
        String plainText = scanner.next();
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        System.out.println("Encrypted Text: " + test.encrypt(plainText, key));
        System.out.println("==========================================================");
        System.out.println("TEXT DECRYPTION");
        System.out.println("==========================================================");
        System.out.print("Enter the Plain Text: ");
        String decryptedText = scanner.next();
        System.out.print("Enter the key: ");
        int key1 = scanner.nextInt();
        System.out.println("Decrypted Text: " + test.decrypt(decryptedText, key1));
        System.out.println("==========================================================");
    }
}
