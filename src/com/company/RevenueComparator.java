package com.company;
import java.util.Comparator;

public class RevenueComparator implements Comparator<SalesRepresentatives> {
    public int compare (SalesRepresentatives sr1, SalesRepresentatives sr2){
        return sr1.getRevenue() - sr2.getRevenue();
    }

}
