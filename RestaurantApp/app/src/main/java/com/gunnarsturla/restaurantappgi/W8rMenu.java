package com.gunnarsturla.restaurantappgi;

import java.util.Vector;

/**
 * Created by Gunnar on 9.10.14.
 *
 */
public class W8rMenu {
	private Vector<SubMenu> subMenus;

<<<<<<< HEAD


    public W8rMenu()

=======
	public W8rMenu() {
		subMenus = new Vector<SubMenu>();
	}

	public SubMenu[] getSubMenus() {
		SubMenu sm[] = new SubMenu[subMenus.size()];
		subMenus.toArray(sm);
		return sm;
	}
	
>>>>>>> origin/master
}