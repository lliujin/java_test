public class ProducerConsumer {
    public static void main(String[] args) {
        SyncStack ss = new SyncStack();
        Producer p = new Producer(ss);
        Consumer c = new Consumer(ss);
        new Thread(p).start();
        new Thread(p).start();
        new Thread(c).start();
    }
}

class Bun {
    int id;
    Bun(int id) {
        this.id = id;
    }
    
    public String toString() {
        return "Bun " + id;
    }
}

class SyncStack {
    int index = 0;
    Bun[] arrB = new Bun[6];
    
    public synchronized void push(Bun b) {
        while(index == arrB.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        arrB[index] = b;
        index++;
    }
    
    public synchronized Bun pop() {
        while(index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        index--;
        return arrB[index];
    }
}

class Producer implements Runnable {
    SyncStack ss = null;
    Producer(SyncStack ss) {
        this.ss = ss;
    }
    public void run() {
        for(int i=0; i<=20; i++) {
            Bun b = new Bun(i);
            ss.push(b);
            System.out.println("produce: " + b);
        }
    }
}

class Consumer implements Runnable {
    SyncStack ss = null;
    Consumer(SyncStack ss) {
        this.ss = ss;
    }
    public void run() {
        for(int i=0; i<=40; i++) {
            Bun b = ss.pop();
            System.out.println("eat: " + b);
        }
    }
}