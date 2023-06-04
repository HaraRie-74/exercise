package main;
import logics.CalcLogic;
//このソースコードで CalcLogic という表記が合ったら、それはlogics.CalcLogicのことだと解釈しなさいという指示

//import logics.CalcLogic;
//logicsパッケージに所属する全てのクラスをインポートしたいとき

public class Calc {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int total = CalcLogic.tasu(a, b);
		int dalta = CalcLogic.hiku(a, b);
//		importでパッケージを読み込んでいるので、クラス.メソッドのみでOK
		System.out.println("足すと" + total + "、引くと" + dalta);
	}

}