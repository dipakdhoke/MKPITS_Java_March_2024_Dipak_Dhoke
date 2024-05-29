package EventSheaduleSystem9;

import java.util.LinkedList;

public class Eventsheduling {
    LinkedList<Event> events =new LinkedList<Event>();
    public void addnewevent(int eventId, String eventName, String location, String date, String time){
       Event e =new Event( eventId, eventName, location,date, time);
        events.add(e);

    }
    public void searcheventbyname(String eventName){
        for(Event e:events){
            if(e.getEventName()==eventName){
                System.out.println(e);
            }
        }


    }
    public void searcheventbylocation(String location) {
        for (Event e : events) {
            if (e.getLocation() == location) {
                System.out.println(e);
            }
        }

    }
    public static void main(String[] args) {
        Eventsheduling eventsheduling=new Eventsheduling();
        eventsheduling.addnewevent(1,"Event1","Nagpur","23/05/2024","4.12");
        eventsheduling.addnewevent(2,"Event2","Pune","23/05/2024","5.12");
        eventsheduling.addnewevent(3,"Event3","Nagpur","23/05/2024","6.12");
    eventsheduling.searcheventbyname("Event1");
    eventsheduling.searcheventbylocation("Nagpur");
    }

}
