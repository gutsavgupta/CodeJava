/* This Example is to extensively test
 * Enchanced For-loop functioning
 * whether refernces can chage values in multi
 * dimensional arrays
 */

class ch3Example2
{
    public static void TestControl1()
    {
        final int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        // testing loop 1
        for(int[] x:arr)
        for(int j =0; j<4; j++)
            x[j] += 1; 
        

        for(int[] x:arr)
        for(int   xi:x)
            System.out.println(xi);
           
        return;
    }

    public static void main(String[] args) 
    {
        // TestControl1 //
        TestControl1();    
    }
}
