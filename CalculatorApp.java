package com.global.myApplication;

import java.util.Scanner;
import javax.validation.constraints.NotNull;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculatorface cf=(@NotNull var x,@NotNull var y,@NotNull var z)->{
			int r=0;
			switch(z) {
			case "+":r=x+y;break;
			case "-":r=x-y;break;
			case "*":r=x*y;break;
			case "/":r=x/y;break;
			}
			return r;
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st operand");
		int op1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter 2nd operand");
		int op2=Integer.parseInt(sc.nextLine());
        System.out.println("Enter math operator");
        String opp=sc.nextLine();
        int result=cf.performCalculation(op1, op2, opp);
        System.out.println("The result"+result);
	}

}
