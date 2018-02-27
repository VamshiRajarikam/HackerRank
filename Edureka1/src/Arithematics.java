
public class Arithematics {
	int info;
	int addition(int x, int y){
		return x+y;
	}
	int subtraction(int x,int y){
		if(x>y)
		return x-y;
		else
		return y-x;
	}
	int multiplication(int x, int y){
		return x*y;
	}
	int division(int x, int y){
		return x/y;
	}
	int modulous(int x, int y){
		return x%y;
	}
	int square(int x){
		return x*x;
	}
	
	void manipulateab(Arithematics ar){
		ar.info=65;
	}
}
