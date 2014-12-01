package com.synisys.proxy;

public class Test {
 
    public static void main(String[] args){
        Service service = new ServiceProxy("H9wenm6");//Autenticated User 
        try {
        	service.sendRequest("do something");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
         
    }
 
}