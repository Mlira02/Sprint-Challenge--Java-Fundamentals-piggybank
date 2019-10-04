package com.marcos;

public abstract class Money
{
    public int count = 1;
    public double value;

    public Money(int count)
    {
        this.count = count;
    }

    public Money()
    {

    }

    public abstract String totalValue();


    public int getCount()
    {
        return count;
    }

    public double getTally()
    {
        return count * value;
    }

}