public class Main {

    public static void main(String[] args) {

        Thread th = new Thread(new PrintThread('-'));
        Thread th1 = new Thread(new PrintThread('|'));

        th.start();
        th1.start();
    }

}