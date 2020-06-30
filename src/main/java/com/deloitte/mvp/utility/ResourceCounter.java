package com.deloitte.mvp.utility;

public class ResourceCounter {

    static int ID = 1;

    public static int increment(){
        return ID++;
    }

    public static int decrement(){
        return ID--;
    }
}
