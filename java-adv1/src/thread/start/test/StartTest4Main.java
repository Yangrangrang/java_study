package thread.start.test;

import util.MyLogger;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {
        PrinkWork a = new PrinkWork("A", 1000);
        PrinkWork b = new PrinkWork("B", 500);

        Thread threadA = new Thread(a, "Thread-A");
        Thread threadB = new Thread(b, "Thread-B");
        threadA.start();
        threadB.start();
    }

    static class PrinkWork implements Runnable {

        private String content;
        private int sleepMs;

        public PrinkWork(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
