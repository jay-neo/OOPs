class MyThread extends Thread {
    public void run() {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }
}
class Main {
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i) {
            Thread thread = new MyThread();
            thread.start();
        }
    }
}
