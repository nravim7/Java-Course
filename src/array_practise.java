import java.util.Scanner;
public class array_practise {
    public static void main(String[] args) {
       /* float [] grades = {9.7f, 8.8f, 6.9f, 9.2f, 9.9f};
        float sum = 0.0f;
        for(int i=0; i<grades.length; i++) {
            sum += grades[i];
        }
        System.out.println("The Sum is: "+sum);


        int [] grades = {9, 7, 6, 2, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Search an Element!!");
        int n = sc.nextInt();
        boolean isInArray = false;
        for(int i=0; i<grades.length; i++) {
            if(grades[i]==n) {
               isInArray = true;
                break;
            }

        }
        if(isInArray) {
            System.out.println("The element is Present!!");
        }
        else {
            System.out.println("Sorry, element is not present");
        }


        int [] marks = {100, 99, 98, 97,80,78,94};
        int sum = 0;
        float average;
        for(int element: marks) {
            sum+=element;
        }
        average = sum/marks.length;
        System.out.println("The average marks is: "+average);


        int [][] marks1 = {{1,2,3},
                           {4,5,6}};
        int [][] marks2 = {{7,8,9},
                           {10,11,12}};

        int [][] result = {{0,0,0},
                           {0,0,0}};

        for(int i=0; i<marks1.length; i++) {
            for(int j=0; j<marks1[i].length; j++) {
                result[i][j] += marks1[i][j] + marks2[i][j];

            }

        }
        for(int i=0; i< result.length; i++) {
            for(int j=0; j<result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");

        }



        int [] marks = {100, 99, 98, 97,500,78,94};
        int max = 0;
        for(int i=0; i<marks.length; i++) {
            if(marks[i]>max) {
                max = marks[i];
            }
        }
        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for(int i=0; i<marks.length; i++) {
            if(marks[i]< min) {
                min = marks[i];
            }
        }
        System.out.println(min);


        */
        int [] marks = {100, 99, 98, 97,500,78,94};
        int temp;
        for(int i=0; i<marks.length-1; i++) {
            if(marks[i] > marks[i+1]) {

                marks[i] = marks[i+1];
                temp = marks[i];
                marks[i+1] = temp;



            }
        }
        for (int mark : marks) {
            System.out.print(mark + " ");
        }



    }
}
