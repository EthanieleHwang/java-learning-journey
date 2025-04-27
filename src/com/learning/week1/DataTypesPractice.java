package com.learning.week1;

public class DataTypesPractice {
    public static void main(String[] args){
        //1. Declare and initialize variables
        byte byteVar = 100; // 1 byte
        short shortVar = 10000; // 2 bytes
        int intVar = 100000; // 4 bytes //int is default
        long longVar = 10000000000L; // 8 bytes // L suffix for long
        float floatVar = 10000000000f; // 4 bytes // f suffix for float
        double doubleVar = 2.71828; // 8 bytes // double is default
        char charVar = 'A'; // 2 bytes
        char chineseChar = '汉'; // 2 bytes
        boolean boolVar = true;

        //2. Print the variables
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("chineseChar: " + chineseChar); // Print Chinese character
        System.out.println("boolVar: " + boolVar);
        System.out.println("--------------------------");

        //3. Type casting
        //Implicit casting (widening)
        int intFromShort = shortVar; // short to int
        double doubleFromInt = intVar; // int to double
        double doubleFromFloat = floatVar; // float to double
        int intFromChar = charVar; // char to int (ASCII value)

        System.out.println("intfromShort: " + intFromShort);
        System.out.println("doubleFromInt: " + doubleFromInt);
        System.out.println("doubleFromFloat: " + doubleFromFloat);
        System.out.println("intFromChar(ASCII of 'A'): " + intFromChar); // ASCII value of 'A' is 65
        System.out.println("--------------------------");

        //Explicit casting (narrowing)
        int intFromDouble = (int) doubleVar; // double to int
        byte byteFromInt = (byte) 130; // int to byte // 130 is out of byte range (-128 to 127), so it will overflow
        char charFromInt = (char) 66; // int to char (ASCII value)
        System.out.println("intFromDouble: " + intFromDouble); // 2
        System.out.println("byteFromInt: " + byteFromInt); // 130 is out of byte range, so it will overflow to -126
        System.out.println("charFromInt: " + charFromInt); // ASCII value of 66 is 'B'
        System.out.println("--------------------------");

        // byte to int
        byte b1 = 10;
        byte b2 = 20;

        int intResult = b1+b2; // byte to int

        byte byteResult = (byte) (b1+b2); // byte to int and then back to byte
        System.out.println("intResult from byte + byte: " + intResult); // 30
        System.out.println("byteResult from byte + byte: " + byteResult); // 30
    }
}
