package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisk {

    //Variable
    private String discData;
    private HashMap<String, String> reportInfo;

    private boolean isInserted;

    private final double maxCapacityInMB;
    private final double maxSpinInRPM;

    public String getDiscData() {
        return discData;
    }

    public void setDiscData(String discData) {
        this.discData = discData;
    }

    public HashMap<String, String> getReportInfo() {
        return reportInfo;
    }

    public void setReportInfo(HashMap<String, String> reportInfo) {
        this.reportInfo = reportInfo;
    }

    public boolean isInserted()
    {return this.isInserted;}



    public void setInserted(boolean inserted) {
        isInserted = inserted;
    }

    public double getMaxCapacityInMB() {
        return maxCapacityInMB;
    }

    public double getMaxSpinInRPM() {
        return maxSpinInRPM;
    }
    //Constructors

    public BaseDisk(String discData) {
        this.discData = "";
    }

    public BaseDisk(HashMap<String, String> reportInfo) {
        this.reportInfo = reportInfo;
    }

    public BaseDisk(boolean isInserted) {
        this.isInserted = false;
    }

    public BaseDisk(double maxCapacityInMB) {
        this.maxCapacityInMB = maxCapacityInMB;
    }

    //Methods
}
