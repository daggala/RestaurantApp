package com.gunnarsturla.restaurantappgi;

import java.util.Vector;

/**
 * Hver undirmatseðill í matseðilstrénu,
 * td. Forréttir, eða drykkir
 */
public class subMenu {
	private String 	name,
			description,
			imghash;
	private Vector items = new Vector();

	public subMenu(String name, String description, String imghash) {
		this.name 		 = name;
		this.description = description;
		this.imghash	 = imghash;
	}

	public boolean addItem(item i) {
		return items.add(i);
	}

	public String getName()   		{ return name; }
	public Object[] getItems() 		{ return items.toArray(); }
	public String getDescription()  { return  description; }
	public String getImghash()		{ return imghash;   }
}

/** Bara athuga hvernig þetta virkar **/