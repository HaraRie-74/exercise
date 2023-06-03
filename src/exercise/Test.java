package exercise;

public class Test {

	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4};
		arrayTest(array);
		for (int value : array) {
			System.out.println(value);
		}
	}

		public static void arrayTest(int [] array) {
			for (int i = 0; i < array.length; i++) {
				array[i] ++;
			}
		}

}