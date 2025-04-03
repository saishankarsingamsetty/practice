package behavioraldesignpattern;

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

       
        for (int i = 1; i <= 3; i++) {
            new Thread(new Reader(sharedData), "Reader-" + i).start();
        }

       for(int i=1;i<=3;i++) {
    	   
    	   new Thread(new Writer(sharedData), "Writer-"+i).start();
       }
    }
}

class Reader implements Runnable {
    private final SharedData sharedData;

    public Reader(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
//        while (true) {
            sharedData.readData();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
//        }
    }
}

class Writer implements Runnable {
    private final SharedData sharedData;
    private int counter = 1;

    public Writer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
//        while (true) {
            sharedData.writeData("Data-" + counter++);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
//        }
    }
}
 

