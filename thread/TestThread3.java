public class TestThread3 {
    public static void main(String[] args) {
        Runner3 r = new Runner3();
        r.start();
        for(int i=0; i<50; i++) {
            System.out.println("MainThread: " + i);
        }
    }
}

class Runner3 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
        for(int i=0; i<50; i++) {
            System.out.println("SubThread: " + i);
        }
    }
} 