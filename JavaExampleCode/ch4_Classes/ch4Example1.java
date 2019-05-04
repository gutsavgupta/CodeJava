/* This file contains some examples of class definition
 * in java, we will try to explore various concepts of classes
 * will also try to implement few classes as well
 * 1. In Java all class objects are dynamically allocated
 * 2. Use of "dot" operator to access instance variable (outside the class)
 * 3. "dot" operator is not required to access data or method (inside the class)
*/

// Simple class cube
// 1. set L, B, W
// 2. calculate volume
class tCUBE
{
    int len, bre, wid;

    // Constructor wiht no param
    tCUBE()
    {
        len = 0; bre = 0; wid = 0;
    }

    // Constructor with param//
    tCUBE(int len, int bre, int wid)
    {
        this.len = len; 
        this.bre = bre; 
        this.wid = wid;
    }

    // Display Function //
    void DisplayVolume()
    {
        long vol = len * (long)bre * wid;
        System.out.println("The volume of cube is: " + vol);
    }

    // Get Volume function //
    long getVolume()
    {
        return len * (long)bre * wid;
    }

    // Set Dimension variable //
    void setDimension(int len, int bre, int wid)
    {
        this.len = len; 
        this.bre = bre; 
        this.wid = wid;
    }

    // Finalize function //
    // called when object gets out of scope //
    protected void finalize()
    {
        len = 0; bre = 0; wid = 0;
        System.out.println("Finalizer is called");
    } 

}


class ch4Example1
{
    public static void ch4test1()
    {
        tCUBE cube1 = new tCUBE();
        tCUBE cube2 = new tCUBE();

        cube1.setDimension(10, 10, 10);
        cube2.setDimension(200, 300, 400);

        System.out.println("Volume of cube1: " + cube1.getVolume());
        System.out.println("Volume of cube2: " + cube2.getVolume());
    }

    public static void main(String[] args) 
    {
        for(int i=0; i<10; i++)
        {
            ch4test1();
        }
    }
}