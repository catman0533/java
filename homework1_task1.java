//  Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 

import java.util.Scanner;                          
 /**
  * homework1_task1
  */
 public class homework1_task1 {
 
    public static void main(String[] args) {
      System.out.printf("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fact *= i;            
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, fact);
        num.close();
     }
    }
