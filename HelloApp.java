public class HelloApp {
    public static void main(String [] args){

        String name = "Paavni";
        if(args.length > 0){
            name = args[0];
        }

        System.out.println("Hi, " + name + "!");
    }
}