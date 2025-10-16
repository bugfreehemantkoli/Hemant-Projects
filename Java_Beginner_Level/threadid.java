class A extends Thread{
    public void run(){
        System.out.println("\n Inside Thread A :- \n Thread ID : "+ Thread.currentThread().getId() + 
                            "\n Thread Priority : "+ Thread.currentThread().getPriority());
    }
}

class B extends Thread{
    public void run(){
        System.out.println("\n Inside Thread B :- \n Thread ID : "+ Thread.currentThread().getId() + 
                            "\n Thread Priority : "+ Thread.currentThread().getPriority());
    }
}

class C extends Thread{
    public void run(){
        System.out.println("\n Inside Thread C :- \n Thread ID : "+ Thread.currentThread().getId() + 
                            "\n Thread Priority : "+ Thread.currentThread().getPriority());
    }
}

class threadid{
    public static void main(String args[]){
        A aa = new A();
        B bb = new B();
        C cc = new C();

        aa.setPriority(Thread.MIN_PRIORITY);
        bb.setPriority(Thread.NORM_PRIORITY);
        cc.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\n Inside Main Thread and It's ID is : "+ Thread.currentThread().getId() + 
                            "\n Main Thread Priority = "+ Thread.currentThread().getId());

        System.out.println("\n Now calling other Threads : Thread A-> Thread B-> Thread C");
        aa.start();
        bb.start();
        cc.start();
    }
}