import java.util.Scanner;
class CelsiusToFahrenheit{ 
    public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);
    System.out.println("Input temprature in celsisus : ");
    double c = scanner.nextDouble();
    double f = (c*1.8) + 32;
    System.out.println("The temprature in fahrenheit" + f);
        
    }
}
