package first;
/*enum One21_25{} トップレベルで列挙型を宣言する場合はクラス同様アクセス修飾子はpublicもしくは修飾子なしの二択となる*/
public class One21_25 {
	//列挙型は実態はクラス。そのためメンバーにフィールドやメソッドの宣言も可能
	/*public*/ enum enumTest{//列挙型は暗黙的にfinalとなるので、finalやabstractは指定できない。
		//入れ子の列挙型は全ての修飾子をつけることが可能で、暗黙的にstaticの扱いとなる
		//void meth(){}ただし列挙定数はフィールドやメソッドの前に宣言する必要がある
		//列挙定数は暗黙的にpublic static finalとなるので、
		RED, GREEN, YELLOW;
		int hoge;
		String meth(){
			///23///
			String RED = enumTest.RED.name();
			String GREEN = enumTest.GREEN.name();
			enumTest yellow = enumTest.valueOf("YELLOW");
			return RED;
		}
		private enum enumNest{
			PURPLE,PLACK;
		}
	}

	///22///
	//public enum X_1 extends Y_2{}。列挙型はenumのサブクラスなのでクラス継承不可
//	public enum X_2 implements Y_2{}
	//public final enum X_3{}
	//public abstract enum X_4{}
//	private static enum X_5{}
//	public class Y_1{}
//	public interface Y_2{}
	///24///
	public void twentyFour() {
		for(enumTest e : enumTest.values()) {
			System.out.println(e.name() + ": " + e.ordinal());	
		}
	}
	//25//
	public enum Size {
		//S,M,L; ↓のような引数を取るタイプのコンストラクタを作っているので、引数を渡す必要がある
		S(1),M(5),L(10);
		private int value;
//		public Size(int value) {//コンパイルエラー。列挙型ではコンストラクタは必ずprivateである必要がある。そもそも列挙定数インスタンスはシングルトンかつ不変オブジェクトとしての設計を求められる
		private Size(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
}