import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testBillingMessage() {
        App app = new App();
        assertEquals("Billing system active!", app.billingMessage());
    }
}
