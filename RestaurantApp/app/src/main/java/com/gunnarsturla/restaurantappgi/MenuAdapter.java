package com.gunnarsturla.restaurantappgi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

/**
 * Created by Gunnar on 14.10.14.
 */
public class MenuAdapter  extends BaseExpandableListAdapter {

	private Context context;
	private W8rMenu SuperMenu;

	public MenuAdapter(Context context) {
		this.context = context;
	}

	@Override
	public View getChildView(int i, int i2, boolean b, View view, ViewGroup viewGroup) {
		return null;
	}

	@Override
	public boolean isChildSelectable(int i, int i2) {
		return false;
	}

	@Override
	public int getChildrenCount(int i) {
		return 0;
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
		return 0;
	}

	@Override
	public Object getGroup(int i) {
		return null;
	}

	@Override
	public long getGroupId(int i) {
		return 0;
	}

	@Override
	public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
		return null;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}


}
