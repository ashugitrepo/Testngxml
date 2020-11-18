package programs;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class All_Programs {

	public class Arrays1 {
		int[] x= {10,20,30};
		char[] ch= {'A','s','h','u'};
		int avg=0;
		int count=0;	
		String inputString="ASHUTOSH";
		
									//Get average using for each loop
	//@Test
		public void getAverage() {
				
			for(int x1 : x)
			{
			count++;
			avg=avg+x1;	
			}
			
			System.out.print("Result Using for each method : "+avg/count);
			System.out.print("\n");
		}
									//Get average using while
	//@Test
	public void getAverage1() {
		
		
		while(x.equals(true))
		
		{
		count++;
		
			System.out.print(x);
			
		}
		System.out.println(count);
		
	}
									//Get average using for loop
	//@Test
	public void getAverage2() {
			
	for(int i=0; i<x.length; i++)
		{
		count++;
		avg=avg+x[i];
				
		}
	System.out.println("Result Using for loop: "+avg/count);
		//System.out.println(count);
	}

									//Add element to Array
	//@Test
	public void addElementToArray() {
		int[] r=new int[10];  //[Creation of Array of length 10]
		
		for(int i=0; i<=3; i++)
		{
			r[0]=10;
			r[1]=20;
			r[2]=30;
			r[3]=40;
			System.out.println(r[i]);	
		}
		}
									// Reverse Array

	//@Test
	public void reverseArray() {
		
		for(int i=x.length-1; i>=0; i--)
		{
			
			System.out.println(x[i]);	
		}
		}

									//Java Program to sort an array in ascending order	
	//@Test
	public void sortArray() {
		
		for(int i=x.length-1; i>=0; i--)
		{
			
			System.out.println(x[i]);	
		}
		}

								//Java Program to convert char Array to String using String object

	//@Test
	public void charArrayToString() {
		
		String str=new String(ch);
		
		
		System.out.println(str);
		
		}

								//Method 2: Using valueOf method
	//@Test
	public void charArrayToString1() {
	String str2 = String.valueOf(ch);
	System.out.println(str2);

	}

								//Sort Array in ascending order without inbuilt methods
	//@Test
	public void SortArray() {
		char temp=0;
		char[] ch= {'b','c','d','a'};
		int len=ch.length;
		//System.out.println(len);
		for(int i=0; i<len;i++)
		{
			for(int j=0; j<len;j++)
			{			
				if(ch[j]>ch[i])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}			
			}
			
		}
		for (int k = 0; k < len; k++) 
	    {
	        System.out.print(ch[k] + ", ");
	       
	    }
		 System.out.println("\n");
	}

								//Sort Array in ascending order with inbuilt methods
	//@Test
	public void SortArray1() {
		char[] ch= {'b','c','d','a','m'};
		int len=ch.length;
		Arrays.sort(ch);
		for(int i=len-1; i>=0;i--)
		{
			System.out.print(ch[i]+ " ");
			
		}
		System.out.println("\n");
		/*for(char ch1:ch)
		{
			
			System.out.println(ch1);
		}*/

		}
	//Not completed
	//@Test
	public void count_occurance() {
		
		char[] ch= {'b','c','d','a', 'c','a','d'};
		int len=ch.length;
		for(int i=0; i<len;i++)
		{
			for(int j=i+1; j<len;j++)
			{			
				if(ch[i]==ch[j])
				{
					
				int 	countv=count+1;
					
					System.out.println(" count of "+ch[i]+" is : "+countv);
					
				}	
				
			}
			
		}
		

	}

	@Test
	public void occurane_map() {
		
		HashMap<Character, Integer> Map = new HashMap<Character, Integer>();
		  
	    //Converting given string to char array
		char[] strArray= {'b','c','d','a', 'c','a','d','d'};

	   // char[] strArray = inputString.toCharArray();

	    //checking each char of strArray

	    for (char c : strArray)
	    {
	        if(Map.containsKey(c))
	        {
	            //If char 'c' is present in charCountMap, incrementing it's count by 1

	            Map.put(c, Map.get(c)+1);
	        }
	        else
	        {
	            //If char 'c' is not present in charCountMap,
	            //putting 'c' into charCountMap with 1 as it's value
	            Map.put(c, 1);
	        }
	    }
	     
	    for (char ch1: strArray)
	    	
	    {
	    	
	    	System.out.print(ch1);
	    }
	    //Printing inputString and charCountMap 
	    System.out.println(" : "+Map);
		}
		

	// Program to find count of binary values


	     
	  

		
	}
				
					
					
					
					
			








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
