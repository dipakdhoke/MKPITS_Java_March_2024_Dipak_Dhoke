package hashset15;

import java.util.HashSet;
import java.util.Set;

public class UniqueCourseEnrollment {
    private Set<String> courseCodes;

    public UniqueCourseEnrollment() {
        courseCodes = new HashSet<>();
    }

    public void addCourseCode(String courseCode) {
        courseCodes.add(courseCode);
    }

    public boolean checkCourseCodeExists(String courseCode) {
        return courseCodes.contains(courseCode);
    }

    public void removeCourseCode(String courseCode) {
        courseCodes.remove(courseCode);
    }

    public void displayCourseCodes() {
        System.out.println("Unique Course Codes:");
        for (String code : courseCodes) {
            System.out.println(code);
        }
    }

    public static void main(String[] args) {
        UniqueCourseEnrollment enrollment = new UniqueCourseEnrollment();
        enrollment.addCourseCode("CS101");
        enrollment.addCourseCode("MATH123");
        enrollment.addCourseCode("CS101");

        enrollment.displayCourseCodes();

        System.out.println("\nCheck if 'MATH123' exists: " + enrollment.checkCourseCodeExists("MATH123"));

        enrollment.removeCourseCode("MATH123");
        enrollment.displayCourseCodes();
    }
}
