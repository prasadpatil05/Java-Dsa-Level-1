// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.lang.Math;
import java.util.Scanner;
public class Prime{

  static boolean isPrime(int n){
    if(n<=1){
      return false;
    }

    for(int i=2;i<Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<10;i++){
      int n = sc.nextInt();
      if(isPrime(n))
        System.out.println("Prime");
      else
        System.out.println("Not Prime");
      sc.close();
    }
  }

 
}