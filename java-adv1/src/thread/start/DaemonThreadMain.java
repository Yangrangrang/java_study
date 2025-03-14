package thread.start;

public class DaemonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main start");
        DeadThread deadThread = new DeadThread();
        deadThread.setDaemon(true); // 데몬 스레드 여부
        deadThread.start();

        System.out.println(Thread.currentThread().getName() + ": main end");
    }

    static class DeadThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": run() end");

        }
    }
}
