package main;

public class Calc {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int total = logics.CalcLogic.tasu(a, b);
		int dalta = logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + dalta);
	}

}