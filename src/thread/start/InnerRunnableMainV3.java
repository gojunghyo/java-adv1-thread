package thread.start;

import static utill.MyLogger.log;

public class InnerRunnableMainV3 {

  public static void main(String[] args) {

    log("main() start");

    new Thread(() -> log(": run()"))
        .start();

    log("main() end");
  }

}
