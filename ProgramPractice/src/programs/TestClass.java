package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class TestClass {
//@Test
	public void add() {
		
		int[] arr= {2,4,234,5,3};
		
		int len=arr.length;
		
		
		
		for(int i=0;i<len;i++)
		{
						
			for(int j=0;j<len;j++)
			
			{
			
				if(arr[i]+arr[j]==7) {
					
					System.out.println("sum of "+ arr[i]+" & "+arr[j] +" is= "+"7");
				}					
			}		
		}
	}
@Test
public void conListToSet() {
	
	List<String> aList = Arrays.asList("Geeks", "for", 
            "GeeksQuiz", "GeeksforGeeks", "GFG", "GFG"); 

Set<String> hSet = new HashSet<String>(); 
for (String x : aList) 
   hSet.add(x); 
System.out.println(hSet);
System.out.println("Created HashSet is"); 
for (String x : hSet) 
   System.out.println(x); 
}

	
	
	
	
	
}
