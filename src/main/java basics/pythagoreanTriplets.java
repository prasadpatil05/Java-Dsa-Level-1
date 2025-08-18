import java.util.Scanner;
public class pythagoreanTriplets{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int max = a;
    if(b>=max){
      max=b;
    }
    if(c>=max){
      max=c;
    }
    boolean flag = false;
    if(max==a){
      if(b*b+c*c==a*a){
        flag=true;
      }
    }
    else if(max==b){
      if(a*a+c*c==b*b){
        flag=true;
      }
    }
    else{
      if(a*a+b*b==c*c){
        flag=true;
      }
    }
    System.out.println(flag);
  }
}