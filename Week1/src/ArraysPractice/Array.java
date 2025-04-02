package ArraysPractice;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
//		int[] i;
//		int i[];
//		int []i;
//		int [] i;
//		int i [];
		
		
//		int[] ia=new int[10];
//		ia=new int[0];
//		ia=new int[];//must specify the size 
//		ia=new int[-1];//negative array size exception
		
//		ia=new int[3];
//		ia[0]=1;
//		ia[3]=5;//index out of bounce exception
//		System.out.println(Arrays.toString(ia));
		
		
		//initializations 
		
//		int[] ia1 = {10,20,30};
//		System.out.println(ia1.length);
//		
//		int[] ia2 = new int[]{10,20,30};
//		System.out.println(ia2.length);
		
		
	//two dimentional arrays;
		
//		int[][] ia = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

		
//		int[][] ia=new int[5][5];
//		
//		
//		int a=1;
//		for(int i=0;i<ia.length;i++) {
//			for(int j=0;j<ia[i].length;j++) {
//				ia[i][j]= a++;
//			}
//		}
		
		
//		int[][] ia = {{1, 2, 3 , 4 , 5},{4, 5},{7, 8, 10, 9 , 1 , 2, 3 , 4 , 5}};
		
		
		int[][] ia=new int[5][];
		
//		int[][] ia=new int[][7];
		
//		ia[0]=new int[1];
//		ia[1]=new int[2];
//		ia[2]=new int[3];
//		ia[3]=new int[4];
//		ia[4]=new int[5];
//		
//		int a=1;
//		for(int i=0;i<ia.length;i++) {
//			for(int j=0;j<ia[i].length;j++) {
//				ia[i][j]= a++;
//			}
//		}
//		
//		for(int i=0;i<ia.length;i++) {
//			System.out.println(Arrays.toString(ia[i]));
//		}
		
		//array contains the element or not
		
//		int[] ia1 = {10,20,30};
//		int k=30;
//		boolean found=false;
//		
//		for(int i=0;i<ia1.length;i++) {
//			if(ia1[i]==k) {
//				found=true;
//			}
//		}
//		if(found)
//		System.out.println("element found");
//		else
//		System.out.println("element not found");
		
		//sum of the elements

//		int[] ia1 = {10,20,30}; 
//		int sum=0;
//		for(int i=0;i<ia1.length;i++) {
//			sum+=ia1[i];
//		}
//		System.out.println(sum);
		
		//finding the largest
		
//		int[] ia1 = {10,20,30};
//		int largest=ia1[0];
//		
//		for(int i=0;i<ia1.length;i++) {
//			if(ia1[i]>largest) {
//				largest=ia1[i];
//			}
//		}
//		
//		System.out.println(largest);
		
		//count occurences of the elements
		
//		int[] arr = {1, 2, 2, 3, 4, 3, 3, 5};
//		int a=3;
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==a) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = {6, 7, 8, 9, 10};
//		
//		int[] a=new int[arr1.length+arr2.length];
//		
//		for(int i=0;i<arr1.length;i++) {
//			a[i]=arr1[i];
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			a[arr1.length+i]=arr2[i];
//		}
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(a));
		
//		reverse an array
		
//		int[] a = {1, 2, 3, 4, 5};
//		System.out.println(Arrays.toString(a));
//		
//		int s=0;
//		int e=a.length-1;
//		
//		while(s<e) {
//			a[s]=a[s]+a[e]-(a[e]=a[s]);
//			
//			s++;
//			e--;
//		}
//		
//		System.out.println(Arrays.toString(a));
		
		//problems on 2d arrays
		
		//sum of elements 
		
		  int[][] arr = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		  
//		  int sum=0;
//		  for(int i=0;i<arr.length;i++) {
//			  for(int j=0;j<arr[i].length;j++) {
//				  sum+=arr[i][j];
//			  }
//		  }
//		  System.out.println(sum);
		  
//		  transpose of the array
		  
//		  int t[][]=new int[3][3];
//		  
//		  for(int i=0;i<arr.length;i++) {
//			  for(int j=0;j<arr[i].length;j++) {
//				  t[j][i]=arr[i][j];
//			  }
//		  }
//		  
//		  for(int i=0;i<arr.length;i++) {
//			  System.out.println(Arrays.toString(arr[i]));
//		  }
//		  
//		  System.out.println();
//		  
//		  
//		  for(int i=0;i<t.length;i++) {
//			  System.out.println(Arrays.toString(t[i]));
//		  }
//		  
		
		  
		  //max value in the 2d array
		  
		  
//		  int max=arr[0][0];
//		  for(int i=0;i<arr.length;i++) {
//			  for(int j=0;j<arr[i].length;j++) {
//				if(max<arr[i][j]) {
//					max=arr[i][j];
//				} 
//			  }
//		  }
//		  
//		  System.out.println(max);;
		  
		  //adding two arrays
		  
	        	int[][] arr1 = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	            };

	            int[][] arr2 = {
	                {9, 8, 7},
	                {6, 5, 4},
	                {3, 2, 1}
	            };
	            
	            int r[][]=new int[3][3];
	            
	            for(int i=0;i<r.length;i++) {
	            	for(int j=0;j<r[i].length;j++) {
	            		r[i][j]=arr1[i][j]+arr2[i][j];
	            	}
	            }
	            
	  		  for(int i=0;i<r.length;i++) {
				  System.out.println(Arrays.toString(r[i]));
			  }
	            
	
	}
}
