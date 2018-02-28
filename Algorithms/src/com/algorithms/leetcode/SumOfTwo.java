package com.algorithms.leetcode;

public class SumOfTwo {

	public static void main(String[] args) {
				int [] nums={2,6,4,1,3};
		        int sum=0,i,j,target=9;
		        System.out.println(nums.length);
		        for(i=0;i<nums.length;i++){
		            for(j=0;j<i;j++){
		                sum=nums[i]+nums[j];
		                if(sum==target){
		                    System.out.println(j+"    "+i);
		                    //return new int[] {i,j};
		                }
		            }
		        }
		        //return new int[] {i,j};
		    }
		

	}

