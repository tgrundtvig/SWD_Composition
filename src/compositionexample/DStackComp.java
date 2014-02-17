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
public class DStackComp implements IntegerStack
{
    private IntegerStack stack;

    public DStackComp(int maxSize)
    {
        stack = new IntStack(maxSize);
    }
    
    
    @Override
    public void push(int i)
    {
        stack.push(i*2);
    }

    @Override
    public int pop()
    {
        return stack.pop();
    }

    @Override
    public void pushAll(int[] ints)
    {
        for(int i : ints)
        {
            stack.push(i*2);
        }
    }

    @Override
    public int size()
    {
        return stack.size();
    }
    
}
