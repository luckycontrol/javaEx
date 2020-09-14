public class ThreadDEmo {
    public static void main(String[] args) {
        Thread t = new Thread(new Test());

        t.start();

        System.out.println("쓰레드 시작");
    }
}

class Test implements Runnable {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Test");

            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {}
        }
    }
}
