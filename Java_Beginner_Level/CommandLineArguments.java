class CommandLineArguments{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No command line arguments provided.");
        } else {
            System.out.println("Command line arguments:");
            int i,s = 0;
            for(String arg : args){
                System.out.println(arg);
            }
            for(i=0;i<args.length;i++){
                s = s + Integer.parseInt(args[i]);
            }
            System.out.println("Sum is "+ s);
            System.out.println("Average is "+ s/args.length);
        }
    }
}