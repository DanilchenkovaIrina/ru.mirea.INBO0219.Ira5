package ru.mirea.INBO0219.Ira5;

public class Solution14
{
    public static int recursion(int n)
    {
        if (n < 10)
        {
            return n;
        }
        else
        {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(recursion(123));
    }
}
