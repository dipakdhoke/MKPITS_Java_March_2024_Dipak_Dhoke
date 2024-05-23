package practicefileexampl;
import java.io.*;
import java.util.Scanner;

public class Occurence {

    public static void occurenceOfString(String chk_str,String str)
    {
        File file =new File(chk_str);
        int count =0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;

            string = bufferedReader.readLine();
            while (string != null)
            {
                String[] str1=string.split(" ");
                for (String s:str1)
                {
                    if (s.equalsIgnoreCase(str))
                    {
                        count++;
                    }
                }
                string = bufferedReader.readLine();
            }
            bufferedReader.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(str+" is"+count+" times");
    }
}
