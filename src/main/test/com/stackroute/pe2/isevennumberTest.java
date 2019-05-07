package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class isevennumberTest {
     isevennumber p3;
     int check;
    @Before
    public void setUp() throws Exception {
        p3= new isevennumber();
    }

    @After
    public void tearDown() throws Exception {
        p3=null;
    }
    @Test
    public void isevennumberTest () throws Exception {
        // Act
        check = p3.isEven(8);
        // Assert
        assertEquals(1, check);

    }
    @Test
    public void isevennumberTestOrNot () throws Exception {
        // Act
        check = p3.isEven(5);
        // Assert
        assertEquals(0, check);

    }
}
