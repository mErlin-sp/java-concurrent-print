public class PrintThread implements Runnable {
    public static boolean flag = true;
    private final char c;

    public PrintThread(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            synchronized (PrintThread.class) {
                for (int i = 0; i < 100; i++) {
                    while (PrintThread.flag != (c == '|')) {
                        PrintThread.class.wait();
                    }
                    System.out.print(c);
                    PrintThread.flag = !PrintThread.flag;
                    PrintThread.class.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
