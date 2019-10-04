package com.marcos;

public class Nickel extends Money
{
    public Nickel(int count)
    {
        super(count);
        value = .05;
    }

    public Nickel()
    {
        value = .05;
    }

    @Override
    public String totalValue()
    {
        return count + "nickels";
    }
}