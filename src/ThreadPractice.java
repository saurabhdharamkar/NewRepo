public class ThreadPractice extends Thread{


    public void run() {
        System.out.println("Thread 1 executed");
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadPractice t1=new ThreadPractice();
        t1.start();


        ThreadPractice t2=new ThreadPractice();

        t2.start();
    }
}
