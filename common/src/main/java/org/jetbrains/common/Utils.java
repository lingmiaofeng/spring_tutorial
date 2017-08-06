package org.jetbrains.common;

public class Utils {

    private Utils(){}

    public static String  getMsg(String type, String receiver, String message){
        StringBuilder msg = new StringBuilder();
        msg.append(type);
        msg.append(" sent to ");
        msg.append(receiver);
        msg.append(" with Message = ");
        msg.append(message);

        return msg.toString();

    }
}
