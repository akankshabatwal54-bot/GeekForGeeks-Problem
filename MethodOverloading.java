import java.util.Scanner;
class MethodOverloading{
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static double sum(double x, double y){
        return x + y;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int result = sum(a, b);
        int result2 = sum(a, b, c);
        double result3 = sum(x, y);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}