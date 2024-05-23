public class sum {

    public static int sum(int... num){
        int s=0;
        for(int i:num){
            s=s+i;
        }

        return s;
    }
}
