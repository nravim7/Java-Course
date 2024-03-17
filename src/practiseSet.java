import java.util.Scanner;
import java.util.Random;

public class practiseSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter Subject 1 marks: ");
        int subject1 = sc.nextInt();

        System.out.println("Enter Subject 2 marks: ");
        int subject2 = sc.nextInt();

        System.out.println("Enter Subject 3 marks: ");
        int subject3 = sc.nextInt();
        float percentage = (subject1+subject2+subject3)*100/300.0f;

        if(percentage>=40 && subject1>=33 && subject2>=33 && subject3>=33) {
            System.out.println("You scored: "+percentage);
            System.out.println("Congratulations you are passed");
        }
        else {
            System.out.println("You scored: "+percentage);
            System.out.println("Try Again Good luck!!!");
        } */

        /*System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        if(year%4==0) {
            System.out.println("Leap");
            if(year%400==0){
                System.out.println("Leap");
                if (year%100!=0) {
                    System.out.println("Leap");
                }

            }

        }
        else{
            System.out.println("Not a Leap");
        } */

        /*System.out.println("Enter the site name");
        String websiteName = sc.nextLine();
        if(websiteName.endsWith(".com")) {
            System.out.println("Its a Commercial Website");
        }
        else if(websiteName.endsWith(".org")) {
            System.out.println("Organisations Site");
        }
        else if(websiteName.endsWith(".in")) {
            System.out.println("Indian Site");
        } */


        Random random = new Random();
        System.out.println("USE--->\n \'0\' for ROCK \n \'1\' for PAPER \n \'2\' for SCICCOR");
        System.out.println("ENTRE YOUR INPUT BELOW ");
        int user_input = sc.nextInt();
        int  ai_input = random.nextInt(3);

        if (user_input == ai_input)
        {
            System.out.println("match result: TIE ");
        }else if  (user_input == 0 && ai_input == 2 || user_input == 1 && ai_input == 0 || user_input == 2 && ai_input == 1 )
        {
            System.out.println("you win ");
        } else
        {
            System.out.println("you lose");
        }
        System.out.println("computer input---> "+ai_input);
        // System.out.println("thanks for playing game ");


    }
}


