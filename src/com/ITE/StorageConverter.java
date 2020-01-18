package com.ITE;
import java.lang.Math;
import java.util.Scanner;

public class StorageConverter {

    // Byte to any various type:

    /**
     * This Method is use to to convert from byte to kilobyte.
     * @param numByte take value as long data type
     * @return value as double.
     */
    double byte2KB (long numByte){
        return  (double) numByte / 1024;
    }

    /**
     * This Method is use to to convert from byte to MB.
     * @param numByte take value as long data type
     * @return value as double
     */
    double byte2MB (long numByte){
        return  (double) numByte / (1024 * 1024);
    }

    /**
     * This Method is use to to convert from byte to GB.
     * @param numByte take value as long data type
     * @return value as double
     */
    double byte2GB (long numByte){
        return (double) numByte / (Math.pow(1024,3));
    }

    /**
     * This Method is use to convert from byte to TB.
     * @param numByte take value as long data type
     * @return value as double.
     */
    double byte2TB (long numByte){
        return (double) numByte / (Math.pow(1024,4));
    }

    /**
     * This method is use to convert from byte to PB.
     * @param numByte take value as long data type.
     * @return value as double.
     */
    double byte2PB (long numByte){
        return (double) numByte / (Math.pow(1024,5));
    }

    // Kilobyte to any various type:
    /**
     * This Method is use to to convert from KB to Byte.
     * @param kilobyte take value as long data type
     * @return value as double
     */
    double kb2Byte(long kilobyte){
        return (double) kilobyte * 1024;
    }

    /**
     * This Method is use to to convert from KB to MB.
     * @param kilobyte take value as long data type
     * @return value as double
     */
    double kb2MB (long kilobyte){
        return (double) kilobyte / 1024;
    }

    /**
     * This Method is use to to convert from KB to GB.
     * @param kilobyte take value as long data type
     * @return value as double
     */
    double kb2GB (long kilobyte){
        return (double) kilobyte / Math.pow(1024,2);
    }

    /**
     * This Method is use to to convert from KB to TB.
     * @param kilobyte take value as long data type
     * @return value as double
     */
    double kb2TB (long kilobyte){
        return (double) kilobyte / Math.pow(1024,3);
    }

    /**
     * This Method is use to convert from KB to PB
     * @param kilobyte take value as long data type
     * @return value as double
     */
    double kb2PB (long kilobyte){
        return (double) kilobyte / Math.pow(1024,4);
    }

    // Megabyte to any various type:

    /**
     * THis Method is use to convert from MB to Byte
     * @param Megabyte take value as long data type
     * @return value as double
     */
    double mb2Byte (long Megabyte){
        return (double) Megabyte * Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from MB to KB
     * @param Megabyte take value as long data type
     * @return value as double
     */
    double mb2KB (long Megabyte){
        return (double) Megabyte * Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from MB to GB
     * @param Megabyte take value as long data type
     * @return value as double
     */
    double mb2GB (long Megabyte){
        return (double) Megabyte / Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from MB to TB
     * @param Megabyte take value as long data type
     * @return value as double
     */
    double mb2TB (long Megabyte){
        return (double) Megabyte / Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from MB to PB
     * @param Megabyte take value as long data type
     * @return value as double
     */
    double mb2PB (long Megabyte){
        return (double) Megabyte / Math.pow(1024,3);
    }

    // Gigabyte to any various type:

    /**
     * This Method is use to convert from GB to Byte
     * @param gigabyte take value as long data type
     * @return value as double
     */
    double gb2byte (long gigabyte){
        return (double) gigabyte * Math.pow(1024,3);
    }

    /**
     * This Method is use to convert from GB to KB
     * @param gigabyte take value as long data type
     * @return value as double
     */
    double gb2KB (long gigabyte){
        return (double) gigabyte * Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from GB to MB
     * @param gigabyte take value as long data type
     * @return value as double
     */
    double gb2MB (long gigabyte){
        return (double) gigabyte * Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from GB to TB
     * @param gigabyte take value as long data type
     * @return value as double
     */
    double gb2TB (long gigabyte){
        return (double) gigabyte / Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from GB to PB
     * @param gigabyte take value as long data type
     * @return value as double
     */
    double gb2PB (long gigabyte){
        return (double) gigabyte / Math.pow(1024,2);
    }

    // Terabyte to any various type:
    /**
     * This Method is use to convert from TB to Byte
     * @param terabyte take value as long data type
     * @return value as double
     */
    double tb2Byte (long terabyte){
        return (double) terabyte * Math.pow(1024,4);
    }

    /**
     * This Method is use to convert from TB to KB
     * @param terabyte take value as long data type
     * @return value as double
     */
    double tb2KB (long terabyte){
        return (double) terabyte * Math.pow(1024,3);
    }

    /**
     * This Method is use to convert from TB to MB
     * @param terabyte take value as long data type
     * @return value as double
     */
    double tb2MB (long terabyte){
        return (double) terabyte * Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from TB to GB
     * @param terabyte take value as long data type
     * @return value as double
     */
    double tb2GB (long terabyte){
        return (double) terabyte * Math.pow(1024,1);
    }

    /**
     * This Method is use to convert from TB to PB
     * @param terabyte take value as long data type
     * @return value as double
     */
    double tb2PB (long terabyte){
        return (double) terabyte / 1024;
    }

    // Petabyte to any various type:

    /**
     * This Method is use to convert from PB to Byte
     * @param petabyte take value as long data type
     * @return value as double
     */
    double pb2Byte (long petabyte){
        return (double) petabyte * Math.pow(1024,5);
    }

    /**
     * This Method is use to convert from PB to KB
     * @param petabyte take value as long data type
     * @return value as double
     */
    double pb2KB (long petabyte){
        return (double) petabyte * Math.pow(1024,4);
    }

    /**
     * This Method is use to convert from PB to MB
     * @param petabyte take value as long data type
     * @return value as double
     */
    double pb2MB (long petabyte){
        return (double) petabyte * Math.pow(1024,3);
    }

    /**
     * This Method is use to convert from PB to GB
     * @param petabyte take value as long data type
     * @return value as double
     */
    double pb2GB (long petabyte){
        return  (double) petabyte * Math.pow(1024,2);
    }

    /**
     * This Method is use to convert from PB to TB
     * @param petabyte take value as long data type
     * @return value as double
     */
    double pb2TB (long petabyte){
        return (double) petabyte * Math.pow(1024,1);
    }

    // Create Function for using to call each of above Method to use in main function:
    /**
     * This function is use to call each converter method from StorageConverter class to use in main class.
     * Menu Option:
     *      1. Byte
     *      2. KiloByte
     *      3. MegaByte
     *      4. GigaByte
     *      5. TeraByte
     *      6. PetaByte
     * @param menuOption is an user choice from 1 to 6
     * @param converter is an specific converter option (number represented shown in menu)
     */
    void calledStorageConverter (int menuOption,int converter){
        switch (menuOption){
            case 1: Byte(converter); break;
            case 2: Kilobyte(converter); break;
            case 3: Megabyte(converter); break;
            case 4: Gigabyte(converter); break;
            case 5: Terabyte(converter); break;
            case 6: Petabyte(converter); break;
        }
    }

    // Bitwise Operator subMenu:
        // For using to receive result or answer from each method:
        private int numberForConvert;
        private double Answer;
        Scanner scan = new Scanner(System.in);
    /**
     * This storageConverterSubMenu have ability to find option that Match it
     * then display its sub Menu.
     * @param option is user option that pass from CreateMenu() in case 4.
     */
    void storageConverterSubMenu(int option){
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

    /**
     * This Byte Method group all byte Converter.
     * Option:
     *      1. Byte to Kilobyte
     *      2. Byte to Megabyte
     *      3. Byte to Gigabyte
     *      4. Byte to Terabyte
     *      5. Byte to Petabyte
     * @param convertOption take option as integer.
     */
    private void Byte (int convertOption){
        switch (convertOption){
            case 1: System.out.println("    Byte To Kilobyte: ");
                System.out.println("\nEnter Number of Byte here : ");
                numberForConvert = scan.nextInt();
                Answer = byte2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" byte = ");
                System.out.print(Answer);
                System.out.print(" KB");
                break;
            case 2: System.out.println("    Byte To Megabyte: ");
                System.out.println("\nEnter Number of Byte here : ");
                numberForConvert = scan.nextInt();
                Answer = byte2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" byte = ");
                System.out.print(Answer);
                System.out.print(" MB");
                break;
            case 3: System.out.println("    Byte To Gigabyte: ");
                System.out.println("\nEnter Number of Byte here : ");
                numberForConvert = scan.nextInt();
                Answer = byte2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" byte = ");
                System.out.print(Answer);
                System.out.print(" GB");
                break;
            case 4: System.out.println("    Byte To Terabyte: ");
                System.out.println("\nEnter Number of Byte here : ");
                numberForConvert = scan.nextInt();
                Answer = byte2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" byte = ");
                System.out.print(Answer);
                System.out.print(" TB");
                break;
            case 5: System.out.println("    Byte To Petabyte: ");
                System.out.println("\nEnter Number of Byte here : ");
                numberForConvert = scan.nextInt();
                Answer = byte2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" byte = ");
                System.out.print(Answer);
                System.out.print(" PB");
                break;
        }
    }

    /**
     * This Kilobyte Method group all Kilobyte Converter.
     * Option:
     *      1. KiloByte to Byte
     *      2. KiloByte to Megabyte
     *      3. KiloByte to Gigabyte
     *      4. KiloByte to Terabyte
     *      5. KiloByte to Petabyte
     * @param convertOption take option as integer.
     */
    private void Kilobyte (int convertOption){
        switch (convertOption){
            case 1: System.out.println("    Kilobyte To Byte: ");
                System.out.println("\nEnter Number of Kilobyte here : ");
                numberForConvert = scan.nextInt();
                Answer = kb2Byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" KB = ");
                System.out.print(Answer);
                System.out.print(" Byte");
                break;
            case 2: System.out.println("    Kilobyte To Megabyte: ");
                System.out.println("\nEnter Number of Kilobyte here : ");
                numberForConvert = scan.nextInt();
                Answer = kb2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" KB = ");
                System.out.print(Answer);
                System.out.print(" MB");
                break;
            case 3: System.out.println("    Kilobyte To Gigabyte: ");
                System.out.println("\nEnter Number of Kilobyte here : ");
                numberForConvert = scan.nextInt();
                Answer = kb2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" KB = ");
                System.out.print(Answer);
                System.out.print(" GB");
                break;
            case 4: System.out.println("    Kilobyte To Terabyte: ");
                System.out.println("\nEnter Number of Kilobyte here : ");
                numberForConvert = scan.nextInt();
                Answer = kb2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" KB = ");
                System.out.print(Answer);
                System.out.print(" TB");
                break;
            case 5: System.out.println("    Kilobyte To Petabyte: ");
                System.out.println("\nEnter Number of Kilobyte here : ");
                numberForConvert = scan.nextInt();
                Answer = kb2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" KB = ");
                System.out.print(Answer);
                System.out.print(" PB");
                break;
        }
    }

    /**
     * This Megabyte Method group all Megabyte Converter.
     * Option:
     *      1. MegaByte to Byte
     *      2. MegaByte to Kilobyte
     *      3. MegaByte to Gigabyte
     *      4. MegaByte to Terabyte
     *      5. MegaByte to Petabyte
     * @param convertOption take option as integer.
     */
    private void Megabyte (int convertOption){
        switch (convertOption){
            case 1: System.out.println("    Megabyte To Byte: ");
                System.out.println("\nEnter Number of Megabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = mb2Byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" MB = ");
                System.out.print(Answer);
                System.out.print(" Byte");
                break;
            case 2: System.out.println("    Megabyte To Kilobyte: ");
                System.out.println("\nEnter Number of Megabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = mb2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" MB = ");
                System.out.print(Answer);
                System.out.print(" KB");
                break;
            case 3: System.out.println("    Megabyte To Gigabyte: ");
                System.out.println("\nEnter Number of Megabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = mb2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" MB = ");
                System.out.print(Answer);
                System.out.print(" GB");
                break;
            case 4: System.out.println("    Megabyte To Terabyte: ");
                System.out.println("\nEnter Number of Megabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = mb2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" MB = ");
                System.out.print(Answer);
                System.out.print(" TB");
                break;
            case 5: System.out.println("    Megabyte To Petabyte: ");
                System.out.println("\nEnter Number of Megabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = mb2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" MB = ");
                System.out.print(Answer);
                System.out.print(" PB");
                break;
        }
    }

    /**
     * This Gigabyte Method group all Gigabyte Converter.
     * Option:
     *      1. GigaByte to Byte
     *      2. GigaByte to Kilobyte
     *      3. GigaByte to Megabyte
     *      4. GigaByte to Terabyte
     *      5. GigaByte to Petabyte
     * @param convertOption take option as integer.
     */
    private void Gigabyte (int convertOption){
        switch (convertOption){
            case 1: System.out.println("    Gigabyte To Byte: ");
                System.out.println("\nEnter Number of Gigabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = gb2byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" GB = ");
                System.out.print(Answer);
                System.out.print(" Byte");
                break;
            case 2: System.out.println("     Gigabyte To Kilobyte: ");
                System.out.println("\nEnter Number of Gigabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = gb2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" GB = ");
                System.out.print(Answer);
                System.out.print(" KB");
                break;
            case 3: System.out.println("     Gigabyte To Megabyte: ");
                System.out.println("\nEnter Number of  Gigabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = gb2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" GB = ");
                System.out.print(Answer);
                System.out.print(" MB");
                break;
            case 4: System.out.println("     Gigabyte To Terabyte: ");
                System.out.println("\nEnter Number of Gigabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = gb2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" GB = ");
                System.out.print(Answer);
                System.out.print(" TB");
                break;
            case 5: System.out.println("     Gigabyte To Petabyte: ");
                System.out.println("\nEnter Number of  Gigabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = gb2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" GB = ");
                System.out.print(Answer);
                System.out.print(" PB");
                break;
        }
    }

    /**
     * This Terabyte Method group all Terabyte Converter.
     * Option:
     *      1. TeraByte to Byte
     *      2. TeraByte to Kilobyte
     *      3. TeraByte to Megabyte
     *      4. TeraByte to Gigabyte
     *      5. TeraByte to Petabyte
     * @param convertOption take option as integer.
     */
    private void Terabyte (int convertOption){
        switch (convertOption){
            case 1: System.out.println("    Terabyte To Byte: ");
                System.out.println("\nEnter Number of Terabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = tb2Byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" TB = ");
                System.out.print(Answer);
                System.out.print(" Byte");
                break;
            case 2: System.out.println("     Terabyte To Kilobyte: ");
                System.out.println("\nEnter Number of Terabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = tb2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" TB = ");
                System.out.print(Answer);
                System.out.print(" KB");
                break;
            case 3: System.out.println("     Terabyte To Megabyte: ");
                System.out.println("\nEnter Number of  Terabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = tb2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" TB = ");
                System.out.print(Answer);
                System.out.print(" MB");
                break;
            case 4: System.out.println("     Terabyte To Gigabyte: ");
                System.out.println("\nEnter Number of Terabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = tb2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" TB = ");
                System.out.print(Answer);
                System.out.print(" GB");
                break;
            case 5: System.out.println("     Terabyte To Petabyte: ");
                System.out.println("\nEnter Number of  Terabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = tb2PB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" TB = ");
                System.out.print(Answer);
                System.out.print(" PB");
                break;
        }
    }

    /**
     * This Petabyte Method group all Petabyte Converter.
     * Option:
     *      1. PetaByte to Byte
     *      2. PetaByte to Kilobyte
     *      3. PetaByte to Megabyte
     *      4. PetaByte to Gigabyte
     *      5. PetaByte to Terabyte
     * @param convertOption take option as integer.
     */
    private void Petabyte (int convertOption){
        switch (convertOption){
            case 1: System.out.println("    Petabyte To Byte: ");
                System.out.println("\nEnter Number of Petabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = pb2Byte(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" PB = ");
                System.out.print(Answer);
                System.out.print(" Byte");
                break;
            case 2: System.out.println("     Petabyte To Kilobyte: ");
                System.out.println("\nEnter Number of Petabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = pb2KB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" PB = ");
                System.out.print(Answer);
                System.out.print(" KB");
                break;
            case 3: System.out.println("     Petabyte To Megabyte: ");
                System.out.println("\nEnter Number of  Petabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = pb2MB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" PB = ");
                System.out.print(Answer);
                System.out.print(" MB");
                break;
            case 4: System.out.println("     Petabyte To Gigabyte: ");
                System.out.println("\nEnter Number of Petabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = pb2GB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" PB = ");
                System.out.print(Answer);
                System.out.print(" GB");
                break;
            case 5: System.out.println("     Petabyte To Terabyte: ");
                System.out.println("\nEnter Number of  Petabyte here : ");
                numberForConvert = scan.nextInt();
                Answer = pb2TB(numberForConvert); // use Answer as double to store coz some value that return is small than 1.
                System.out.print(numberForConvert);
                System.out.print(" PB = ");
                System.out.print(Answer);
                System.out.print(" TB");
                break;
        }
    }
}
