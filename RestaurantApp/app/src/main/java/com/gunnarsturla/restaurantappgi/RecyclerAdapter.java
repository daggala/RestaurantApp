package com.gunnarsturla.restaurantappgi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Gunnar on 23.10.14.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
	//private W8r w8r;

	// Provide a reference to the views for each data item
	// Complex data items may need more than one view per item, and
	// you provide access to all the views for a data item in a view holder
	public static class ViewHolder extends RecyclerView.ViewHolder {
		// each data item is just a string in this case
		public TextView itemName, itemDescryption;
		public ViewHolder(View v) {
			super(v);
			itemName = (TextView) itemView.findViewById(R.id.itemName);
			itemDescryption = (TextView) itemView.findViewById(R.id.itemDestription);
		}
	}

	// Provide a suitable constructor (depends on the kind of dataset)
	public RecyclerAdapter() {
		//this.w8r = w8r;
	}

	// Create new views (invoked by the layout manager)
	@Override
	public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
												   int viewType) {
		// create a new view
		View v = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.card_item, parent, false);
		// set the view's size, margins, paddings and layout parameters


		return new ViewHolder(v);
	}

	// Replace the contents of a view (invoked by the layout manager)
	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		// - get element from your dataset at this position
		// - replace the contents of the view with that element
		holder.itemName.setText(W8r.get(0).get(position).getName());
		holder.itemDescryption.setText(W8r.get(0).get(position).getDescription());

	}

	// Return the size of your dataset (invoked by the layout manager)
	@Override
	public int getItemCount() {
		return W8r.get(0).length();
	}
}