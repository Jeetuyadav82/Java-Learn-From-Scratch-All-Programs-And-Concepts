package constructor_of_class_imp;

public class cube {
    int length;
    int breadth;
    int height;

    public int getCubeVolume()
    {
        return (length * breadth * height);
    }

    cube() // constructor 1st imp
    {
        length = 10;
        breadth =20;
        height = 30;
    }

    cube( int l, int b, int h) // constructor 2nd imp
    {
        length =l;
        breadth = b;
        height = h;
    }

}
