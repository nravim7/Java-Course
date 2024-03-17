import java.util.Scanner;

public class CBSE {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);
        System.out.println("Enter Subject1 Marks: ");
        float subject1 = student.nextInt();

        System.out.println("Enter Subject2 Marks: ");
        float subject2 = student.nextInt();

        System.out.println("Enter Subject3 Marks: ");
        float subject3 = student.nextInt();

        System.out.println("Enter Subject4 Marks: ");
        float subject4 = student.nextInt();

        System.out.println("Enter Subject5 Marks: ");
        float subject5 = student.nextInt();


        float totalMarks = subject1+subject2+subject3+subject4+subject5;

        System.out.println(totalMarks);
        float percentage = (totalMarks*100)/500;

        System.out.println("The Percentage is: "+percentage);
    }
}
