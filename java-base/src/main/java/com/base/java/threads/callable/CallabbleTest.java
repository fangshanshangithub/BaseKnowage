package com.base.java.threads.callable;

import java.util.concurrent.Callable;

public class CallabbleTest {

    public static void main(String[] args) {

    }


}

class CallableThread implements Callable {

    @Override
    public Object call() throws Exception {
        return "是范德萨发发达范德萨发";
    }
}