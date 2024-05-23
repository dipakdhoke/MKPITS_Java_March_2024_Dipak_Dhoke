public class member
{
    private String name;
    private String userid;
    private String email;
    private int phoneno;
    private String BooksCheckedout;
//    public member(String name,String userid,String email,int phoneno){
//        this.name=name;
//        this.userid=userid;
//        this.email=email;
//        this.phoneno=phoneno;
//    }
    public String getName(){
        return name;
    }
    public String getUserid(){
        return userid;
    }

    public String getBooksCheckedout(){
        return BooksCheckedout;

    }
}
