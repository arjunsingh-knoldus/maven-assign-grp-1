package com.knoldus;
/**
 * Calculator
 * exposes API to perform +, -, *, / operations on 2 integer operands
 */
 
public class Calculator {

    public static int add( int leftOperand, int rightOperand){
        return leftOperand + rightOperand;
    }
    public static int subtract( int leftOperand, int rightOperand){
        return leftOperand - rightOperand;
    }
    public static int multiply( int leftOperand, int rightOperand){
        return leftOperand * rightOperand;
    }
    public static int divide( int leftOperand, int rightOperand){
        return leftOperand / rightOperand;
    }
}
