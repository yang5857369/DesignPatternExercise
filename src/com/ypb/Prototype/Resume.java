package com.ypb.Prototype;

/**
 * @author ypb
 * @date 2021/8/15 21:10
 */
public class Resume implements Cloneable {

    private String name;
    private int age;
    private String sex;
    private WorkExperience workExperience;

    public Resume(WorkExperience workExperience) {
        this.workExperience = (WorkExperience) workExperience.Clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public Object Clone() {
        Object o = null;
        try {
            Resume resume = (Resume)this.clone();
            resume.setWorkExperience((WorkExperience)this.workExperience.Clone());
            o = resume;
        }catch (Exception e){
            e.printStackTrace();
        }

        return o;
    }

    public Resume() {
    }
}
