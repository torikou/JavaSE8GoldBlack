package first;
//内部クラスの問題
//staticメンバークラスは内部クラスとは呼ばない
//メンバークラスはアクセス修飾子をつけることができる
public class One18 {
	static class X{}//staticメンバー・クラス
	private class Y{}//メンバー・クラス（内部クラス）
	public void doIt() {
		class Z{}//ローカル・クラス（内部クラス）
	}
}
