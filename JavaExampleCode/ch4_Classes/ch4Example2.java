/* Example-2 Ch4 --> Implementing a stack class 
 * Stack features implemented
 * 1. void push(long element)
 * 2. long pop()
 * 3. long top()
 * 4. long[] pop(long count)
 * 5. long[] top(long count)
 * 
*/

class tSTACK
{
    // array is used to store element //
    long[] stackData;
    int   stackSize;
    int   stackMsiz;

    // default constructor //
    tSTACK()
    { 
        this.stackMsiz = 20;
        this.stackData = new long[this.stackMsiz];
        this.stackSize = 0; 
    }

    // Param constructor //
    tSTACK(int size)
    {
        this.stackMsiz = (size < 0 ? 0: size) > 100 ? 100 : (size < 0 ? 0: size);
        this.stackData = new long[this.stackMsiz];
        this.stackSize = 0;
    }

    // Push operation //
    void push(long elem)
    {
        if(stackSize < stackMsiz-1)
        {
            stackData[stackSize++] = elem;
        }
        else
        {
            // exception handler //
        }
    }

    // Pop operation //
    long pop()
    {
        if(stackSize > 0)
        {
            return stackData[--stackSize];
        }
        else
        {
            // exception handler //
        }
        return -1;
    }

    // top operation //
    long top()
    {
        if(stackSize > 0)
        {
            return stackData[stackSize-1];
        }
        else
        {
            // exception handler //
        }
        return -1;
    }
}

class ch4Example2
{
    public static void main(String[] args) 
    {
        tSTACK myStack = new tSTACK(50);

        for(long i=0; i<10; i++)
        {
            myStack.push(i*i);
        }

        while(myStack.stackSize != 0)
        {
            System.out.println("Stack.pop() = " + myStack.pop() + " Stack.size() = " + myStack.stackSize);
        }
    }
}