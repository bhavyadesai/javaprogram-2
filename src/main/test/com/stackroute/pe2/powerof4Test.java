package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class powerof4Test {
    powerof4 Poweroffour;
    int check;

    @Before
    public void setUp() throws Exception {
        Poweroffour = new powerof4();
    }

    @After
    public void tearDown() throws Exception {
        Poweroffour = null;
    }

    @Test
    public void testPowerOfFour() throws Exception {
        // Act
        check = Poweroffour.TestPowerOfFour(81);
        // Assert
        assertEquals(1, check);

    }
   // @Test
    //public void testpowerof4OrNot() throws Exception {
        // Act
      //  check = p2.TestPowerOfFour(0);
        // Assert
        //assertEquals(0, check);

    //}
}