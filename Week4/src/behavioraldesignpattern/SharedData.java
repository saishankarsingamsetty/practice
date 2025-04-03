package behavioraldesignpattern;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.ArrayList;
import java.util.List;

class SharedData {
    private final List<String> dataList = new ArrayList<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    
    public void writeData(String data) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is WRITING: " + data);
            dataList.add(data);
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has finished WRITING.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.writeLock().unlock();
        }
    }

    
    public void readData() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is READING: " + dataList);
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.readLock().unlock();
        }
    }
}

