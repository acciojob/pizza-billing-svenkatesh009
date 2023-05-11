package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extracheese;
    private boolean extratoppings;
    private boolean parcel;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extracheese=false;
        this.extratoppings=false;
        this.parcel=false;
        // adding bill amount based on veg or non-veg
        if(isVeg){
            this.bill=Integer.toString(300);
            this.price=300;
        }
        else {
            this.bill = Integer.toString(400);
            this.price=400;
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        // if extra cheese amount is not added
        if(!extracheese){
            int billdummy=Integer.parseInt(bill);
            billdummy+=80;
            bill=Integer.toString(billdummy);
            extracheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        // if the toppings amount is not added;
        if(!extratoppings){
            int billdummy=Integer.parseInt(bill);
            // if it is veg
            if(isVeg){
                billdummy+=70;
                bill=Integer.toString(billdummy);
            }
            // if it is non-veg
            else{
                billdummy+=120;
                bill=Integer.toString(billdummy);
            }
            extratoppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!parcel){
            int billdummy=Integer.parseInt(bill);
            billdummy+=20;
            bill=Integer.toString(billdummy);
            parcel=true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setBill(String bill){
        this.bill=bill;
    }
    public void setExtracheese(boolean extracheese){
        this.extracheese=extracheese;
    }
    public void setToppings (boolean extratoppings){
        this.extratoppings=extratoppings;
    }
}
