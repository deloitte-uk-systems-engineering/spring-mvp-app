package com.deloitte.mvp.utility;

public class IdCounter {

    static int USERID = 1;
    static int SKILLID  =1;

    public static int getUSERID() {
        return USERID;
    }

    public static int getSKILLID() {
        return SKILLID;
    }

    public static int incrementUserID(){
        return USERID++;
    }

    public static int incrementSkillID(){
        return SKILLID++;
    }

    public static int decrementUserID(){
        return USERID--;
    }

    public static int decrementSkillID(){
        return SKILLID--;
    }
}
