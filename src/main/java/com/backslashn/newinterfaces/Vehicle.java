package com.backslashn.newinterfaces;

public interface Vehicle {
    static String producer(){
        return "static method for the interface";
    }

    default String getOverview(){
        return "defatult method for the interface";
    }
}
