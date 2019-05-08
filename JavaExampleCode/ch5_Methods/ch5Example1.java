/* This example we will learn more about  
 * classes and methods and access specifier
 * 1. Simple Methods
 * 2. Access Specifier -> Private, Public, Protected
 * 3. Package
*/

/* Default access specifier 
 * Public within the package
 * cannot be accessed outside the package
*/

class tAVERAGE
{
    private int     NumSize;
    private double  Average;

    // default constructor //
    tAVERAGE()
    {
        NumSize = 0;
        Average = 0.0;
    }

    double GetAverage()
    {
        return Average;
    }

    void AddNum(int Num)
    {
        Average = (Average*(NumSize++) + Num)/(NumSize);
    }
}


class ch5Example1
{
    public static void main(String[] args) 
    {
        String printStatement = "The average of sum of square 1 to ";
        tAVERAGE avg = new tAVERAGE();
        for(int i=0; i<10; i++)
        { 
            avg.AddNum((i+1)*(i+1));
            System.out.println(printStatement + (i+1) +": " + avg.GetAverage());
            // System.out.println(printStatement + (i+1) +": " + avg.Average); // Invalid Statement
        }
    }
}