public class loops_practise {
    public static void main(String[] args) {

        for(int i=5; i>0; i--) {
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int k=2; k<=5; k++){
            for(int j=1; j<=k; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
