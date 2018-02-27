
public class TestBasicArithematics {

	public static void main(String[] args) {
		//Create an object
		BasicArithematics ba = new BasicArithematics();
		
		//sending a primitive value to the function
		int sq = ba.computesquare(5);
		System.out.println(sq);
		System.out.println(ba.computesquare(4));
		
		//call overloaded method
		double sqDouble = ba.computesquare(53438447.878778);
		System.out.println(sqDouble);
		System.out.println(ba.computesquare(6.4545));
		
		//sending an obj ref to the function
		ba.info= 200;
		System.out.println("Before manipulation"+ba.info);
		ba.manipulateInfo(ba);
		System.out.println("After manipulation"+ba.info);
		
		
		//String class understanding
		String name = "Vamshi";
		int x= name.length();
		System.out.println("Length is "+x);
		System.out.println("Char at 3 is "+name.charAt(3));
		System.out.println("index of h letter is "+name.indexOf('h'));
		System.out.println("Substring from 2 to 5 :"+name.substring(2,5));
		System.out.println("Equal string: "+name.equals("vamshi"));
		System.out.println("Equal string without casesensitive : "+name.equalsIgnoreCase("vamshi"));
		
		//understanding immutability in string
		String mutableString = "Vamshi";
		System.out.println("Original string : "+ mutableString);
		mutableString= mutableString.substring(2);
		System.out.println("Post substring : "+mutableString);
		
		String t= "java";
		t.concat(" Rules!");
		System.out.println("t = "+t);
		t=t.concat(" Rules!");
		System.out.println("t = "+ t);
		
		
		// mutability 
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" Rules!!");
		System.out.println("sb = "+sb);
		
	}

}
