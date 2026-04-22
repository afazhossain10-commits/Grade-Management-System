public class StudentGrade {
    private String name;
    private int[] marks;

    public StudentGrade(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int[] getMarks() { return marks; }
}
