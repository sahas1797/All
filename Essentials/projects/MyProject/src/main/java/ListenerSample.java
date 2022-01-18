/* This class Is Implementing the Listeners methods in order to use them in the other class where we actually write the test cases.
* (ListenerCode.java) is the class where we are using this listener methods*/

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerSample implements ITestListener {

    public void onStart(ITestContext context){
        System.out.print("The Test Is Getting Started");
    }

    public void onFinish(ITestContext context){
        System.out.print("The Test is Ended");
    }


    public void onTestStart(ITestResult result){
        System.out.print("Please provide Username and Password");
    }
    public void onTestSuccess(ITestResult result){
        System.out.print("After Entering username and Password please click the login Button");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("Test Failer, Please provide the correct Credentials");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("Test skipped hence this is Printing");

    }

}

