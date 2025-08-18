
import java.util.*;

public class RotateNoByK{


  static int rotate(int n,int k){

    int count =0;
     int temp= n;
    while(n>0){
      n=n/10;
      count++;

    }
   //Approach 1 
   int divisor = (int)Math.pow(10,k);
   int firstpart =temp/divisor;
   int secondpart = temp%divisor;

  int rotated = secondpart*(int)Math.pow(10,count-k)+firstpart;
    


    
    //Approach 2 
    
   
    // int rotated =0;
    // int position =1;
  
    // while(temp>0){
    //   int rem = temp%10;
    //   int nplace = (position+k)%count;
    //   rotated = rotated+rem*(int)Math.pow(10,nplace);
    //   temp=temp/10;
    //   position++;
      
    // }
 

    
    return rotated;
  }
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int newno = rotate(n,k);
      System.out.println(newno);
  }
}