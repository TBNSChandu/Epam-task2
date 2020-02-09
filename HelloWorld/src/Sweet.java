package com.epam.GiftAnalysis;

public class Sweet implements NewYearGift {
	protected Integer weight, price;
    protected String name;

    public Sweet(String name, Integer weight, Integer price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public Integer getPrice() 
    {
    
        return this.price;
    }

    @Override
    public Integer getWeight() {

        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public void addWeight(Integer weight) {
        this.weight += weight;
    }

    public void addPrice(Integer price) {
        this.price += price;
    }

}