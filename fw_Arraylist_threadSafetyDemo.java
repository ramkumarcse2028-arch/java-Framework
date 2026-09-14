import java.util.*;

class Thread1 extends Thread {
    List<Integer> list;

    Thread1(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            list.add(5 * i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}

class Thread2 extends Thread {
    List<Integer> list;

    Thread2(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            list.add(6 * i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}

    public ArrayListThreadSafetyDemo{
        public static void main(String arge[]) throws InterruptedException{
            List<Integer> tablesList = Collections.synchronizedList(new ArrayList<>());

        Thread1 thread1 = new Thread1(tablesList);
        Thread2 thread2 = new Thread2(tablesList);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int result = 0;

        for (Integer element : tablesList) {
            result += element;
        }

        System.out.println("Result = " + result);
    }
}