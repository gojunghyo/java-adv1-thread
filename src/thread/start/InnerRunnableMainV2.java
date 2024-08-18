package thread.start;

import static utill.MyLogger.log;

public class InnerRunnableMainV2 {

  public static void main(String[] args) {

    log("main() start");

    Runnable runnable1 = () -> log(": run()");
    Thread thread = new Thread(runnable1);
    thread.start();

    log("main() end");
  }

}
