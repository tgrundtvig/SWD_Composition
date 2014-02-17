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
public interface IntegerStack
{
    public void push(int i);
    public int pop(); 
    public void pushAll(int[] ints);
    public int size();
}
