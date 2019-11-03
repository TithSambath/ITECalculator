package com.ITE;
import sun.security.provider.certpath.OCSP;

import java.lang.Integer.*;
import java.util.function.BinaryOperator;

/**
 * This class is consist of wide range to perform conversion.
 */
public class NumberSystemConversion {

    /*
       Instruction to convert from one number system to another:
            1.Think of the user input value as any number system
              depend on each parameter of the function that its
              use.
            2.Convert all those number system by using
               all this (Predefine function) function
                Integer.parseInt();
                Integer.toString();
                Integer.toHex();
                Integer.toBinaryString();
                //This 4 function above take string as a parameter.//
               also use this user-define function: binary2Decimal(int binary);
               to convert all any number system to decimal then convert it to
               what user number system want.
     */
// Binary number system conversion:
    /**
     * This binary2Decimal is use to convert from Binary system to Decimal system.
     * @param binary take user input as a binary system.(only 0 and 1)
     * @return value of decimal as string.
     */
    String binary2Decimal (int binary){
        //if(binary % 10 == 0 || binary % 10 == 1){
        try{
            String binary_as_string = Integer.toString(binary);
            int Decimal_as_number = Integer.parseInt(binary_as_string,2);

            String Decimal_as_string = Integer.toString(Decimal_as_number);
            return Decimal_as_string;
        }catch(Exception exception){
            return "Invalid number";
        }
    }

    /**
     * This binary2Octal is use to convert from Binary system to Octal system.
     * @param binary take user input as a binary system.(Accept only 0 and 1)
     * @return value of Octal as string.
     */
    String binary2Octal (int binary){
        try{
            String Decimal_as_string = binary2Decimal(binary);
            int Decimal_as_number = Integer.parseInt(Decimal_as_string,10);
            String Octal_as_string = Integer.toOctalString(Decimal_as_number);
            return Octal_as_string;
        }catch (Exception exception){
            return "Invalid number";
        }
    }

    /**
     * This binary2Octal is use to convert from Binary system to Hexadecimal system.
     * @param binary take user input as a binary system.(Accept only 0 and 1)
     * @return value of Hexadecimal as string.
     */
    String binary2Hexadecimal (int binary){
        try{
            String Decimal_as_string = binary2Decimal(binary);
            int Decimal_as_number = Integer.parseInt(Decimal_as_string);
            String  Hexadecimal_as_string = Integer.toHexString(Decimal_as_number);
            return Hexadecimal_as_string;
        }catch (Exception exception){
            return "Invalid number";
        }
    }

// Octal number system conversion:
    /**
     * This Octal2Decimal is use to convert from octal system to decimal system.
     * @param Octal take user input as a octal sytem.
     * @return value of Decimal as string.
     */
    String Octal2Decimal (int Octal){
        try{
            String octal_as_string = Integer.toString(Octal);
            String Decimal_as_string = Integer.toString(Integer.parseInt(octal_as_string,8));
            return Decimal_as_string;
        }catch (Exception exception){
            return "Invalid number";
        }
    }

    /**
     * This Octal2Binary is use to convert from octal system to Binary system.
     * @param octal take user input value as an octal system.
     * @return value of Binary as string.
     */
    String Octal2Binary (int octal) {
        try{
            String Decimal_as_string = Octal2Decimal(octal);
            int Decimal_as_number = Integer.parseInt(Decimal_as_string);
            String Binary_as_string = Integer.toBinaryString(Decimal_as_number);
            return Binary_as_string;
        }catch (Exception exception){
            return "Invalid number";
        }
    }

    /**
     * This Octal2Hexadecimal is use to convert from octal system to Binary system.
     * @param octal take user input value as an octal system.
     * @return value of Hexadecimal as string.
     */
    String Octal2Hexadecimal (int octal) {
        try{
            String Decimal_as_string = Octal2Decimal(octal);
            int Decimal_as_number = Integer.parseInt(Decimal_as_string);
            String Hexadecimal_as_string = Integer.toHexString(Decimal_as_number);
            return Hexadecimal_as_string;
        }catch (Exception exception){
            return "Invalid number";
        }
    }


}
