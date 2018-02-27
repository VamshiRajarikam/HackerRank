import java.util.Scanner;

public class TestArithematics {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers");
		a=sc.nextInt();
		b=sc.nextInt();
		Arithematics ar = new Arithematics(); // Arithematic() is the constructor function
		// sending the primitive values to the method/function
		int add = ar.addition(a, b);
		int sub = ar.subtraction(a, b);
		int mul = ar.multiplication(a, b);
		int div = ar.division(a, b);
		int square= ar.square(a);
		System.out.println("Addition "+add+"\n"+"Subtraction "+sub+"\n"+"Multiplication "+mul+"\n"+"Division "+div+"\n"+"Square "+square);
		
		//sending an object ref to the function
		ar.info=200;
		System.out.println("Before manipulation"+ar.info);
		ar.manipulateab(ar);
		System.out.println("After manipulation"+ar.info);
	}

}
