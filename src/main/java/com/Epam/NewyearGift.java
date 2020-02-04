package com.Epam;

import java.util.Scanner;

public class NewyearGift
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of chocolates to add to gift");
        int num1 = sc.nextInt();
        System.out.println("Enter total number of candies to add to gift");
        int num2 = sc.nextInt();
        double totalwt=0;
        Sweet choco[] = new Chocolate[num1];
        double chocoweight[] = new double[num1];
        Sweet candy[] = new Candyy[num2];
        double candyweight[] = new double[num2];
        System.out.println("The candiess that are available are: Cadbury choclairs, Pulse, Kopico, Just jelly");
        for(int i=0;i<num2;i++)
        {
            System.out.println("Enter "+(i+1)+"candy name to add in gift");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter "+(i+1)+"candy quantity");
            int quantity = sc.nextInt();
            candy[i] = new Candyy(name,quantity);
            candyweight[i] = candy[i].weight*quantity;
            totalwt += candyweight[i];
        }
        System.out.println("The chocolates that are available are: Nestle, Mars, Cadbury, Amul ");
        for(int i=0;i<num1;i++)
        {
            System.out.println("Enter "+(i+1)+"chocolate name to add in gift");
            sc.nextLine();
            String Name = sc.nextLine();
            System.out.println("Enter "+(i+1)+"chocolate quantity");
            int qty1 = sc.nextInt();
            choco[i] = new Chocolate(Name,qty1);
            chocoweight[i] = choco[i].weight*qty1;
            totalwt += chocoweight[i];
        }

        System.out.println("Total weight of the Gift is "+totalwt+"gms");

        System.out.println("Press 1 to sort the chocolates by it total weight ");
        System.out.println("Enter 2 for searching a candy in the Gift");
        System.out.println("Enter 3 for displaying chocolates and candies in the Gift");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 :
                for (int i=0;i<num1;i++)
                {
                    for (int j=i+1;j<num1;j++)
                    {
                        if(chocoweight[i]>chocoweight[j])
                        {
                            Sweet temp = choco[i];
                            choco[i] = choco[j];
                            choco[j] = temp;
                        }
                    }
                }
                System.out.println("The chocolates in the gift after sorting are");
                for(int i=0;i<num1;i++)
                {
                    System.out.print(choco[i].name);
                    System.out.print(" ");
                }
                System.out.println();
                break;
            case 2:
                String cdyname = sc.nextLine();
                for(int i=0;i<candy.length;i++)
                {
                    if(candy[i].name.equalsIgnoreCase(cdyname))
                    {
                        System.out.println(cdyname+" is present in the gift");
                        break;
                    }
                    else
                    {
                        System.out.println(cdyname+" is not present in the List");
                        break;
                    }
                }
                break;
            case 3:
                System.out.print("The candies added in the gift are: ");
                for(int i=0;i<candy.length;i++)
                {
                    System.out.print(candy[i].name+" ");
                }
                System.out.println();
                System.out.print("The chocolates added in the gift are: ");
                for(int i=0;i<choco.length;i++)
                {
                    System.out.print(choco[i].name+" ");
                }
                System.out.println();
                break;
        }


    }
}
