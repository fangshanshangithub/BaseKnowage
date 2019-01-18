/*
 * @author Fang ShanShan (fangshanshan@artron.net)
 *
 * CreatAt: 2019/1/17 Time: 下午4:20
 *
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 *
 * Use of this source code is governed a license that can be found in the LICENSE file.
 *
 */

package com.base.java.threads.executors;

// 该线程 触发多个多个子线程
public class ThreadOne implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("ThreadOne 触发的子线程 " + Thread.currentThread().getName());
                }
            }).start();
        }
    }
}
