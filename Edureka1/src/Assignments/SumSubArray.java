package Assignments;

public class SumSubArray {

	public static void main(String[] args) {
		int [] arr= {2,3,4,5,6,9,2,4,5,6,7};
		int i,j,sum=0,total=0,test=0;
		for(i=0;i<10;i++){
			sum= arr[i]+arr[i+1];
			if(sum>total){
				total=sum;
				//System.out.println(total);
				for(j=i;j>0;j--){
					test=test+arr[j];
					System.out.println(test);
				}
				
			}
		}

	}

}
