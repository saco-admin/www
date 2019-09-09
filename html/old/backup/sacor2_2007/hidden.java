// Solution by Charles Bradshaw
 import java.io.*;

public class hidden {

public static void main(String[] args) throws IOException {
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   String rawstr = in.readLine();
   String str="";
   String substr= in.readLine();
   substr = substr.toUpperCase();
   int [] mapper  = new int [rawstr.length()];
   int placem = 0;
   boolean found=false;
// full second array with the mesage read in, striped of punctuation and put to
// upper case,
// keep a array recording where each letter in the new array was in the old

   for(int i =0;i<rawstr.length();i++)
         {
             if (rawstr.charAt(i)>96&&rawstr.charAt(i)<123)
                {
                mapper[placem]=i;
                  str+=(char)(rawstr.charAt(i)-32);
                  placem++;

                  }
             else if (rawstr.charAt(i)>64&&rawstr.charAt(i)<91)
             {
               mapper[placem]=i;
                 str+=rawstr.charAt(i);
                 placem++;
               }
         }
   // now for each start place
   for (int i = 0;i<str.length()-substr.length()+1;i++)
       {
       boolean isanswer = true;
       //see if any of the letters after it is not what it would be if the start place were an answer
       for (int j = 0;j<substr.length();j++)
           {if (str.charAt(i+j)!=substr.charAt(j))
             {isanswer=false;
             }

           }
       if (isanswer)
          {found = true;
          for (int j = mapper[i];j<=mapper[i+substr.length()-1];j++)
           {System.out.print (rawstr.charAt(j));
           }
            System.out.println();
          }
       }
   if(!found)
   { System.out.println("No strings found");       }
   }
}
