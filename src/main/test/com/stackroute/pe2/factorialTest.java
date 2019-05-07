package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class factorialTest {
    factorial p7;
    int check;

    @Before
    public void setUp() throws Exception {
        p7=new factorial();
    }

    @After
    public void tearDown() throws Exception {
        p7=null;
    }    @Test
    public void factorial() throws Exception {
        // Act
        check = p7.factorialTest(3);
        // Assert
        assertEquals(1, check);

    }
    @Test
    public void  factorialNull() throws Exception {
        // Act
        check = p7.factorialTest(0);
        // Assert
        assertEquals(0, check);

    }
}

