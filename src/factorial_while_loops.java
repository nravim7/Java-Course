public class factorial_while_loops {
    public static void main(String[] args) {
        int result = 1;
        int i=1;
        while(i<=5) {
            result = result*i;
            i++;
        }
        System.out.println("factorial is: "+result);
    }
}
