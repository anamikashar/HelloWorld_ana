package suite;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



@Test
public class Module1 {
	
	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("I am executing before every method");
	}
	
	
@Test
public void test001() {
	
System.out.println("I am Executing Testcase_001");

}
@Test
public void test002() {
	
System.out.println("I am Executing Testcase_002");

}
@Test
public void test003() {
	
System.out.println("I am Executing Testcase_003");


}

@AfterMethod
public void afterMethod() {
	System.out.println("I am executing After every method");
}
@DataProvider 
public Object [] [] data001(){
	
Object[][]	data ={ {"Vijay","pass001"},{"Bharathi","pass002"} };
	
return null;
}

public void Login (String Username, String password) {
	System.out.println(Username +" and "+ password);
	

}
}




