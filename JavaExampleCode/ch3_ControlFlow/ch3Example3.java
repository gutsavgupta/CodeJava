/* This java program is to test control jump statements 
* Statements like break, continue, return
*/

class Example3
{
    public static void TestJump1()
    {
        // Break
        int i = 0;
        while(i>=0){ System.out.println(i++); if (i>10) break;}
    }

    public static void TestJump2()
    {
        // Continue
        for(int i=0; i<20; i++)
        {
            if(i%2==0) continue;
            System.out.println(i);
        }
    }

    public static void TestJump3()
    {
        // return
        while(true)
        {
            return;
        }
    }

    public static void main(String[] args) 
    {
        // we will going to test 3 JUMP statements
        // 1. Break
        // 2. Continue
        // 3. return
        // Note Java dosen't allow goto command
        // reason being it unsafe for program to jump
        // to JVM addresses and take control
        
        TestJump1();
        TestJump2();
        TestJump3();
        return;
    }
}
