import java.util.Scanner;

public class GCD_LCM{

  static int gcd(int a,int b){
  while(a%b!=0){
    int rem = a%b;
     b=a;
     a=rem;

    
  }
    return b;
  }

 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int gcd = gcd(a,b);
    int lcm = (a*b)/gcd;
    
  }
}