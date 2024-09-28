
import java.util.Scanner;

public class Exercicio15 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARATE
      String n;
      int a;
      //int result;

      // COLLECT DATA
      System.out.print("Name : ");
      n = sc.next();
      System.out.print("Age : ");
      a = sc.nextInt();

      // OUTPUT
      if (a >= 15 && a <= 25) {
         System.out.println(n + " ACEITA");
      } else {
         System.out.println(n + " NÂO ACEITA");
      }
   }
}
