interface test_int1
{ 
int x=20;
}

public class test1 implements test_int1
{    
int x = 40;  
public static void main (String args[]) 
{  
test1 t1 = new test1();
  System.out.println(t1.x);
 } 
}