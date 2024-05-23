package rev2string;

public class Stringreversed {

    StringBuffer str = new StringBuffer("Java Programs on String");
    public void revstr(){
        String word[];
        str.reverse();
        System.out.println(str);
        word=(str.toString()).split(" ");
        for(int i=word.length-1;i>=0;i--)
        {
            System.out.println(word[i]);
        }
    }

}
