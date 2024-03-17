public class two_D_Arrays {
    public static void main(String[] args) {
        int [] [] flats = new int[2][3];
        flats[0][0] = 000;
        flats[0][1] = 001;
        flats[0][2] = 002;
        flats[1][0] = 100;
        flats[1][1] = 101;
        flats[1][2] = 102;

        for(int i=0; i<flats.length; i++) {
            for(int j=0; j<flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }
}
