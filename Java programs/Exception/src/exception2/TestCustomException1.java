package exception2;

public class TestCustomException1  {
    public void agedis(int a) throws invalidage{
       if(a<0||a>100){
           {
               throw new invalidage();
           }

       }
        System.out.println(a);

    }

}
