package com.gunnarsturla.restaurantappgi;

/**
 * Created by thorhildur on 10.10.2014.
 * This class communicates with the web service to update the xml file if
 * a new version is available.
 */
public class Communicator {
    public int versionNumber;

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }
}
