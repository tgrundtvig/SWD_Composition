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
public class DStackExtend extends IntStack
{

    public DStackExtend(int maxSize)
    {
        super(maxSize);
    }
    
    @Override
    public void push(int i)
    {
        super.push(i*2);
    }
    
}
