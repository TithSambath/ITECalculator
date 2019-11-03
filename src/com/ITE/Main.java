package com.ITE;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Integer.*;

/**
 * @author Dyly TithSambath
 */
public class Main {

    // Variable declaration:

        private static int A  = 0, numberForConvert;
        private static int B = 0;
        private static float Radian = 0;
        private static int Degree = 0;
        private static double Answer,Base = 0;
        private static long answer, base = 0;
        private static String value_as_string;

    // Create an object of another class for use:(import class)
        static Scanner scan = new Scanner(System.in);
        static DecimalFormat df = new DecimalFormat("0.00"); // Create casting but it is return string
        static Bitwise bitwise = new Bitwise();
        static Operators operators = new Operators();
        static StorageConverter storageConverter = new StorageConverter();
        static NumberSystemConversion numberSystemConversion = new NumberSystemConversion();

   // create function for calling a specific function:

    /**
     * This function is use to call each operators from Arithmetic Operators Method.
     * @param option is an user choice from 1 to 5.
     */
        static void calledArithmeticOperators(int option){
            switch (option){
                case 1 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    Answer = operators.Sum(A,B);
                    System.out.println("Answer = "+Answer);
                    break;
                case 2 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    Answer = operators.Divide(A,B);
                    System.out.println("Answer = "+Answer);
                    break;
                case 3 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    Answer = operators.Minus(A,B);
                    System.out.println("Answer = "+Answer);
                    break;
                case 4 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    Answer = operators.Multiply(A,B);
                    System.out.println("Answer = "+Answer);
                    break;
                case 5 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    Answer = operators.Modulo(A,B);
                    System.out.println("Answer = "+Answer);
                    break;
            }
        }

    /**
     * This function is use to call each operators from Trigonometric Method.
      * @param option is an user choice from 1 to 6
     */
        static void calledTrigonometricOperators(int option){
            switch (option){
                case 1 : System.out.println("Enter Value of Radian: ");
                    Radian = scan.nextFloat();
                    Answer = Double.parseDouble(df.format(operators.Sin(Radian)));
                    System.out.println("Answer = "+Answer);
                    break;
                case 2 : System.out.println("Enter number of Degree: ");
                    Degree = scan.nextInt();
                    Answer =  Double.parseDouble(df.format(operators.Sind(Degree)));
                    System.out.println("Answer = "+Answer);
                    break;
                case 3 : System.out.println("Enter number of Radian: ");
                    Radian = scan.nextFloat();
                    Answer = Double.parseDouble(df.format(operators.Cos(Radian)));
                    System.out.println("Answer ="+Answer);// format Answer into 0.00 less than before.
                    break;
                case 4 : System.out.println("Enter number of Degree: ");
                    Degree = scan.nextInt();
                    Answer = Double.parseDouble(df.format(operators.Cosd(Degree)));
                    System.out.println("Answer = "+Answer);
                    break;
                case 5 : System.out.println("Enter number of Radian: ");
                    Radian = scan.nextFloat();
                    Answer = Double.parseDouble(df.format(operators.tan(Radian)));
                    System.out.println("Answer = "+Answer);
                    break;
                case 6 : System.out.println("Enter number of Degree: ");
                    Degree = scan.nextInt();
                    Answer = Double.parseDouble(df.format(operators.tand(Degree)));
                    System.out.println("Answer = "+Answer);
                    break;
            }
        }

    /**
     * This funtion is use to call each operators from Bitwise Method.
      * @param option is an user choice from 1 to 6
     */
        static void calledBitwiseOperators (int option){
            switch(option){

                case 1 : System.out.println("Enter Number for value 1 and value 2 here: ");
                         A = scan.nextInt();
                         B = scan.nextInt();
                         answer = bitwise.AND_Operator(A,B);
                         System.out.println("Answer =  "+answer);
                         break;
                case 2 : System.out.println("Enter Number for value 1 and value 2 here: ");
                         A = scan.nextInt();
                         B = scan.nextInt();
                         answer = bitwise.OR_Operator(A,B);
                         System.out.println("Answer =  "+answer);
                         break;
                case 3 : System.out.println("Enter Number for value 1 and value 2 here: ");
                         A = scan.nextInt();
                         B = scan.nextInt();
                         answer = bitwise.XOR_Operator(A,B);
                         System.out.println("Answer =  "+answer);
                         break;
                case 4 : System.out.println("Enter Number for value that you want to Inversion here: ");
                         int value = scan.nextInt();
                         answer = bitwise.Bitwise_Inversion_Operator(value);
                         System.out.println("Answer =  "+answer);
                         break;
                case 5 : System.out.println("Enter Number for value and time of shift here (Left Shift): ");
                         A = scan.nextInt();
                         B = scan.nextInt();
                         answer = bitwise.Left_shift(A,B);
                         System.out.println("Answer =  "+answer);
                         break;
                case 6 : System.out.println("Enter Number for value and time of shift here (Right Shift): ");
                         A = scan.nextInt();
                         B = scan.nextInt();
                         answer = bitwise.Right_shift(A,B);
                         System.out.println("Answer =  "+answer);

            }
        }

    /**
     * This funtion is use to call each converter method from StorageConverter class.
      * @param menuOption is an user choice from 1 to 6
     */
        static void calledStorageConverter (int menuOption,int converter){
            switch (menuOption){
                case 1: Byte(converter); break;
                case 2: Kilobyte(converter); break;
                case 3: Megabyte(converter); break;
                case 4: Gigabyte(converter); break;
                case 5: Terabyte(converter); break;
                case 6: Petabyte(converter); break;
            }
        }

        static void calledNumberSystemConverter(int mainOption, int subMenuOption){
            switch (mainOption) {
                case 1: Binary(subMenuOption);break;
                case 2: Octal(subMenuOption);break;
            }
        }

    // Create function Menu display:

    /**
     * This Method is use to print out Menu on console output and let user input there option here.
     */
    static void createMenu () {
    // Menu Display
        System.out.println("OPERATOR MENU: ");
        System.out.println("    1. Arithmetic Operator");
        System.out.println("    2. Trigonometric Operator");
        System.out.println("    3. Bitwise Operation");
        System.out.println("    4. Storage Converter");
        System.out.println("    5. Number System Conversion");

    // Ask user option:
        System.out.println("Enter your option here: ");
        int MenuOption = 0;
        int FunctionOption = 0;

        MenuOption = scan.nextInt(); // let user input their option.

        switch (MenuOption){
            case 1: System.out.println("Arithmetic Operator: ");
                    System.out.println("    1. Sum");
                    System.out.println("    2. Divide");
                    System.out.println("    3. Minus");
                    System.out.println("    4. Multiply");
                    System.out.println("    5. Modulo");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    calledArithmeticOperators(FunctionOption);
                    break;
            case 2: System.out.println("Trigonometric Operator: ");
                    System.out.println("    1. Sin in Radian");
                    System.out.println("    2. Sin in Degree");
                    System.out.println("    3. Cos in Radian");
                    System.out.println("    4. Cos in Degree");
                    System.out.println("    5. tan in Radian");
                    System.out.println("    6. tan in Degree");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    calledTrigonometricOperators(FunctionOption);
                    break;
            case 3: System.out.println("Bitwise Operator: ");
                    System.out.println("    1. AND Operator");
                    System.out.println("    2. OR Operator");
                    System.out.println("    3. XOR Operator");
                    System.out.println("    4. Bitwise Inversion Operator");
                    System.out.println("    5. Left Shift");
                    System.out.println("    6. Right Shift");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    calledBitwiseOperators(FunctionOption);
                    break;
            case 4: System.out.println("Storage Converter: ");
                    System.out.println("    1. Byte");
                    System.out.println("    2. KiloByte");
                    System.out.println("    3. Megabyte");
                    System.out.println("    4. Gigabyte");
                    System.out.println("    5. Terabyte");
                    System.out.println("    6. Petabyte");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    storageConverterSubMenu(FunctionOption);
                    break;
            case 5: System.out.println("Number System Conversion: ");
                    System.out.println("    1. Binary");
                    System.out.println("    2. Octal");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    numberSystemConversionSubMenu(FunctionOption);


        }
    }

    /**
     * This storageConverterSubMenu have ability to find option that Match it
     * then display its sub Menu.
     * @param option is user option that pass from CreateMenu() in case 4.
     */
    static void storageConverterSubMenu(int option){
        int convertOption;
        switch (option){
            case 1: System.out.println("Byte:");
                    System.out.println("        1. Byte to Kilobyte");
                    System.out.println("        2. Byte to Megabyte");
                    System.out.println("        3. Byte to Gigabyte");
                    System.out.println("        4. Byte to Terabyte");
                    System.out.println("        5. Byte to Petabyte");
                    System.out.println("Enter your option here: ");
                        convertOption = scan.nextInt();
                        calledStorageConverter(option,convertOption);
                    break;
            case 2: System.out.println("Kilobyte:");
                    System.out.println("            1. Kilobyte to Byte");
                    System.out.println("            2. Kilobyte to Megabyte");
                    System.out.println("            3. Kilobyte to Gigabyte");
                    System.out.println("            4. Kilobyte to Terabyte");
                    System.out.println("            5. Kilobyte to Petabyte");
                    System.out.println("Enter your option here: ");
                        convertOption = scan.nextInt();
                        calledStorageConverter(option,convertOption);
                    break;
            case 3: System.out.println("Megabyte:");
                    System.out.println("            1. Megabyte to Byte");
                    System.out.println("            2. Megabyte to Kilobyte");
                    System.out.println("            3. Megabyte to Gigabyte");
                    System.out.println("            4. Megabyte to Terabyte");
                    System.out.println("            5. Megabyte to Petabyte");
                    System.out.println("Enter your option here: ");
                        convertOption = scan.nextInt();
                        calledStorageConverter(option,convertOption);
                    break;
            case 4: System.out.println("Gigabyte:");
                    System.out.println("            1. Gigabyte to Byte");
                    System.out.println("            2. Gigabyte to Kilobyte");
                    System.out.println("            3. Gigabyte to Megabyte");
                    System.out.println("            4. Gigabyte to Terabyte");
                    System.out.println("            5. Gigabyte to Petabyte");
                    System.out.println("Enter your option here: ");
                        convertOption = scan.nextInt();
                        calledStorageConverter(option,convertOption);
                    break;
            case 5: System.out.println("Terabyte:");
                    System.out.println("            1. Terabyte to Byte");
                    System.out.println("            2. Terabyte to Kilobyte");
                    System.out.println("            3. Terabyte to Megabyte");
                    System.out.println("            4. Terabyte to Gigabyte");
                    System.out.println("            5. Terabyte to Petabyte");
                    System.out.println("Enter your option here: ");
                        convertOption = scan.nextInt();
                        calledStorageConverter(option,convertOption);
                    break;
            case 6: System.out.println("Petabyte:");
                    System.out.println("            1. Petabyte to Byte");
                    System.out.println("            2. Petabyte to Kilobyte");
                    System.out.println("            3. Petabyte to Megabyte");
                    System.out.println("            4. Petabyte to Gigabyte");
                    System.out.println("            5. Petabyte to Terabyte");
                    System.out.println("Enter your option here: ");
                        convertOption = scan.nextInt();
                        calledStorageConverter(option,convertOption);
                    break;
        }
    }
    static void numberSystemConversionSubMenu(int mainOption){
        int subMenuOption;
        switch (mainOption){
            case 1: System.out.println("Binary: ");
                    System.out.println("    1.  Binary to Octal");
                    System.out.println("    2.  Binary to Decimal");
                    System.out.println("    3.  Binary to Hexadecimal");
                    subMenuOption = scan.nextInt();
                    calledNumberSystemConverter(mainOption,subMenuOption);
                    break;
            case 2: System.out.println("Octal: ");
                    System.out.println("    1.  Octal to Binary");
                    System.out.println("    2.  Octal to Decimal");
                    System.out.println("    3.  Octal to Hexadecimal");
                    subMenuOption = scan.nextInt();
                    calledNumberSystemConverter(mainOption,subMenuOption);
                    break;
        }
    }

    /*
        All this function below is use to receive an answer from specific function operation (From another class)
     */
        // Bitwise Operator:
        static void Byte (int convertOption){
            switch (convertOption){
                case 1: System.out.println("    Byte To Kilobyte: ");
                        System.out.println("\nEnter Number of Byte here : ");
                        numberForConvert = scan.nextInt();
                        Answer = storageConverter.byte2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                        System.out.print(numberForConvert);
                        System.out.print(" byte = ");
                        System.out.print(Answer);
                        System.out.print(" KB");
                        break;
                case 2: System.out.println("    Byte To Megabyte: ");
                        System.out.println("\nEnter Number of Byte here : ");
                        numberForConvert = scan.nextInt();
                        Answer = storageConverter.byte2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                        System.out.print(numberForConvert);
                        System.out.print(" byte = ");
                        System.out.print(Answer);
                        System.out.print(" MB");
                        break;
                case 3: System.out.println("    Byte To Gigabyte: ");
                        System.out.println("\nEnter Number of Byte here : ");
                        numberForConvert = scan.nextInt();
                        Answer = storageConverter.byte2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                        System.out.print(numberForConvert);
                        System.out.print(" byte = ");
                        System.out.print(Answer);
                        System.out.print(" GB");
                        break;
                case 4: System.out.println("    Byte To Terabyte: ");
                        System.out.println("\nEnter Number of Byte here : ");
                        numberForConvert = scan.nextInt();
                        Answer = storageConverter.byte2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                        System.out.print(numberForConvert);
                        System.out.print(" byte = ");
                        System.out.print(Answer);
                        System.out.print(" TB");
                        break;
                case 5: System.out.println("    Byte To Petabyte: ");
                        System.out.println("\nEnter Number of Byte here : ");
                        numberForConvert = scan.nextInt();
                        Answer = storageConverter.byte2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                        System.out.print(numberForConvert);
                        System.out.print(" byte = ");
                        System.out.print(Answer);
                        System.out.print(" PB");
                        break;
            }
        }
        static void Kilobyte (int convertOption){
            switch (convertOption){
                case 1: System.out.println("    Kilobyte To Byte: ");
                    System.out.println("\nEnter Number of Kilobyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.kb2Byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" KB = ");
                    System.out.print(Answer);
                    System.out.print(" Byte");
                    break;
                case 2: System.out.println("    Kilobyte To Megabyte: ");
                    System.out.println("\nEnter Number of Kilobyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.kb2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" KB = ");
                    System.out.print(Answer);
                    System.out.print(" MB");
                    break;
                case 3: System.out.println("    Kilobyte To Gigabyte: ");
                    System.out.println("\nEnter Number of Kilobyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.kb2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" KB = ");
                    System.out.print(Answer);
                    System.out.print(" GB");
                    break;
                case 4: System.out.println("    Kilobyte To Terabyte: ");
                    System.out.println("\nEnter Number of Kilobyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.kb2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" KB = ");
                    System.out.print(Answer);
                    System.out.print(" TB");
                    break;
                case 5: System.out.println("    Kilobyte To Petabyte: ");
                    System.out.println("\nEnter Number of Kilobyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.kb2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" KB = ");
                    System.out.print(Answer);
                    System.out.print(" PB");
                    break;
            }
        }
        static void Megabyte (int convertOption){
            switch (convertOption){
                case 1: System.out.println("    Megabyte To Byte: ");
                    System.out.println("\nEnter Number of Megabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.mb2Byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" MB = ");
                    System.out.print(Answer);
                    System.out.print(" Byte");
                    break;
                case 2: System.out.println("    Megabyte To Kilobyte: ");
                    System.out.println("\nEnter Number of Megabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.mb2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" MB = ");
                    System.out.print(Answer);
                    System.out.print(" KB");
                    break;
                case 3: System.out.println("    Megabyte To Gigabyte: ");
                    System.out.println("\nEnter Number of Megabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.mb2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" MB = ");
                    System.out.print(Answer);
                    System.out.print(" GB");
                    break;
                case 4: System.out.println("    Megabyte To Terabyte: ");
                    System.out.println("\nEnter Number of Megabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.mb2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" MB = ");
                    System.out.print(Answer);
                    System.out.print(" TB");
                    break;
                case 5: System.out.println("    Megabyte To Petabyte: ");
                    System.out.println("\nEnter Number of Megabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.mb2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" MB = ");
                    System.out.print(Answer);
                    System.out.print(" PB");
                    break;
            }
        }
        static void Gigabyte (int convertOption){
            switch (convertOption){
                case 1: System.out.println("    Gigabyte To Byte: ");
                    System.out.println("\nEnter Number of Gigabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.gb2byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" GB = ");
                    System.out.print(Answer);
                    System.out.print(" Byte");
                    break;
                case 2: System.out.println("     Gigabyte To Kilobyte: ");
                    System.out.println("\nEnter Number of Gigabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.gb2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" GB = ");
                    System.out.print(Answer);
                    System.out.print(" KB");
                    break;
                case 3: System.out.println("     Gigabyte To Megabyte: ");
                    System.out.println("\nEnter Number of  Gigabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.gb2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" GB = ");
                    System.out.print(Answer);
                    System.out.print(" MB");
                    break;
                case 4: System.out.println("     Gigabyte To Terabyte: ");
                    System.out.println("\nEnter Number of Gigabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.gb2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" GB = ");
                    System.out.print(Answer);
                    System.out.print(" TB");
                    break;
                case 5: System.out.println("     Gigabyte To Petabyte: ");
                    System.out.println("\nEnter Number of  Gigabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.gb2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" GB = ");
                    System.out.print(Answer);
                    System.out.print(" PB");
                    break;
            }
        }
        static void Terabyte (int convertOption){
            switch (convertOption){
                case 1: System.out.println("    Terabyte To Byte: ");
                    System.out.println("\nEnter Number of Terabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.tb2Byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" TB = ");
                    System.out.print(Answer);
                    System.out.print(" Byte");
                    break;
                case 2: System.out.println("     Terabyte To Kilobyte: ");
                    System.out.println("\nEnter Number of Terabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.tb2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" TB = ");
                    System.out.print(Answer);
                    System.out.print(" KB");
                    break;
                case 3: System.out.println("     Terabyte To Megabyte: ");
                    System.out.println("\nEnter Number of  Terabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.tb2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" TB = ");
                    System.out.print(Answer);
                    System.out.print(" MB");
                    break;
                case 4: System.out.println("     Terabyte To Gigabyte: ");
                    System.out.println("\nEnter Number of Terabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.tb2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" TB = ");
                    System.out.print(Answer);
                    System.out.print(" GB");
                    break;
                case 5: System.out.println("     Terabyte To Petabyte: ");
                    System.out.println("\nEnter Number of  Terabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.tb2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" TB = ");
                    System.out.print(Answer);
                    System.out.print(" PB");
                    break;
            }
        }
        static void Petabyte (int convertOption){
            switch (convertOption){
                case 1: System.out.println("    Petabyte To Byte: ");
                    System.out.println("\nEnter Number of Petabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.pb2Byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" PB = ");
                    System.out.print(Answer);
                    System.out.print(" Byte");
                    break;
                case 2: System.out.println("     Petabyte To Kilobyte: ");
                    System.out.println("\nEnter Number of Petabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.pb2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" PB = ");
                    System.out.print(Answer);
                    System.out.print(" KB");
                    break;
                case 3: System.out.println("     Petabyte To Megabyte: ");
                    System.out.println("\nEnter Number of  Petabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.pb2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" PB = ");
                    System.out.print(Answer);
                    System.out.print(" MB");
                    break;
                case 4: System.out.println("     Petabyte To Gigabyte: ");
                    System.out.println("\nEnter Number of Petabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.pb2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" PB = ");
                    System.out.print(Answer);
                    System.out.print(" GB");
                    break;
                case 5: System.out.println("     Petabyte To Terabyte: ");
                    System.out.println("\nEnter Number of  Petabyte here : ");
                    numberForConvert = scan.nextInt();
                    Answer = storageConverter.pb2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                    System.out.print(numberForConvert);
                    System.out.print(" PB = ");
                    System.out.print(Answer);
                    System.out.print(" TB");
                    break;
            }
        }
        // Number system conversion:
        static void Binary (int convertOption){
            int value;
            switch (convertOption){
                case 1: System.out.println("      Binary to Octal");
                        System.out.println("Enter number of Binary here: ");
                        value = scan.nextInt();
                        value_as_string = numberSystemConversion.binary2Octal(value);
                        while (value_as_string == "Invalid number"){
                            System.out.println("Warning: Binary number system have only 0 and 1.");
                            System.out.println("Try to input Binary number again here: ");
                            value = scan.nextInt();
                            value_as_string = numberSystemConversion.binary2Octal(value);
                        }
                        System.out.print(value);
                        System.out.print(" = ");
                        System.out.println(value_as_string);
                        break;
                case 2: System.out.println("      Binary to Decimal");
                        System.out.println("Enter number of Binary here: ");
                        value = scan.nextInt();
                        value_as_string = numberSystemConversion.binary2Decimal(value);
                        while (value_as_string == "Invalid number"){
                            System.out.println("Warning: Binary number system have only 0 and 1.");
                            System.out.println("Try to input Binary number again here: ");
                            value = scan.nextInt();
                            value_as_string = numberSystemConversion.binary2Decimal(value);
                        }
                        System.out.print(value);
                        System.out.print(" = ");
                        System.out.println(value_as_string);

                        break;
                case 3: System.out.println("   Binary to Hexadecimal");
                        System.out.println("Enter number of Binary here: ");
                        value = scan.nextInt();
                        value_as_string = numberSystemConversion.binary2Hexadecimal(value);
                        while (value_as_string == "Invalid number"){
                            System.out.println("Warning: Binary number system have only 0 and 1.");
                            System.out.println("Try to input Binary number again here: ");
                            value = scan.nextInt();
                            value_as_string = numberSystemConversion.binary2Hexadecimal(value);
                        }
                        System.out.print(value);
                        System.out.print(" = ");
                        System.out.println(value_as_string);
                        break;
            }
        }
        static void Octal (int convertOption){
            int value;
            switch (convertOption){
                case 1: System.out.println("      Octal to Binary: ");
                        System.out.println("Enter number of Octal here: ");
                        value = scan.nextInt();
                        value_as_string = numberSystemConversion.Octal2Binary(value);
                        while (value_as_string == "Invalid number"){
                            System.out.println("Octal Number system allow only 0-7.");
                            System.out.println("Enter Octal number system again here: ");
                            value = scan.nextInt();
                            value_as_string = numberSystemConversion.Octal2Binary(value);
                        }
                        System.out.print(value);
                        System.out.print(" = ");
                        System.out.print(value_as_string);
                        break;
                case 2: System.out.println("      Octal to Decimal: ");
                        System.out.println("Enter number of Octal here: ");
                        value = scan.nextInt();
                        value_as_string = numberSystemConversion.Octal2Decimal(value);
                        while (value_as_string == "Invalid number"){
                            System.out.println("Octal Number system allow only 0-7.");
                            System.out.println("Enter Octal number system again here: ");
                            value = scan.nextInt();
                            value_as_string = numberSystemConversion.Octal2Decimal(value);
                        }
                        System.out.print(value);
                        System.out.print(" = ");
                        System.out.print(value_as_string);
                        break;
                case 3: System.out.println("    Octal to Hexadecimal: ");
                        System.out.println("Enter number of Octal here: ");
                        value = scan.nextInt();
                        value_as_string = numberSystemConversion.Octal2Hexadecimal(value);
                        while (value_as_string == "Invalid number"){
                            System.out.println("Octal Number system allow only 0-7.");
                            System.out.println("Enter Octal number system again here: ");
                            value = scan.nextInt();
                            value_as_string = numberSystemConversion.Octal2Hexadecimal(value);
                        }
                        System.out.print(value);
                        System.out.print(" = ");
                        System.out.print(value_as_string);
                        break;

            }
        }

    /**
     * This function is use to go back to Menu or close program.
     * @param decision is user option: back to menu or close program.
     */
    static void ContinuousOrClose (int decision) {
        if (decision != 0 && decision == 1){
            createMenu();
        }else {
            return;
        }
    }

    public static void main(String[] args) {


        System.out.println("                        Welcome to ITE-Calculator"); // Label

            createMenu(); // display Menu and do process.

        // This do while use to call createMenu again and again until user want to stop.

            int decision; // user decision;
            do {
                System.out.println("\n Press 1 to back to Menu and Press any key to close program: ");
                decision = scan.nextInt();
                ContinuousOrClose(decision);
            }while (decision == 1);

       /*
            case 12 : System.out.println("Enter integer value here: ");
                        base = scan.nextLong(); // base type long
                        answer = Operators.Square2(base);
                        System.out.println("Answer = "+answer);
                        break;
            case 13 : System.out.println("Enter float value here: ");
                        Base = scan.nextDouble();
                        Answer = Double.parseDouble(df.format(Operators.Square2(Base)));
                        System.out.println("Answer = "+Answer);
                        break;
            case 14 : System.out.println("Enter integer value here:  ");
                        base =  scan.nextLong();
                        answer = operators.Square3(base);
                        System.out.println("Answer = "+answer);
                        break;
            case 15 : System.out.println("Enter float value here: ");
                        Base = scan.nextDouble();
                        Answer = Double.parseDouble(df.format(operators.Square3(Base)));
                        System.out.println("Answer = "+Answer);
                        break;
            case 16 : System.out.println("Enter float value here: ");
                        double degree = scan.nextDouble();
                        Answer = Double.parseDouble(df.format(operators.degree2Radian(degree)));
                        System.out.println("Answer = "+Answer);
         */
        }//end main function.


}// end main class.
