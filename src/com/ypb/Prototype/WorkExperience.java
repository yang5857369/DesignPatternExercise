package com.ypb.Prototype;

/**
 * @author ypb
 * @date 2021/8/15 21:11
 */
public class WorkExperience implements Cloneable {

    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public Object Clone() {
        Object o = null;
        try {
            return o = this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}
