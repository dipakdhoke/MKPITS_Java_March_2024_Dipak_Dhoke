package practicefileexampl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class noofwordsline {
    public static void nofwordsline(String str) throws IOException {
        int lines=0,word=0,charr=0;
        BufferedReader bufferedReader=new BufferedReader(new FileReader(str));
        String namestr=bufferedReader.readLine();
        System.out.println(namestr);
         String strs [];

        while (namestr != null) {
              strs=namestr.split(" ");
              for (int i=0;i< strs.length;i++){
                  word++;
                  for (int j=0;j<strs[i].length();j++){
                      charr++;
                  }

              }


                lines++;
              namestr =bufferedReader.readLine();

        }
        System.out.println("no of lines are :"+lines+"no of words are:"+word+"no of char is:"+charr);
        }
    }

