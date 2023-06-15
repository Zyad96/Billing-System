/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modules;
/**
 *
 * @author Esraa
 */
public class CDR {
    private int imsi;
    private int callingPhoneNo;
    private int calledPhoneNo;
    private int callStartDate,callEndDate,duration;
    private String ratePlan,servicePackage;

    public CDR(int imsi, int callingPhoneNo, int calledPhoneNo, int callStartDate, int callEndDate, int duration, String ratePlan, String servicePackage) {
        this.imsi = imsi;
        this.callingPhoneNo = callingPhoneNo;
        this.calledPhoneNo = calledPhoneNo;
        this.callStartDate = callStartDate;
        this.callEndDate = callEndDate;
        this.duration = duration;
        this.ratePlan = ratePlan;
        this.servicePackage = servicePackage;
    }

    public CDR() {
    }

    public int getImsi() {
        return imsi;
    }

    public void setImsi(int imsi) {
        this.imsi = imsi;
    }

    public int getCallingPhoneNo() {
        return callingPhoneNo;
    }

    public void setCallingPhoneNo(int callingPhoneNo) {
        this.callingPhoneNo = callingPhoneNo;
    }

    public int getCalledPhoneNo() {
        return calledPhoneNo;
    }

    public void setCalledPhoneNo(int calledPhoneNo) {
        this.calledPhoneNo = calledPhoneNo;
    }

    public int getCallStartDate() {
        return callStartDate;
    }

    public void setCallStartDate(int callStartDate) {
        this.callStartDate = callStartDate;
    }

    public int getCallEndDate() {
        return callEndDate;
    }

    public void setCallEndDate(int callEndDate) {
        this.callEndDate = callEndDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRatePlan() {
        return ratePlan;
    }

    public void setRatePlan(String ratePlan) {
        this.ratePlan = ratePlan;
    }

    public String getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(String servicePackage) {
        this.servicePackage = servicePackage;
    }

}
