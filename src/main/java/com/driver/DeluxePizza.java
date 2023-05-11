package com.driver;

public class DeluxePizza extends Pizza {
    private int price;
    private String bill;
    private boolean extracheese=true;
    private boolean extratoppings=true;
    private boolean parcel;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.parcel=false;
        setExtracheese(true);
        setToppings(true);
        // your code goes here
        if(isVeg){
            this.price=300+80+70;
            this.bill=Integer.toString(this.price);
        }
        else{
           this.price=400+80+120;
            this.bill=Integer.toString(this.price);
        }
        setPrice(this.price);
        setBill(this.bill);
    }
}
