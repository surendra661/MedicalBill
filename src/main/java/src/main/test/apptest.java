
package com.medical;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCalculateTotal() {
        App app = new App();
        int total = app.calculateTotal(5, 20);
        assertEquals(100, total);
    }

    @Test
    public void testWelcomeMessage() {
        App app = new App();
        assertEquals("Welcome to Medical Billing System!", app.welcomeMessage());
    }
}
