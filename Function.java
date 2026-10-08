import java.util.Scanner;
public class Function{
    static int returnValueFunction(int n){
        return n + n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int result = returnValueFunction(n);
        System.out.println("The result is: " + result);
    }
}