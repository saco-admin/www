 //class dominoes
 //Problem "Dominoes" for SACO 2nd round 2007
 //Solution by Shen Tian
 
 import java.io.*;
 import java.util.*;
 
 public class dominoes {
   public static void main(String[] args) throws IOException{
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int N = Integer.parseInt(in.readLine());
     int[] a = new int[N];
     for (int i = 0; i < N; i++)
       a[i] = Integer.parseInt(in.readLine());
     int ans = 0;
     for (int i = 0; i < N; i++){
       boolean[] knocked = new boolean[N];
       Arrays.fill(knocked, false);
       int dom = i;
       int num = 0;
       while (!knocked[dom]){
         knocked[dom]=true;
         num++;
         dom = (dom + a[dom]) % N;
       }
       if (num==N)
         ans++;
     }
     System.out.println(ans);
   }
 }
