import java.util.*;

public class simpleCalculator {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		calculator ob1 = calculator.getInstance();
		ob1.x = a;
		System.out.println(ob1.x);
		calculator ob2 = calculator.getInstance();
		System.out.println(ob2.x);
	}
}
