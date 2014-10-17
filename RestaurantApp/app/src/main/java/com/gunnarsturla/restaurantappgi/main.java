package com.gunnarsturla.restaurantappgi;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.Vector;

/**
 * @author Gunnar Sturla Ágústuson
 * @since 8.10.14
 * Aðalklasinn sem birtir útlit forritsins og ræsir það.
 */
public class main extends Activity {

	private ExpandableListView menuList;
	private Vector<SubMenu> wm;
	private SubMenu order;

    private XMLParser menuParser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("main", "ran here");
		//Hér þarf að kalla á W8rMenuBuilder(), sem setur menuinn inn í W8rMenuið wm.
        menuParser = new XMLParser();
        menuParser.parseXML();

		wm = keyraMenu.build();
		order = new SubMenu();

		menuList = (ExpandableListView) findViewById(R.id.matsedillExpandable);
		menuList.setAdapter(new MenuAdapter(this, wm, order));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the Menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar Item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
