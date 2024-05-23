package Arraydequepract;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;
import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque arraydeque=new ArrayDeque();
        arraydeque.add(78);
        arraydeque.add(89);
        arraydeque.add(90);
        arraydeque.add(100);
        Iterator iterator=arraydeque.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
