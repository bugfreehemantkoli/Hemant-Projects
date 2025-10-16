class A extends Thread{
        public void run(){
        System.out.println("Thread A Started.");

        for(int i=0; i<=5; i++){
            System.out.println("\nFrom Thread A: i = "+i);
        }
        System.out.println("\nEnd of Thread A");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("Thread B Started.");

        for(int j=0; j<=5; j++){
            System.out.println("\nFrom Thread B: j = "+j);
        }
        System.out.println("\nEnd of Thread B");
    }
}

class C extends Thread{
    public void run(){
        System.out.println("Thread C Started.");

        for(int k=0; k<=5; k++){
            System.out.println("\nFrom Thread C: k = "+k);
        }
        System.out.println("\nEnd of Thread C");
    }
}

class ThreadPriority{
    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        C cc = new C();

        cc.setPriority(Thread.MAX_PRIORITY);
        bb.setPriority(aa.getPriority()+1);
        aa.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Threads A Started...");
        aa.start();
        System.out.println("Threads B Started...");
        bb.start();
        System.out.println("Threads C Started...");
        cc.start();

        System.out.println("Main Thread Ended...");
    }
}