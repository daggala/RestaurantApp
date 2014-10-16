package com.gunnarsturla.restaurantappgi;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * @author Þórhildur Magnúsdóttir
 * @since 12.10.14
 * This class communicates with the web service to update the xml file if
 * a new version is available.
 */

public class XMLParser {
    public int versionNumber;
    public String webUrl, localUrl;
    public XMLReader webreader; //SAX Xml parser

    public XMLParser() {
        try {
            webreader = XMLReaderFactory.createXMLReader(); //xml parser
        } catch (SAXException e) {
            e.printStackTrace();
        }
        webUrl = "https://notendur.hi.is/thm30/XMLParsing/employees.xml"; //web service url
        localUrl = "file:///home/thorhildur/employees.xml"; // local url to xml
    }

}
