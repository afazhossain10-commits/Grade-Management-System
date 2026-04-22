import java.util.*;

public class GradeManagementSystem {
    static ArrayList<StudentGrade> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== Grade Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAll();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void addStudent() {
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        int[] marks = new int[3]; // 3 subjects
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("Enter marks (0-100): ");
                int m = sc.nextInt();
                if (m >= 0 && m <= 100) {
                    marks[i] = m;
                    break;
                } else {
                    System.out.println("Invalid marks!");
                }
            }
        }

        students.add(new StudentGrade(name, marks));
    }

    static void viewAll() {
        for (StudentGrade s : students) {
            ReportGenerator.generateReport(s);
        }
    }

    static void searchStudent() {
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        for (StudentGrade s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                ReportGenerator.generateReport(s);
                return;
            }
        }
        System.out.println("Student not found");
    }
}
