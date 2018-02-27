import java.util.Scanner;

public class FindSquare {
	
	  static int square(int x){
		int y= x*x;
		return y;
	}
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter an integer");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int result= FindSquare.square(n);
		System.out.println(result);

	}

}
