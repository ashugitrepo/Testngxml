package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class Program {

//Sorting of int array
	
//@Test

public void sortIntArray() {
	
	int[] ar= {10,20,30,40,20};
	
	Arrays.sort(ar);
	
for(int x: ar)
	
{
	
	System.out.println(x);
}
	
}

//@Test

public void sortArray_Loop() {
	

	int [] arr= {10,30,20,40,30};
	
	int temp=0;
	
	int len=arr.length;
	
	for(int i=0; i<len; i++) {
		
		for (int j=0; j<len; j++)
			
		{
			
			if(arr[j]>arr[i])
				
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;	
				
				
			}
			
		}
			
	}
	
	
	for (int k=0; k<len; k++)
		
	{
		System.out.println(arr[k]);
		
	}
	
}
	//@Test

public void count_occ() {
	
	char[] ch= {'a','d','c','b','b','b','c','d'};
	
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	
	
	for(char ch1 : ch)
	{
		
		if(map.containsKey(ch1)) {
			
			map.put(ch1, map.get(ch1)+1);
						
		}
		else {
			
			map.put(ch1, 1);
			
			
		}
		
	}
	
	

System.out.println("count :" +map);
}
	
	//@Test
	
	public void rev_str() {
		
		String str="ashutosh Thakur";
			 
			    char ch[]=str.toCharArray();  
			      
			    for(int i=ch.length-1;i>=0;i--){  
			        System.out.print(ch[i]);  
			    }  
			    
			  
			System.out.println(" ");
		
		
	}

	@Test
	
	public void PrimeNum() {
		 int i,m=0,flag=0;      
		  
		 int n=7;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}    
}
	

