/** Basic Java Program
 * To test basic functionality
 * Class files is basicExample
 * there are several common fn
 */

 class basicExample
 {

    // Integer operation in java //
    public static void IntegerOperation(int a, int b)
    {
        long ans1 = (long)(a)*(long)(b);
        System.out.println(a + "*" + b + " = " + ans1 );

        int ans2 = a+b;
        System.out.println(a + "+" + b + " = " + ans2);
        
    }

    // Simple DataTypes //
    public static void PrimitiveDataType()
    {
        // integers + literals //
        byte    b = 0xa8; // 8 bits 
        short   s = 0x00a8; // 16 bits
        int     i = 0xffffffa8; // 32 bits
        long    l = 0xffL; // 64 bits
        
        // others //
        char    c = 'h'; // 8bits
        boolean t = true; // idk

        // real numbers //
        float   f = 2.2; // 32 bits
        double  d = 3.2; // 64 bits

        System.out.println("Integer Object: "+b+" "+s+" "+i+" "+l);
        System.out.println("Real Number: "+f+" "+d);
        System.out.println("charcher and boolean: "+c+" "+t);

        // Literals
        // 0x   -> hex
        // 0476 -> Octal
        // 2355 -> decimal
        
        /** In JAVA the variable has different memory structure
         *  Mostly something like (header + payload) and sources
         *  says it is 8byte(64 bits) aligned
         *  Let's see what we find in future
         */
    }

    // Array declaration //
    public static void ArrayDeclaration()
    {
        int arr1[] = {1,2,3,5}; // legacy way or standard way //
        int[] arr2 = {1,2,3,4}; // More recent way to declare array of primitive data types//
        System.out.println(arr1);
        System.out.println(arr2);

        int[][][] MDarr;
        MDarr = new int[10][10][10];
        System.out.println(MDarr);

    }

    public static void main(String[] arg)
    {
        ArrayDeclaration();
    }
 }