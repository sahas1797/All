import org.testng.annotations.Test;

public class IncludeExclude {

    //to make any test case to be ignored/skipped we can use the following syntax
    @Test
        public void test(){

        System.out.println("This is Disabled Test");

    }

    //this test case executes even if we dont mention (enabled= true), because by default all the test cases will be executed.
    @Test
        public void test1(){

        System.out.println("This is Enabled Test");
    }

    @Test
        public void test2(){

        System.out.println("This is 3rd test");
    }

}
