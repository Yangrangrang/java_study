package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV3 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(100); // 시간 줄임
        log("작업 중단 지시 Thread.interrupt()");
        thread.interrupt();
        log("work 스레드 인터러브 상태1 = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {

            while (!Thread.currentThread().isInterrupted()) {    // 인터럽트 상태 변경X
                log("작업중");

            }
            log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());

            /**
             * 우리가 기대하는 것은 while 문을 탈출 하기 위해 딱 한번만 인터럽트 사용하는것!
             * 하지만 위에 처럼 할 경우 상태가 false로 변경이 되지 않기 때문에
             * 아래 코드에 sleep 에서 인터럽트 발생
             */
            try{
                log("자원 정리 시도");
                Thread.sleep(1000);
                log("자원 정리 완료");
            } catch (InterruptedException e) {
                log("자원 정리 실패 - 자원 정리 중 인터럽트 발생");
                log("work 스레드 인터럽트 상태 3 = " + Thread.currentThread().isInterrupted());
            }

            log("작업 종료 ");
        }
    }
}
