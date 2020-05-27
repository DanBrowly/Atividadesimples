import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner leitor = new Scanner(System.in);
      
      float n1 = leitor.nextFloat();
      float n2 = leitor.nextFloat();
      float resultado = (n1 + n2) / 2;
      
      
      System.out.println("MÉDIA = " + resultado);
    }
}
