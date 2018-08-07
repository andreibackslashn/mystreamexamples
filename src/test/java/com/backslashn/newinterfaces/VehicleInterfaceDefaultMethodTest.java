package com.backslashn.newinterfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleInterfaceDefaultMethodTest {

    @Test
    public void givenICalldefaultMethodTheMethodIsCalled(){

        Vehicle vehicleObject = new VehicleImpl();
        assertEquals("defatult method for the interface", vehicleObject.getOverview());


    }
}
