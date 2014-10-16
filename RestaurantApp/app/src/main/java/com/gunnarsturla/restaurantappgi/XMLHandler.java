package com.gunnarsturla.restaurantappgi;
import android.util.Log;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

/**
 * Created by thorhildur on 12.10.2014.
 * Þessi klasi bregst við gögnum úr XML skránni og býr til hluti
 */
public class XMLHandler extends DefaultHandler {
    // List to hold all menu items fro xml file
    private List<Item> items = null;
    private Item item = null;

    public List<Item> getItems() {
        return items;
    }

    // boolean variables for all Item variables
    boolean bId = false;
    boolean bPrice = false;
    boolean bCals = false;
    boolean bName = false;
    boolean bDesc = false;
    boolean bIngr = false;
    boolean bImgh = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        Log.i("START", String.format("Start element: %s", qName));
        if (qName.equalsIgnoreCase("item")){
//            String sId = attributes.getValue("id");
//            int id = Integer.getInteger(sId);
//            item = new Item(0);
        }
        else if (qName.equalsIgnoreCase("name")){
            bName = true;
        }
        else if (qName.equalsIgnoreCase("price")){
            bPrice = true;
        }
        else if (qName.equalsIgnoreCase("calories")){
            bCals = true;
        }
        else if (qName.equalsIgnoreCase("description")){
            bDesc = true;
        }
        else if (qName.equalsIgnoreCase("ingredients")){
            bIngr = true;
        }
        else if (qName.equalsIgnoreCase("name")){
            bImgh = true;
        }
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        System.out.println("End element: " + qName);
        if (qName.equalsIgnoreCase("item")){
            items.add(item);
        }
    }
    @Override
    public void characters(char ch[], int start, int length) throws SAXException{
        if (bPrice) {
            item.setPrice(Integer.parseInt(new String(ch, start, length)));
            bPrice = false;
        }
    }
}
