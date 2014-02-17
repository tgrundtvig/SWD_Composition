/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compositionexample;

/**
 *
 * @author tog
 */
public class IntStack
{
    private int[] array;
    private int top;

    public IntStack(int maxSize)
    {
        top = -1;
        array = new int[maxSize];
    }
    
    
    public void push(int i)
    {
        array[++top] = i;
    }
    
    public int pop()
    {
        return array[top--];
    }
    
    public void pushAll(int[] ints)
    {
        for(int i : ints)
        {
            push(i);
        }
    }
    
    public int size()
    {
        return top + 1;
    }
    
}
