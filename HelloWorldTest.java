import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testPrintMessage() {
        String message = "Hello World!";
        assertEquals("Hello World!", message);
    }
}
