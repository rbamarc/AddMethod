import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Please enter first number to add");
        int y = userinput.nextInt();

        System.out.println("Please enter second number to add");
        int z = userinput.nextInt();

        System.out.println("adding...");
        System.out.println(add(y, z));
    }
    public static int add(int a, int b){
        return a + b;
    }
}
