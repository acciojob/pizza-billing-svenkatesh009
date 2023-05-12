package com.driver;

public class DeluxePizza extends Pizza {
    private int price;
    private String bill;
    private boolean extracheese=true;
    private boolean extratoppings=true;
    private boolean parcel;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();

    }
}
