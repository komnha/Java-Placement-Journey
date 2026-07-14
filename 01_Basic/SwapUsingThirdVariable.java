import java.util.Scanner;
class SwapTheNumber{ 
    public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);
    System.out.println("Input First Number: ");
    int a = scanner.nextInt();
    System.out.println("Input Second Number: ");
    int b = scanner.nextInt();
    int temp = a;
    a = b ;
    b = temp ;
    System.out.println("First Number: " + a);
    System.out.println("Second Number: " + b);
        
    }
}
