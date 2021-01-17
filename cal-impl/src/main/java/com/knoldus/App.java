package com.knoldus;

import com.knoldus.Calculator;
/**
 * Main Application driver class
 *
 */
public class App {
    public static void main( String[] args ){

        int leftOperand = 999, rightOperand = 33; 

        System.out.println( "Calculator Demo: " );

        System.out.printf( "\t %d + %d = %d \n", leftOperand, rightOperand, Calculator.add(leftOperand, rightOperand));
        System.out.printf( "\t %d - %d = %d \n", leftOperand, rightOperand, Calculator.subtract(leftOperand, rightOperand));
        System.out.printf( "\t %d / %d = %d \n", leftOperand, rightOperand, Calculator.divide(leftOperand, rightOperand));
        System.out.printf( "\t %d * %d = %d \n", leftOperand, rightOperand, Calculator.multiply(leftOperand, rightOperand));
    }
}
