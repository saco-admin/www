//class digitsum
//Problem "Digit Sum" for SACO 2nd round 2007
//Solution by Shen Tian

import java.io.*;

public class digitsums {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(in.readLine());
    System.out.println(sum(N));
  }
  
  public static int sum(int x){
    if (x<10)
      return x;
     else
      return sum(x/10 + x%10);
  }
}
