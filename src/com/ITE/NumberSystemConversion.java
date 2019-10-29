package com.ITE;
import sun.security.provider.certpath.OCSP;

import java.lang.Integer.*;
import java.util.function.BinaryOperator;

/**
 * This class is consist of wide range to perform conversion.
 */
public class NumberSystemConversion {

    private int decimal;


    String binary2Decimal (int binary){
        String binary_as_string = Integer.toString(binary);
        int Decimal_as_number = Integer.parseInt(binary_as_string,2);
        String Decimal_as_string = Integer.toString(Decimal_as_number);
        return Decimal_as_string;
    }

    String binary2Octal (int binary){
        String Decimal_as_string = binary2Decimal(binary);
        int Decimal_as_number = Integer.parseInt(Decimal_as_string,10);
        String Octal_as_string = Integer.toOctalString(Decimal_as_number);
        return Octal_as_string;
    }

    String binary2Hexadecimal (int binary){
        String Decimal_as_string = binary2Decimal(binary);
        int Decimal_as_number = Integer.parseInt(Decimal_as_string);
        String  Hexadecimal_as_string = Integer.toHexString(Decimal_as_number);
        return Hexadecimal_as_string;
    }

    String Octal2Decimal (int Octal){
        String octal = Integer.toString(Octal);
        String Decimal = Integer.toString(Integer.parseInt(octal,8));
        return Decimal;
    }

    String Octal2Binary (int octal) {
        String Decimal_as_string = Octal2Decimal(octal);
        int Decimal_as_number = Integer.parseInt(Decimal_as_string);
        String Binary_as_string = Integer.toBinaryString(Decimal_as_number);
        return Binary_as_string;
    }

    String Octal2Hex (int octal) {
        String Decimal_as_string = Octal2Decimal(octal);
        int Decimal_as_number = Integer.parseInt(Decimal_as_string);
        String Hexadecimal_as_string = Integer.toHexString(Decimal_as_number);
        return Hexadecimal_as_string;
    }


}
