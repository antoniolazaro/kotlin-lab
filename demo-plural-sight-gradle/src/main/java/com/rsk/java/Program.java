package com.rsk.java;

import com.rsk.kotlin.Meeting;
import com.rsk.kotlin.MeetingException;

public class Program {

    public static void main(String[] args) {
        Meeting board = new Meeting("Board meeting");
        board.setLolcation("London");
        System.out.println(("The meeting is in "+board.getLolcation()));

        board.description = "Teste description";

        System.out.println(Meeting.APP_VERSION);
        System.out.println(Meeting.getAppVersion());

        try {
            board.addAttendee("");
//            board.addAttendee(null);
        }catch(MeetingException me){
            me.printStackTrace();
        }
    }
}
