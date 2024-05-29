package hashset14;

import java.util.HashSet;
import java.util.Set;

public class UniqueVisitorTracker {
    private Set<String> visitorIPs;

    public UniqueVisitorTracker() {
        visitorIPs = new HashSet<>();
    }

    public void addVisitorIP(String ip) {
        visitorIPs.add(ip);
    }

    public boolean checkIPExists(String ip) {
        return visitorIPs.contains(ip);
    }

    public void removeIP(String ip) {
        visitorIPs.remove(ip);
    }

    public void displayVisitorIPs() {
        System.out.println("Unique Visitor IPs:");
        for (String ip : visitorIPs) {
            System.out.println(ip);
        }
    }

    public static void main(String[] args) {
        UniqueVisitorTracker tracker = new UniqueVisitorTracker();
        tracker.addVisitorIP("192.168.0.1");
        tracker.addVisitorIP("192.168.0.2");
        tracker.addVisitorIP("192.168.0.1");

        tracker.displayVisitorIPs();

        System.out.println("\nCheck if '192.168.0.2' has visited: " + tracker.checkIPExists("192.168.0.2"));

        tracker.removeIP("192.168.0.2");
        tracker.displayVisitorIPs();
    }
}