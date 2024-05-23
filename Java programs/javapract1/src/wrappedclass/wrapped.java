package wrappedclass;

public class wrapped {
  public void integer(){
        int num=9898;
        String s="5678";
        int u=8878;

        Integer i =new Integer(num);//boxing
        int a=i.intValue();//unboxing
        System.out.println(a);
        int sa=i.parseInt(s);
        System.out.println(sa);
        Integer ia=u;// auto-boxing
        ia.intValue();
        int x=ia;//auto-unboxing;
        System.out.println(x);
        String  v=i.toBinaryString(num);
        System.out.println(v);
    }
    }

