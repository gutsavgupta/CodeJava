/**This chapter is all about operators in java
 * I will try to put tricky operators in this 
 * programs to bring all the highligts
 */

 class Example1
 {
     public static void automaticTypePromo()
     {
         byte b;

         b = (byte)2*b;     // Invalid statement 
         b = (byte) 2*b;    // Typecasting because type promotion to int
         b *= 2;            // Implicit Typecase
     }

    /**Airthmetic Operators     -> { *, /, %, +, -, ++, --, +=, -=, *=, /=, %=}
      * Logical Operators       -> { ==, |, &, ~, ^, !, ||, &&, ?:}
      * Bitwise Operators       -> { &, |, ~, !, ^, >>, >>>, <<}
      * Relational Operators    -> {==, <, >, <=, >=, !=}
      * For Precendence refer to "Pg 75: Complete reference to JAVA"
     */

     public static void main(String[] args) 
     {
         automaticTypePromo();
     }
 }