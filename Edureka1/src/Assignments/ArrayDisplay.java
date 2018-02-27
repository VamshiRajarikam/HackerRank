package Assignments;
import java.util.Scanner;
public class ArrayDisplay{
    static void display(int id[], String name[], double salary[]){
        System.out.println("ID      Name        Salary");
		int len= id.length;
        for(int i=0;i<len;i++){
            System.out.println(id[i]+"\t"+name[i]+"\t\t"+salary[i]);
        }
		
    }
    static void display( int id[], String name[]){
    	int len = id.length;
    	System.out.println("ID        Name");
    	for(int i=0;i<len;i++){
    		System.out.println(id[i]+"\t"+name[i]);
    	}
    }
    static void display(String name1, int id[], String name[], double salary[]){
    	System.out.println("ID        Name      Salary");
    	for(int i=0; i<5;i++){
    		if(name[i].equals(name1)){
    			System.out.println(id[i]+"\t"+name[i]+"\t"+ salary[i]);
    		}
    	}
    	
    }
     public static void main(String []args){
        int [] id = new int[5];
        String [] name = new String[5];
        double [] salary = new double[5];
		// Data accepting
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter ID, Name, Salary");
            id[i]= sc.nextInt();
            name[i]=sc.next();
            salary[i]=sc.nextDouble();
        }
		// Question statement 1
		//Displays 5 employess ID, Name and Salary
        ArrayDisplay m1= new ArrayDisplay();
        m1.display(id, name, salary);
		
		//Question Statement 2
		// Call display function to display ID and Name
		// Function overloading
		m1.display(id, name);
		
		System.out.println("Enter a name which is to be searched\n");
		String name1= sc.next();
		m1.display(name1, id, name, salary);
		
    }       
}