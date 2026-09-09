import java.util.Scanner;
public class If{
    public static void main(String[] aargs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        if( a > 100){
            System.out.println("Big");
        }else{
            System.out.println("Small");
        }
    }
}