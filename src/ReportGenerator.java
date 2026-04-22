public class ReportGenerator {

    public static void generateReport(StudentGrade s) {
        int[] marks = s.getMarks();

        double avg = GradeCalculator.calculateAverage(marks);
        int high = GradeCalculator.getHighest(marks);
        int low = GradeCalculator.getLowest(marks);
        char grade = GradeCalculator.getGrade(avg);

        System.out.println("\n--- Report ---");
        System.out.println("Name: " + s.getName());
        System.out.println("Average: " + avg);
        System.out.println("Highest: " + high);
        System.out.println("Lowest: " + low);
        System.out.println("Grade: " + grade);
    }
}
