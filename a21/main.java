class MyRunnable implements Runnable{
    public void run() {
        try{
            System.out.println("Thread Name : " + Thread.currentThread().getName() + " is starting.");
            Thread.sleep(1000);
            System.out.println("Thread Name : " + Thread.currentThread().getName() + " is finishing.");
        } catch (InterruptedException e) {
            System.err.println("Thread execution interrupted: " + e.getMessage());
        }
    }
}

class Main {
    public static void main(String[] args) {
        for (int i=1; i<=10; ++i) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}
