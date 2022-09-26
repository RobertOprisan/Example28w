import java.util.Scanner;
public class Example28w {
    public static void main(String[] args){
        int a, b;
        int add = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        a = input.nextInt();

        System.out.println("Enter number b");
        b = input.nextInt();

        for (int i = 1; i <= b; i++) {
            add += a;
        }
        System.out.println(add);
    }
}
