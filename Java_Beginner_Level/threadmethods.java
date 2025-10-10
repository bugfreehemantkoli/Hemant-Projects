class A extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            if(i==4){
                Thread.yield();
            }
            System.out.println("From Thread A: i = "+i);
        }
        System.out.println("\nEnd of Thread A");
    }
}

class B extends Thread{
    public void run(){
        for(int j=0; j<=5; j++){
            System.out.println(" From Thread B: j = "+j);
            if(j==3){
                stop();
            }
        }
        System.out.println("\nEnd of Thread B");
    }
}

class C extends Thread{
    public void run(){
        for(int k=0; k<=5; k++){
            System.out.println("From Thread C: k = "+k);
            if(k==1){
                try{
                    sleep(1000);
                }catch(Exception e){
                }
            }
        }
        System.out.println("\nEnd of Thread C");
    }
}

class threadmethods{
    public static void main(String[] args) {
        A thread1 = new A();
        B thread2 = new B();
        C thread3 = new C();

        System.out.println("Thread A is being started....");
        thread1.start();
        System.out.println("Thread B is being started....");
        thread2.start();
        System.out.println("Thread C is being started....");
        thread3.start();
    }
}