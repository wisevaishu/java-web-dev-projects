package org.launchcode;

public interface OpticalDisc {
    double MinSpinRate = 0;
    double MaxSpinRate = 0;

    void spinDisc();
    void storeData();
    void readData();
    void reportInformation();
}
