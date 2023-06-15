/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modules;

/**
 *
 * @author Esraa
 */
public class Invoices {
    
    private int msisdn;
    private String rate_plan_name;
    private double rate_plan_price;
    private String service_package_name;
    private double service_package_price;
    private int minutes_consumption;
    private int total_cost;
public Invoices(){
        
        this.msisdn = 0;
        this.rate_plan_name = null;
        this.rate_plan_price = 0.0;
        this.service_package_name = null;
        this.service_package_price = 0.0;
        this.minutes_consumption = 0;
        this.total_cost = 0;
        
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public String getRate_plan_name() {
        return rate_plan_name;
    }

    public void setRate_plan_name(String rate_plan_name) {
        this.rate_plan_name = rate_plan_name;
    }

    public double getRate_plan_price() {
        return rate_plan_price;
    }

    public void setRate_plan_price(double rate_plan_price) {
        this.rate_plan_price = rate_plan_price;
    }

    public String getService_package_name() {
        return service_package_name;
    }

    public void setService_package_name(String service_package_name) {
        this.service_package_name = service_package_name;
    }

    public double getService_package_price() {
        return service_package_price;
    }

    public void setService_package_price(double service_package_price) {
        this.service_package_price = service_package_price;
    }

    public int getMinutes_consumption() {
        return minutes_consumption;
    }

    public void setMinutes_consumption(int minutes_consumption) {
        this.minutes_consumption = minutes_consumption;
    }

    public int getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
    }

}
