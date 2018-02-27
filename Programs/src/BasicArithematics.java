
public class BasicArithematics {
	int info;
	
	//functionality
	int computesquare(int value){
		return value*value;
	}
	
	//overloaded method
	double computesquare(double value){
		return value*value;
	}
	
	//method accepting ref of an obj
	void manipulateInfo(BasicArithematics cat){
		cat.info=34;
	}

}
