package com.backslashn.newinterfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleInterfaceStaticMethodTest {
    @Test
    public void givenICallStaticMethodFromInterfaceTheMethodIsCalled(){

        assertEquals("static method for the interface", Vehicle.producer());

    }
}
