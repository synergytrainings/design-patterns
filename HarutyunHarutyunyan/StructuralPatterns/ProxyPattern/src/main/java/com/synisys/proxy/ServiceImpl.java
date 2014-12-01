package com.synisys.proxy;

import java.io.IOException;

public class ServiceImpl implements Service {
 
    public void sendRequest(String request) throws IOException {
        System.out.println("'" + request + "' request implemented.");
    }
 
}