import java.util.Scanner;
public class Inverseofnumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //if number is of n digits then input number should contain all digits from 1 to n
       // ex = input = 2143 then output will be 2341 and input = 4123 then output will be 4321
      int inv=0;
     int place =1;
    while(n>0){
       int rem = n%10;
      inv = inv+place*(int)Math.pow(10,rem-1);
      n=n/10;
      place++;
      
    }
    System.out.println(inv);
    
    }
  }
