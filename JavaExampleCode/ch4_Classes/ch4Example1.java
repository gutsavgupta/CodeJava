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

    tCUBE(int L, int B, int W)
    {
        len = L; 
        bre = B; 
        wid = W;
    }

    void DisplayVolume()
    {
        long vol = (long)len * (long)bre * (long)wid;
        System.out.println("The volume of cube is: " + vol);
    }

}


class ch4Example1
{
    public static void main(String[] args) 
    {
        tCUBE cube1 = new tCUBE(10,20,30);
        tCUBE cube2 = new tCUBE(11,30,12);

        cube1.DisplayVolume();
        cube2.DisplayVolume();
    }
}