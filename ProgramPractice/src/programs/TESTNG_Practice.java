package programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TESTNG_Practice {
	
	@BeforeSuite

	public void BeforeS1() {
		System.out.println("Before Suit1 Executed");
		}
	
	@BeforeClass

	public void BeforeC1() {
		System.out.println("Before Class1 Executed");
		}
	
	
	@BeforeTest
	
	public void BeforeT1() {
		System.out.println("Before Test1 Executed");
		}
	
	@BeforeMethod
	
	public void BeforeM1() {
		System.out.println("Before M1 Executed");
		}
	
	//@Parameters({"test"}) 
	@Test
	
	public void test1M1() {
		System.out.println("Test1 M1 Executed");
		}
	
		
	@Test(dataProvider="data1", dataProviderClass = DataProvider_Class.class)
	
	public void test2M1(String name) {
		System.out.println("Test2 M1 Executed :"+name);
		}
	
	
@AfterMethod
	
	public void AfterM1() {
		System.out.println("After M1 Executed");
		}
	
@AfterTest

public void AfterT1() {
	System.out.println("After Test1 Executed");
	}

@AfterClass

public void AfterC1() {
	System.out.println("After Class1 Executed");
	}

@AfterSuite

public void AfterS1() {
	System.out.println("After Suit1 Executed");
	}
	
	
}
