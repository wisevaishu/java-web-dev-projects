package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone c1, Cone c2) {
        if (c1.getCost() - c2.getCost() < 0){
            return -1;
        } else if (c1.getCost() - c2.getCost() > 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
