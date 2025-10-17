class ExceptionExample{
    public static void main(String[] args) {
        int a=10, b=5, c=5, x,y;

        try{
            x = a/(b-c);
        }catch(ArithmeticException e){
            System.out.println("Divide by Zero Error.");
        }

        y = a/(b+c);
        System.out.println("Y = "+y);
    }
}