package exercise;

public class Test {
	
	public static void main(String[] args) {
		introduceOneself();
		String title = "こんにちは";
		String adress = "javajava1111@gmail.com";
		String text = "これから宜しく！";
		email(title, adress, text);
		email(adress, text);
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println(triangleArea);
		double circleArea = calcCircleArea(5.0);
		System.out.println(circleArea);
		
	}

	public static void introduceOneself() {
		String name = "ああああ　あああ";
		int age = 22;
		double height = 157.5;
		String gender = "女";
		System.out.println("私の名前は" + name + "です。");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
	}
	
	public static void email(String adress, String text) {
		System.out.println(adress + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = bottom * height / 2;
		return triangleArea;
	}
	
	public static double calcCircleArea(double radius) {
		double circleArea = radius *radius * 3.14;
		return circleArea;
	}

}