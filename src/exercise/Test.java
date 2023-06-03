package exercise;

public class Test {
	
	public static void main(String[] args) {
		fruit("りんご", 5);
		fruit("梨", 8);
	}
	
	public static void fruit (String name, int piece) {
		System.out.println(name + "を" + piece + "個買いました。");
	}
	
}