public class TestThread2 {
    public static void main(String[] args) {
        Runner2 r = new Runner2();
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<1000; i++) {
            if(i % 10 == 0 && i > 0) {
                System.out.println("in thread main i=" + i);
            }
        }
        System.out.println("Thread main is over");
        r.shutdown();
    }
}

class Runner2 implements Runnable {
    private boolean flag = true;
    public void run() {
        int i = 0;
        while(flag) {
            System.out.println(" " + i++);
        }
    }
    
    public void shutdown() {
        flag = false;
    }
}