package com.epam.GiftAnalysis;

public class FiveStar extends Chocobar{
	public FiveStar(Integer weight, Integer price) {
        super("DairyMilk", weight, price);
}
}
///////////////////////////////////////////////////////
Jangri.java
//////////////////////////////////////////////////
package com.epam.GiftAnalysis;

public class Jangri extends Sweet{
	public Jangri(Integer weight, Integer price) {
        super("Jangri", weight, price);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.name;
    }

    @Override
    public Integer getPrice() {
        // TODO Auto-generated method stub
        return super.price;
    }

    @Override
    public Integer getWeight() {
        // TODO Auto-generated method stub
        return super.weight;
    }

    @Override
    public void addWeight(Integer weight) {
        super.weight += weight;
    }

    @Override
    public void addPrice(Integer price) {
        super.price += price;
    }
}
