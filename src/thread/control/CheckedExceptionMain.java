package thread.control;

import utill.ThreadUtils;

import static utill.ThreadUtils.sleep;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckRunnable implements Runnable {

        @Override
        public void run() {
            sleep(1000);
        }
    }
}
