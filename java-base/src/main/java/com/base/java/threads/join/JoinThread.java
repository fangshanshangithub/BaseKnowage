package com.base.java.threads.join;

public class JoinThread implements Runnable{

    private JoninEntity joninEntity;

    public JoinThread(JoninEntity joninEntity) {
        this.joninEntity = joninEntity;
    }

    @Override
    public void run() {
        int j = joninEntity.getI();
        for(int i = 0; i < 10; i++) {
            System.out.println("线程:" + joninEntity.getName() + i);
            j++;
        }

        joninEntity.setName("FangSS");
        joninEntity.setI(j);
    }
}
