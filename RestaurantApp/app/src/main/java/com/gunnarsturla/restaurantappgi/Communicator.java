package com.gunnarsturla.restaurantappgi;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * Created by thorhildur on 10.10.2014.
 * This class communicates with the web service to update the xml file if
 * a new version is available.
 */
public class Communicator {
    public int versionNumber;
    public String webUrl;
    public XMLReader webreader; //SAX Xml parser

    public Communicator() {
        try {
            webreader = XMLReaderFactory.createXMLReader(); //xml parser
        } catch (SAXException e) {
            e.printStackTrace();
        }
        webUrl = "file:///home/thorhildur/AndroidStudioProjects/RestaurantApp/dummy.xml"; //web service url
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }
}
