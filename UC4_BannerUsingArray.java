public class UC4_BannerUsingArray{
    public static void main(String[] args) {
        // Initialize the input values
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens per student using Division
        int pensPerStudent = totalPens / totalStudents;

        // Calculate remaining pens using Modulus
        int remainingPens = totalPens % totalStudents;

        // Display the output as requested
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}