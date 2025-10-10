
class student{
    int roll;
    
    void getroll(int n){
        roll = n;
    }

    void putroll(){
        System.out.println("Roll = "+roll);
    }
}

class test extends student{
    float mark1, mark2;
    
    void getmarks(float m1, float m2){
        mark1 = m1;
        mark2 = m2;
    }

    void putmarks(){
        System.out.println("Marks1 = "+mark1+"\nMarks 2 = "+mark2);
    }
}

interface sports{
    float sportmark = 6.0F;

    public void putsport();
}

class result extends test implements sports{
    float total;
    
    public void putsport(){
        System.out.println("Sports Marks = "+sportmark);
    }

    void display(){
        total = mark1 + mark2 + sportmark;
        putroll();
        putmarks();
        putsport();
        System.out.println("Total Marks = "+total);
    }
}

class Interface_Examp2{
    public static void main(String[] args) {
        result aa = new result();
        aa.getroll(101);
        aa.getmarks(30.5F, 35.9F);
        aa.display();
        
    }
}