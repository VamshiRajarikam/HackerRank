package Assignments;

public class ContiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,total=0,series=0,test=0;
		int j;
		int [] id = {2,3,4,5,-56,7,-8,-10,1,2};
		for(int i=0;i<9;i++){
			sum=id[i]+id[i+1];
			System.out.println(sum);
			if(sum>total){
				total=sum;
				System.out.println(total);
				//System.out.println(i);
				for(j=i;j>0;j--){
					
					series= series+id[j];
					System.out.println(j);
					System.out.println(series);
				}
			}
		}
System.out.println(series);

	}
	

}
