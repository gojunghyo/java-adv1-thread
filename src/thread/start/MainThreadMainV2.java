package thread.start;

import static utill.MyLogger.log;

public class MainThreadMainV2 {

  public static void main(String[] args) {
    log("main start");

    HelloRunnable runnable = new HelloRunnable();


    for(int i=0; i<100; i++) {
      Thread thread = new Thread(runnable);
      thread.start();
    }


    log("main end");
  }

}
