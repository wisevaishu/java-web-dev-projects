package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    //TODO: constructor sets gasTankLevel properly
    Car test_car;

    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }
    @Test
    public void testInitialGasTank() {
        //Car test_car = new Car("Toyota", "Prius", 10, 50);


        assertEquals(10, test_car.getGasTankLevel(), .001);
        assertNotEquals(0, test_car.getGasTankLevel(), 0.0, "Initial gas tank level should not be 0");
        assertTrue(test_car.getGasTankLevel() > 0, "Initial gas tank level should be greater than 0");
    }



    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}