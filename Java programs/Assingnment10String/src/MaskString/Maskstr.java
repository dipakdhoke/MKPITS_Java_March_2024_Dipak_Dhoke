package MaskString;

public class Maskstr {
    public void mask(String str){
     StringBuffer strbuf=new StringBuffer();
     for(int i=0;i<str.length();i++){
         if(str.charAt(i)=='a'||str.charAt(i)=='b'||str.charAt(i)=='c'){
             continue;
         }else {
             strbuf.append(str.charAt(i));
         }
     }
        System.out.println(strbuf);
    }
}
