package org.launchcode.studio7;

import java.util.HashMap;

public class DVD extends BaseDisk implements OpticalDisk{
    public DVD(String discData) {
        super(discData);
    }

    public DVD(HashMap<String, String> reportInfo) {
        super(reportInfo);
    }

    public DVD(boolean isInserted) {
        super(isInserted);
    }

    public DVD(double maxCapacityInMB) {
        super(maxCapacityInMB);
    }

    @Override
    public void spin() {

    }

    @Override
    public void storeData(String data) {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
