public class GradeCalculator {

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    public static int getHighest(int[] marks) {
        int max = marks[0];
        for (int m : marks)
            if (m > max) max = m;
        return max;
    }

    public static int getLowest(int[] marks) {
        int min = marks[0];
        for (int m : marks)
            if (m < min) min = m;
        return min;
    }

    public static char getGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 50) return 'D';
        else return 'F';
    }
}
