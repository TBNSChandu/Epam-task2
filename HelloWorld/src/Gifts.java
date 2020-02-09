package com.epam.GiftAnalysis;
import java.util.*;
public class Gifts {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Chocobar> choccobar = new ArrayList<Chocobar>();
    static ArrayList<Sweet> sweet = new ArrayList<Sweet>();

    public static void main(String[] args) {
        inputChocobar();
        inputSweet();
        System.out.println("Total Weight of the Gifts: " + totalWeight());
        System.out.println();
        System.out.println("Total Price of the Gifts: " + totalPrice());
        System.out.println();
        System.out.println("Details of Gifts after sorting by: ");
        System.out.println();
        System.out.println("1. Weight");
        sortedByWeight();
        System.out.println();
        System.out.println("2. Price");
        sortedByPrice();
    }
    private static void inputChocobar() {
        System.out.println("Enter No. of Chocobar in Gift");
        int numberOfChocobar = input.nextInt();
        for (int itr = 0; itr < numberOfChocobar; itr++) {
            System.out.println("Enter Weight of the Chocobar:");
            int weight = input.nextInt();
            System.out.println("Enter Price of the Chocobar:");
            int price = input.nextInt();
            System.out.println("Select from below options: ");
            System.out.println("1. FiveStar \n2. Eclairs");
            int typeOfChocobar = input.nextInt();
            boolean flag = false;
            switch (typeOfChocobar) {
            case 1:
                for (Chocobar item : chocolates) 
                {
                    if (item.getName() == "FiveStar") 
                    {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) 
                {
                	Fivestar dm = new FiveStar(weight, price);
                    chocobar.add(dm);
                }
                break;
            case 2:
                for (Chocobar item : chocolates) 
                {
                    if (item.getName() == "Eclairs") 
                    {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) 
                {
                	Eclairs k = new Eclairs(weight, price);
                    chocobar.add(k);
                }
                break;
            default:
                System.out.println("Please Enter a valid Option");
                itr--;
                break;
            }
        }

    }

    private static void inputSweet() {
        System.out.println("Enter No. of Sweet in Gifts");
        int numberOfSweet = input.nextInt();
        for (int itr = 0; itr < numberOfSweet; itr++) 
        {
            System.out.println("Enter Weight of the Sweets:");
            int weight = input.nextInt();
            System.out.println("Enter Price of the Sweets:");
            int price = input.nextInt();
            System.out.println("Select from below options: ");
            System.out.println("1. Kaju \n2. Jangri ");
            int typeOfSweets = input.nextInt();
            boolean flag = false;
            switch (typeOfSweets) 
            {
            case 1:
                for (Sweets item : sweets) 
                {
                    if (item.getName() == "Kaju") 
                    {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) {
                    KajuBarfi kaju = new Kaju(weight, price);
                    sweets.add(kaju);
                }
                break;
            case 2:
                for (Sweets item : sweets) 
                {
                    if (item.getName() == "Jangri") 
                    {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) 
                {
                    Jangri g = new Jangri(weight, price);
                    sweets.add(g);
                }
                break;
            
            default:
                System.out.println("Please Enter a valid Option");
                itr--;
                break;
            }
        }
    }

    public static int totalWeight() 
    {
        int total1 = 0;
        for (Chocobar item : chocobar) 
        {
            total1 += item.getWeight();
        }
        for (Sweet item : sweet) 
        {
            total1 += item.getWeight();
        }

        return total1;

    }
    public static int totalPrice() 
    {
        int total2 = 0;
        for (Chocobar item : chocobar) 
        {
            total2 += item.getPrice();
        }
        for (Sweet item : sweet) 
        {
            total2 += item.getPrice();
        }

        return total2;
    }
    public static void sortedByWeight() {
        Comparator<Chocobar> chocobarWeightComparator = (Chocobar c1,Chocobar c2) -> ((Integer)c1.getWeight().compareTo(c2.getWeight()));
        Collections.sort(chocobar, chocobarWeightComparator);

        for (Chocolates i : chocolates) {
            System.out.println("Name of Chocobar: " + i.getName());
            System.out.println("Weight of Chocobar: " + i.getWeight());
            System.out.println("Price of Chocobar: " + i.getPrice());
            System.out.println();
        }

        Comparator<Sweet> sweetsWeightComparator = (Sweet c1,Sweet c2) -> ((Integer) c1.getWeight().compareTo(c2.getWeight()));
                

        Collections.sort(sweet, sweetWeightComparator);

        for (Sweets i : sweet) {
            System.out.println("Name of Sweet: " + i.getName());
            System.out.println("Weight of Sweet: " + i.getWeight());
            System.out.println("Price of Sweet: " + i.getPrice());
            System.out.println();
        }
    }

    public static void sortedByPrice() {
        Comparator<Chocobar> chocobarPriceComparator = (Chocobar c1,Chocobar c2) -> ((Integer) c1.getPrice().compareTo(c2.getPrice()));
                

        Collections.sort(chocobar, chocobarPriceComparator);

        for (Chocobar i : chocobar) {
            System.out.println("Name of Chocolate: " + i.getName());
            System.out.println("Weight of Chocolate: " + i.getWeight());
            System.out.println("Price of Chocolate: " + i.getWeight());
            System.out.println();
        }

        Comparator<Sweet> sweetPriceComparator = (Sweet c1,Sweet c2) -> ((Integer) c1.getPrice().compareTo(c2.getPrice()));
                

        Collections.sort(sweet, sweetPriceComparator);

        for (Sweet i : sweet) {
            System.out.println("Name of Sweet: " + i.getName());
            System.out.println("Weight of Sweet: " + i.getWeight());
            System.out.println("Price of Sweet: " + i.getWeight());
            System.out.println();
        }
    }
}
