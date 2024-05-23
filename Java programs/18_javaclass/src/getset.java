import javax.jws.soap.SOAPMessageHandlers;

public class getset {
       private String name;
       private int marks;


    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }

}
