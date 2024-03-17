
class Animal {
    public int legs;
    public int tooth;

    public int getLegs() {
        System.out.println("I have legs");
        return legs;
    }

    public void getTooth(){
        System.out.println("I have tooth");
    }

}

class Dog extends Animal {
    public String bark;
    public String tail;

    public void getBark() {
        System.out.println("Bow Bow");
    }

    public String getTail(int n) {
        return "I have "+n+" tail";
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog puppy = new Dog();

        puppy.legs = 4;
        System.out.println(puppy.getLegs());

        puppy.getBark();

        Animal Animal1 = new Animal();
        Animal1.getLegs();

    }
}
