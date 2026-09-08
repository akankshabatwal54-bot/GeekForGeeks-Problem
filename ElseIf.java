import java.util.Scanner;
class ElseIf{
    public static void utility(int number){
        if(number > 100){
            System.out.println("Big");
        }else if(number < 10){
            System.out.println("Small");
        }else{
            System.out.println("Number");
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        utility(number);
        
    }
}