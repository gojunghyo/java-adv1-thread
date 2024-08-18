package thread.start;

import static utill.MyLogger.log;

public class MainThreadMainV1 {

  public static void main(String[] args) {
    log("main start");

    HelloRunnable runnable = new HelloRunnable();

    Thread thread = new Thread(runnable);
    thread.start();

    Thread thread2 = new Thread(runnable);
    thread2.start();

    Thread thread3 = new Thread(runnable);
    thread3.start();



    log("main end");
  }

}
