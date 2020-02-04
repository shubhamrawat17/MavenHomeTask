package com.Epam;

public class Chocolate extends Sweet {

    public Chocolate(String name,int qty)
    {
        super(name,qty);
        if(name.equals("Nestle"))
        {
            this.weight = 30;
        }
        else if(name.equals("Mars"))
        {
            this.weight = 15;
        }
        else if(name.equals("Cadbury"))
        {
            this.weight = 20;
        }
        else if(name.equals("Amul"))
        {
            this.weight = 25;
        }
    }

}

