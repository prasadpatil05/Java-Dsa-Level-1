import java.util.Scanner;
import java.lang.Math;

public class printDigits{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count=0;
    while(n!=0){
      n=n/10;
      count++;
      
    }
    int div = (int)Math.pow(10,count-1);
      while(div>0){
        int q = n/div;
        System.out.println(q);
        n=n%div;
    }
  }
}