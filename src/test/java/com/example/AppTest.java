package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testUnderweight() {
        App app = new App();
        double bmi = app.calculateBmi(45, 1.75);
        assertEquals(14.69, bmi, 0.01);
    }

    @Test
    public void testNormal() {
        App app = new App();
        double bmi = app.calculateBmi(70, 1.75);
        assertEquals(22.86, bmi, 0.01);
    }

    @Test
    public void testOverweight() {
        App app = new App();
        double bmi = app.calculateBmi(85, 1.75);
        assertEquals(27.75, bmi, 0.01);
    }

    @Test
    public void testObese() {
        App app = new App();
        double bmi = app.calculateBmi(110, 1.75);
        assertEquals(35.91, bmi, 0.01);
    }
}