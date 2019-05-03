/* Testing break and continue for label-statement
 * For break statement:: Enclosing blocks can be us
 * For continue statement:: Eclosing loops can be used
*/


class Example4
{
    public static void labelTest1()
    {
        label1:for(int i=0; i<10; i++)
        {
            label2:for(int j=0; j<i; j++)
            {
                label3:
                {
                    System.out.print(j+" ");
                    if(2*j > i) break label2;
                }
            }
            System.out.println("");
        }
    }

    public static void labelTest2()
    {
        label1:for(int i=0; i<10; i++)
        {
            label2:for(int j=0; j<i; j++)
            {
                label3:
                {
                    System.out.print(j+" ");
                    if(2*j > i) continue label2;
                }
            }System.out.println("");

            label4:for(int j=0; j<i; j++)
            {
                label5:
                {
                    System.out.print(j+" ");
                    if(2*j > i) continue label4;
                }
            }System.out.println("");
        }
    }

    public static void main(String[] args) 
    {
        labelTest1();
        labelTest2();
    }
}