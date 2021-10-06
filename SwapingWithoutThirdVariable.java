package week1.day2;

public class SwapingWithoutThirdVariable {

	public static void main(String[] args) {
int x=3;
int y=4;
int t;
x=x+y;
y=x-y;
x=x-y;
System.out.println(x);
System.err.println(y);
	}

}
