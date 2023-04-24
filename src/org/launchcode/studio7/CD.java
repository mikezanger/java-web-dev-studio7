package org.launchcode.studio7;

import java.util.HashMap;

public class CD extends BaseDisk implements OpticalDisk {
    public CD(String discData) {
        super(discData);
    }

    public CD(HashMap<String, String> reportInfo) {
        super(reportInfo);
    }

    public CD(boolean isInserted) {
        super(isInserted);
    }

    public CD(double maxCapacityInMB) {
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
