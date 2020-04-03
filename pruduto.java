import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      
      int numero1;
      int numero2;
      
      Scanner sc = new Scanner(System.in);
      
      
      System.out.println("Digite o primeiro numero; ");
      numero1 = sc.nextInt();
      
      System.out.println("Digite o segundo numero; ");
      numero2 = sc.nextInt();
    
    System.out.print("PROD = " + (numero1 * numero2));
        
    }
    }
