package com.gunnarsturla.restaurantappgi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by Gunnar on 14.10.14.
 */
public class MenuAdapter extends BaseExpandableListAdapter {

	private Context context;
//	private SubMenu[] subMenuList;
	private W8rMenu wm;

	public MenuAdapter(Context context, W8rMenu wm) {
		this.context = context;
		this.wm = wm;
		//subMenuList = wm.getSubMenus();

	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
		// Tímabundið textview, til að tékka hvort allt virki ekki.
		// Í framtíðinni á að koma bakgrunnsmynd og fleira fallegt.
		TextView tv = new TextView(context);
		// Þetta finnst mér geðveikt kúl:
		tv.setText(wm.getSubMenu(groupPosition).getItem(childPosition).getName());
		return tv;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return wm.getSubMenu(groupPosition).length();
	}

	@Override
	public Object getChild(int i, int i2) {
		return null;
	}

	@Override
	public long getChildId(int i, int i2) {
		return 0;
	}

	@Override
	public int getGroupCount() {
		return wm.length();
	}

	@Override
	public Object getGroup(int i) {
		return null;
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		TextView tv = new TextView(context);
		tv.setText(wm.getSubMenu(groupPosition).getName());
		return tv;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}


}
