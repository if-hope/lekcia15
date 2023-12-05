import org.testng.Assert;
import org.testng.annotations.Test;

public class Book {
    @Test
    public void book(){
        System.out.println("book");
        Assert.assertFalse(false);
    }
}
