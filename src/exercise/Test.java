package exercise;

public class Test {

	public static void main(String[] args) {
		System.out.println("【数あてゲーム】");
		int ans = (int)(Math.random() * 10);
		for (int i = 0; i < 5; i++) {
			System.out.println("０～９の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います。");
			}
		}
		System.out.println("ゲームを終了します");
	}
}