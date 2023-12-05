import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {

    @Test
    public void firstTest(){
        System.out.println("Ok");
        System.out.println(System.getProperty("browser"));
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest(){
        System.out.println("Hello");
        Assert.assertTrue(false);
    }
}
