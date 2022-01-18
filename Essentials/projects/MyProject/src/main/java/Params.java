import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Params {

    @Test
    @Parameters("first")
        public void meth1(String s1){
            System.out.println("Parameter Passed is"+s1);
    }

    @Test
    @Parameters("second")
    public void meth2(String s2){
        System.out.println("Parameter Passed is"+s2);
    }

    @Test
    @Parameters("third")
    public void meth3(String s3){
        System.out.println("Parameter Passed is"+s3);
    }

    @Test
    @Parameters("fourth")
    public void meth4(String s4){
        System.out.println("Parameter Passed is"+s4);
    }
}

