
class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }


}

class cellphone {
    public void ringing() {
        System.out.println("Ringing.....");
    }

    public void vibrating() {
        System.out.println("Vibrating..");
    }
}

class cricketGame {
    private int run;
    private String name;

    public void setRun(int num) {
        run = num;
    }

    public int getRun(){
        return run;
    }

    public void setName(String a) {
        name = a;
    }

    public String getName(){
        return name;
    }
}
class square {
    int side;
    public int area() {
        return side*side;
    }

    public int perimeter() {
        return 4*side;
    }
}

public class oops1 {
    public static void main(String[] args) {

      /* cellphone apple = new cellphone();
       cellphone samsung = new cellphone();

       apple.ringing();
       samsung.vibrating();

       */

        /*square square1 = new square();
        square1.side = 4;

        System.out.println(square1.area());
        System.out.println(square1.perimeter());

         */

        cricketGame player1 = new cricketGame();
        player1.setName("Kohli");
        player1.setRun(100);

        System.out.println(player1.getName());
        System.out.println(player1.getRun());




    }
}
