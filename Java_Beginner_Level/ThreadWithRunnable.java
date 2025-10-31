class Process1 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Process 1 - Count: " + i);
        }
    }
}

class Process2 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Process 2 - Count: " + i);
        }
        
    }
}

class ThreadWithRunnable{
    public static void main(String args[]){
        Process1 p1 = new Process1();
        Thread t1 = new Thread(p1);
        t1.start();

        Process2 p2 = new Process2();
        Thread t2 = new Thread(p2);
        t2.start();
    }
}