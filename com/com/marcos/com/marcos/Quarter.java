package com.marcos;
public class Quarter extends Money
{

    public Quarter(int count)
    {
        super(count);
        value = .25;
    }

    public Quarter()
    {
        // super(count);
        value = .25;
    }

    @Override
    public String totalValue()
    {
        return count + "Quarters";
    }
}
