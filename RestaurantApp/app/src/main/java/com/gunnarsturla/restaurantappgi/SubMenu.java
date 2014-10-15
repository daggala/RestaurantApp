package com.gunnarsturla.restaurantappgi;

import java.util.Vector;

/**
 * Hver undirmatseðill í matseðilstrénu,
 * td. Forréttir, eða drykkir
 */
public class SubMenu {
	private String 	name,
					description,
					imghash;
	private Vector<Item> items;

	public SubMenu(String name, String description, String imghash) {
		this.name 		 = name;
		this.description = description;
		this.imghash	 = imghash;
		items = new Vector<Item>();
	}

	public boolean addItem(Item i) {
		return items.add(i);
	}

	public int	  length()			{ return items.size();	}
	public String getName()   		{ return name; 			}
	public String getDescription()  { return description;   }
	public String getImghash()		{ return imghash;   	}
	public Item   getItem(int i)	{ return items.get(i);	}
/*	public Item[] getItems() {
		Item it[] = new Item[items.size()];
		items.toArray(it);
		return it;}*/

}