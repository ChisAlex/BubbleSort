package com.company;

public class SalesRepresentatives {
    private String name;
    private int sales;
    private int quota;
    private int revenue;

    public SalesRepresentatives(String name, int sales, int quota, int revenue) {
        this.name = name;
        this.sales = sales;
        this.quota = quota;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getSales() {

        return sales;
    }

    public void setSales(int sales) {

        this.sales = sales;
    }

    public int getQuota() {

        return quota;
    }

    public void setQuota(int quota) {

        this.quota = quota;
    }

    public int getRevenue() {

        return revenue;
    }

    public void setRevenue(int revenue) {

        this.revenue = revenue;
    }

    public String toString() {
        return "Salesman [name=" + name + ", sales=" + sales + ", quota=" + quota + ", revenue=" + revenue + "]";
    }

}


