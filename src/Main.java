public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Thread th = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.print('-');
            }
        });

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.print('|');
            }
        });

        th.start();
        th1.start();
    }

}