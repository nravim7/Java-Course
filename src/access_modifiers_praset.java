
class cylinder {
    private int radius;
    private int height;

    private float volume;
    private float surfaceArea;

//    public void setRadius(int r) {
//        radius = r;
//    }
    public int getRadius() {
        return radius;
    }

//    public void setHeight(int h) {
//        height = h;
//    }

    public int getHeight() {
        return height;
    }



    public cylinder(int r, int h) {
        radius =r;
        height = h;
    }

    public float getvolume() {
        return volume = 3.14f* radius*radius * height;
    }

    public float surfaceArea() {
        return surfaceArea = 2*3.14f*radius*height+2*3.14f*radius*radius;
    }

}

public class access_modifiers_praset {
    public static void main(String[] args) {

        cylinder c1 = new cylinder(10,20);


        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());

        System.out.println(c1.getvolume());
        System.out.println(c1.surfaceArea());

    }
}
