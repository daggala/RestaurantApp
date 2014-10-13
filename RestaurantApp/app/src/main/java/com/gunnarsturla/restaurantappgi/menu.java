package com.gunnarsturla.restaurantappgi;
package com.menu.xml;

/**
 * Created by Gunnar on 9.10.14.
 */
public class menu {
}

public class item {
    private int id;
    private String name;
    private String description;
    private int price;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(String int) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return "Employee:: ID="+this.id+" Name=" + this.name + " Price=" + this.price + " Description=" + this.description;
    }





}