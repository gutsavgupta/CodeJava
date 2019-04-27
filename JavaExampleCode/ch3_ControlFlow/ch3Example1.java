/**
 * This Program intends to test control flow
 * in java programming environment and we will
 * try to see more tricky conditions
 */

 class Example1
 {

   public static void TestControl2()
   {
      int sum   = 0;
      int[] arr = {1,2,3,4,5,6,7};
   
      for(int x: arr)   sum += x;
      System.out.println(sum);
   }

   public static void TestControl1()
   {
      char test1 = 'a';
      char test2 = 'b';

      if(test1 == 'a' && test2 =='b')
      {
         System.out.println("test1 == a & test2 ==b");
      }
      else if(test1 == 'a')
      {
         System.out.println("test1 == a");
      }
      else if(test2 == 'b')
      {
         System.out.println("test2 == b");
      }
      else
      {
         System.out.println("Invalid Inputs");
      }
      return;
   }

   public static void main(String[] args) 
   {
      /**
       * We will test three major concept of control flow
       * 1. Control statement (if-else && switch)
       * 2. Iteration (do-while, for-loop(variation) )
       * 3.
       */ 
      
      // For-Each loop test //
      TestControl2();

      // If-Else control test //
      TestControl1();

      return;   
   }

 }

