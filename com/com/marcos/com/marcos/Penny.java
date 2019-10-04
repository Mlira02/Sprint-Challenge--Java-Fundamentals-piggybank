package com.marcos;

public class Penny extends Money
{
    public Penny(int count)
    {
        super(count);
        value = .01;
    }

    public Penny()
    {
        value = .01;
    }

    @Override
    public String totalValue()
    {
        return count + " Penny";
    }
}
