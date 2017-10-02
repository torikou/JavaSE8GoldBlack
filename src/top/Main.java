package top;
import first.*;

public class Main {
	public static void main(String[] args) {
		//1st
		//One19 one19 = new One19();
		first.One19.Inner inner = new One19().new Inner();
		inner.doIt();
		first.One21_25 oneTwentyFourTwentyFive = new One21_25();
		oneTwentyFourTwentyFive.twentyFour();
	}
}
