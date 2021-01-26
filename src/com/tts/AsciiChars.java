package com.tts;


public class AsciiChars {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        printNumbers();
        printLowerCase();
        printUpperCase();
    }

    public static void printNumbers() {
        // TODO: print valid numeric input

        for (int i = '0'; i <= (int) '9'; i++) {
            System.out.println(i);
        }
    }

    public static void printLowerCase() {
        //TODO: print valid lowercase alphabetic input
        for (int i = 'a'; i <= (int) 'z'; i++) {

            System.out.println(i);
        }

    }
        public static void printUpperCase() {
            // TODO: print valid uppercase alphabetic input
            for (int i = 'A'; i <= (int) 'Z'; i++) {
                System.out.println(i);
            }

        }
    }

