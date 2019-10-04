package com.marcos;

public class Dime extends Money
{
    public Dime(int count)
    {
        super(count);
        value = .1;
    }

    public Dime()
    {
        value = .1;
    }



    @Override
    public String totalValue()
    {
        return count + "Dimes";
    }
}
