package com.gunnarsturla.restaurantappgi;

/**
 * Created by Dagny on 14.10.2014.
 */
public class keyraMenu {

    public static W8rMenu build() {
        Item item1 = new Item(1, 999, 520, "Horpuskeljar", "Gott", "Rjomi, sjavardyr og allskonar", "11");
        Item item2 = new Item(2, 1999, 920, "Hamborgari", "Snilld", "Kal, gurka, tomatur, kjot", "12");
        Item item3 = new Item(item1);
        Item item4 = new Item(item2);

        SubMenu sm1 = new SubMenu("Forrettur", "", "21");
        SubMenu sm2 = new SubMenu("Adalrettur", "", "22");

        if (!sm1.addItem(item1)) {
            System.out.println("Error: ekki tókst að bæta " + item1.getName() + " við í SubMenu " + sm1.getName());
        }
        if (!sm1.addItem(item2)) {
            System.out.println("Error: ekki tókst að bæta " + item2.getName() + " við í SubMenu " + sm1.getName());
        }
        if (!sm2.addItem(item3)) {
            System.out.println("Error: ekki tókst að bæta " + item3.getName() + " við í SubMenu " + sm2.getName());
        }
        if (!sm2.addItem(item4)) {
            System.out.println("Error: ekki tókst að bæta " + item4.getName() + " við í SubMenu " + sm2.getName());
        }

        W8rMenu wm = new W8rMenu();

        if (!wm.addSubMenu(sm1)) {
            System.out.println("Error: ekki tókst að bæta" + sm1.getName() + "við í W8rMenu");
        }
        if (!wm.addSubMenu(sm2)) {
            System.out.println("Error: ekki tókst að bæta" + sm2.getName() + "við í W8rMenu");
        }

        return wm;
    }


}
