package com.Epam;

public class Candyy extends Sweet
{
    public Candyy(String name,int qty)
    {
        super(name,qty);
        if(name.equals("Cadbury choclairs"))
        {
            this.weight = 1;
        }
        else if(name.equals("Pulse"))
        {
            this.weight = 3;
        }
        else if(name.equals("Kopico"))
        {
            this.weight = 7;
        }
        else if(name.equals("Just jelly"))
        {
            this.weight = 5;
        }
        this.qty = qty;
    }
}
