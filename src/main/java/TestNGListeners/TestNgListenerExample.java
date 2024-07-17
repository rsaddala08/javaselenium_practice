package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListenerExample implements ITestListener						
{		

    // When Test case get failed, this method is called.		
    public void onTestFailure(ITestResult Result) 					
    {		
    System.out.println("The name of the testcase failed is :---->"+Result.getName());					
    }		

    // When Test case get Skipped, this method is called.		
    public void onTestSkipped(ITestResult Result)					
    {		
    System.out.println("The name of the testcase Skipped is :----->"+Result.getName());					
    }		

    // When Test case get Started, this method is called.		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" -----> Test case started");					
    }		

    // When Test case get passed, this method is called.		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :----->"+Result.getName());					
    }	
    
    // When Test case get finished, this method is called.		
    public void onTestFinish(ITestResult Result)					
    {		
    System.out.println("The name of the testcase finised is :----->"+Result.getName());					
    }	
    
}