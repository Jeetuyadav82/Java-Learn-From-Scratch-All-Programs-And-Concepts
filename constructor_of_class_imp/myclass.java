package constructor_of_class_imp;

public class myclass {
    public static void main(String args[])
    {
        cube cube1 = new cube();
        System.out.println(cube1.getCubeVolume());

        cube cube2=new cube(20,20,20);
        System.out.println(cube2.getCubeVolume());


    }
}
