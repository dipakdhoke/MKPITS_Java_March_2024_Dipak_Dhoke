package Vector;

import java.util.Vector;

public class Vectorprac {
    public static void main(String[] args) {
        Vector vector=new Vector(2);
        vector.add("Dipak");
        vector.add("shreyash");
        vector.add("item3");
        vector.add("item4");
        vector.add("item5");
        vector.add("item6");
        System.out.println(vector.size());
        System.out.println(vector.capacity());
        System.out.println(vector.contains("item6"));
        System.out.println(vector.clone());
        for (int i=0;i< vector.size();i++){
            System.out.println(vector.elementAt(i));
        }
        for(Object vector1:vector){
            System.out.println(vector1);
        }
        System.out.println(vector.lastIndexOf("item5"));


    }
}
