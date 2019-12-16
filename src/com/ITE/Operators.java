package com.ITE;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

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
       float Radian = (float) (Degree*(3.14/180));
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
        float Radian = (float) (Degree*(3.14/180));
        System.out.println(Radian);
        return Cos(Radian);
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

    // Create Function for using to call each of above Method to use in main function:
    /**
     * This function is use to call each operators from Arithmetic Operators Method.
     * @param option is an user choice from 1 to 5.
     */
        void calledArithmeticOperators(int option){
            // Declare variable for using:
                int A,B,answerAsInt;
                double answerAsDouble;
                Scanner scan = new Scanner(System.in);

            System.out.println("____________________________________");
            System.out.print("____________________________________");
            System.out.println(" ");
            switch (option){
                case 1 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    answerAsInt = Sum(A,B);
                    System.out.println("Answer = "+answerAsInt);
                    break;
                case 2 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    answerAsDouble = Divide(A,B);
                    System.out.println("Answer = "+answerAsDouble);
                    break;
                case 3 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    answerAsInt = Minus(A,B);
                    System.out.println("Answer = "+answerAsInt);
                    break;
                case 4 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    answerAsInt = Multiply(A,B);
                    System.out.println("Answer = "+answerAsInt);
                    break;
                case 5 : System.out.println("Enter Number for A and B:");
                    A = scan.nextInt();
                    B = scan.nextInt();
                    answerAsInt = Modulo(A,B);
                    System.out.println("Answer = "+answerAsInt);
                    break;
            }
        }
    /**
     * This function is use to call each operators from Trigonometric Method.
     * @param option is an user choice from 1 to 6
     */
        void calledTrigonometricOperators(int option){
            // declare some variable to use for receiving result from each function:
                float Radian;
                double Answer;
                int Degree;
                Scanner scan = new Scanner(System.in);

            switch (option){
                case 1 : System.out.println("Enter Value of Radian: ");
                    Radian = scan.nextFloat();
                    Answer = Double.parseDouble(df.format(Sin(Radian)));
                    System.out.println("Answer = "+Answer);
                    break;
                case 2 : System.out.println("Enter number of Degree: ");
                    Degree = scan.nextInt();
                    Answer =  Double.parseDouble(df.format(Sind(Degree)));
                    System.out.println("Answer = "+Answer);
                    break;
                case 3 : System.out.println("Enter number of Radian: ");
                    Radian = scan.nextFloat();
                    Answer = Double.parseDouble(df.format(Cos(Radian)));
                    System.out.println("Answer ="+Answer);// format Answer into 0.00 less than before.
                    break;
                case 4 : System.out.println("Enter number of Degree: ");
                    Degree = scan.nextInt();
                    Answer = Double.parseDouble(df.format(Cosd(Degree)));
                    System.out.println("Answer = "+Answer);
                    break;
                case 5 : System.out.println("Enter number of Radian: ");
                    Radian = scan.nextFloat();
                    Answer = Double.parseDouble(df.format(tan(Radian)));
                    System.out.println("Answer = "+Answer);
                    break;
                case 6 : System.out.println("Enter number of Degree: ");
                    Degree = scan.nextInt();
                    Answer = Double.parseDouble(df.format(tand(Degree)));
                    System.out.println("Answer = "+Answer);
                    break;
            }
    }
}

