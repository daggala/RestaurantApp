package com.gunnarsturla.restaurantappgi;
import android.util.Log;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author thorhildur
 */
public class XMLParser {
    public XMLParser(){
    }
    public List<Item> parseXML() {
        Log.i("Parsing", "came here");
        InputStream xmlInput;
        xmlInput = null;
        try {
            xmlInput = new URL("https://raw.githubusercontent.com/daggala/RestaurantApp/master/RestaurantApp/app/src/main/w8rmenu.xml").openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        List<Item> items = null;
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            XMLHandler handler = new XMLHandler();
            saxParser.parse(xmlInput, handler);
            items = handler.getItems();
//            for (Item item : items) {
//                Log.i(item.getId());
//            }
        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return items;
    }
}