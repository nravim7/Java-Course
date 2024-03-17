public class sum_even_numbers {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        /*while(n<=5){
            int num = 2*n;
            sum = sum+num;
            n++;
        }
        System.out.println("The Sum of Even Numbers is: "+sum); */


        while(n<=10){
            if(n%2==0) {
                sum = sum+n;
            }

            n++;
        }
        System.out.println("The Sum of Even Numbers is: "+sum);
    }
}
