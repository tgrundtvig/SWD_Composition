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
public class StackTest
{
    public static void main(String[] args)
    {
        IntegerStack s = new DStackComp(100);
        
        for(int i = 1; i <= 10; ++i)
        {
            s.push(i);
        }
        System.out.println("First example:");
        while(s.size() > 0)
        {
            System.out.println(s.pop());
        }
        
        int[] oneToTen = {1,2,3,4,5,6,7,8,9,10};
        
        s.pushAll(oneToTen);
        
        System.out.println("Second example:");
        while(s.size() > 0)
        {
            System.out.println(s.pop());
        }
    }
}
