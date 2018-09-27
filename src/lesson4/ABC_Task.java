package lesson4;

public class ABC_Task {

    private static int currentChar = 'A';
    private static Object mon = new Object();


    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (currentChar != 'A') {
                                mon.wait();
                            }
                            System.out.print('A');
                            currentChar = 'B';
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (currentChar != 'B') {
                                mon.wait();
                            }
                            System.out.print('B');
                            currentChar = 'C';
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (currentChar != 'C') {
                                mon.wait();
                            }
                            System.out.print('C');
                            currentChar = 'A';
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
