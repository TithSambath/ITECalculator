package com.ITE;
import java.lang.Math;
import java.text.DecimalFormat;

/**
 * Operator: This class contain all arithmetic operations.
 */
public class Operators {

    // create casting object: 0.00000 -> 0.00 or 0.0
       static DecimalFormat df = new DecimalFormat("0.00");// use df.format(Radian) to cast

    /**
     * This Sum function use for summation between 2 variable
     * @param a the first number.
     * @param b the second number.
     * @return it return a+b (output as integer).
     */
    int Sum(int a,int b){
        return a + b;
    }

    /**
     * This Divide function is used for divide number between 2 variable
     * @param a the first number.
     * @param b the second number.
     * @return it return a/b (output as double).
     */
    double Divide(int a, int b){
        return (double) a / b;
    }

    /**
     * This Minus Method is used for subtract number between 2 variable
     * @param a the first value or number
     * @param b the second value or number
     * @return it return a - b (output as int)
     */
    int Minus(int a, int b){
        return a - b;
    }

    /**
     * This Method is use to Multiply 2 variable.
     * @param a first value
     * @param b second value
     * @return it return a * b (output as int)
     */
    int Multiply(int a, int b){
        return a * b;
    }

    /**
     * This Method is use to find the remainder of a division of one number by another.
     * @param a first value.
     * @param b second value.
     * @return it return the remainder as an integer.
     */
    int Modulo(int a, int b){
        return a % b;
    }

    /**
     * This Method is use to find Sinus of radian.
     * @param Radian is the value around the circle for ex: PI/2,...
     * @return it return the value of the Sin of radian as a floating point.
     */
    float Sin (float Radian){
        return (float)Math.sin(Radian);
    }

    /**
     * This Method is use to find the Value of Sin in any Angle.
     * @param Degree is the Angle but in the form of degree not radian.
     * @return it return the value of the Sin of an Angle.
     */
    float Sind(int Degree){
       float Radian = (float) (Degree*(Math.PI/180));
       return (float) Math.sin(Double.parseDouble(df.format(Radian)));
       // Double.parseDouble mean to cast value from string to double value.
    }

    /**
     * This Method is use to find the cos of any angle in the form of Randian.
     * @param Radian is the angle in the form of radian.
     * @return it return the value of the Cos of an Angle.
     */
    float Cos(float Radian){
        return (float)Math.cos(Radian);
    }

    /**
     * This Method is use to find the cos of any angle in the form of Degree.
     * @param Degree is the angle in the form of degree.
     * @return it return the value of the Cos of an Angle(Degree);
     */
    float Cosd(int Degree){
        float Radian = (float) (Degree*(Math.PI/180));
        return (float)Math.cos(Radian);
    }

    /**
     * This Method is use to find the tan of any angle in the form of Radian.
     * @param Radian is the Angle of circle.
     * @return it return the value of tan of an angle.
     */
    float tan(float Radian){
        return (float)Math.tan(Radian);
    }

    /**
     * This Method is use to find the tan of any angle in the form of Degree.
     * @param Degree is the Angle of the circle in the form of Degree.
     * @return it return the value of tan of a degree angle(return datatype as float).
     */
    float tand(int Degree){
        return (float)Math.tan(Math.toRadians(Degree));
    }

    /**
     * This Square2 Method is use to Multiply the value twice.(for Integer type long)
     * @param Base is the number that we want to multiply twice.
     * @return it return the value as type long.
     */
    long Square2(long Base){
        return (long)Math.pow(Base,2);
    }

    /**
     * This Square2 Method is use to Multiply the value twice.(for floating point type double)
     * @param Base is the number that we want to multiply twice.
     * @return it return the value as type double.
     */
    double Square2(double Base){
        return Math.pow(Base,2.0);
    }

    /**
     * This square3 is use to Multiply the value triple time.(for Integer type long.
     * @param Base is the number that we want to multiply triple.
     * @return it return the value as type long.
     */
    long Square3(long Base){
        return (long)Math.pow(Base,3);
    }

    /**
     * This square3 is use to Multiply the value triple time.(for Integer type double).
     * @param Base is the number that we want to multiply triple.
     * @return it return the value as type double.
     */
    double Square3(double Base){
        return Math.pow(Base,3);
    }

    /**
     * This Method is use to convert angle in degree to radian.
     * @param Degree is angle as degree.
     * @return it return the value as radian (output type double).
     */
    double degree2Radian(double Degree){
        return Math.toRadians(Degree);
    }
}

