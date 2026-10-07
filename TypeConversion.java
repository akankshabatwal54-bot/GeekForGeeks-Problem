import java.util.Scanner;
public class TypeConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double value: ");
        double d = sc.nextDouble();
       
        int num = (int)d;
        System.out.println(num);
    }
}