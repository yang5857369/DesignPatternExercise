package com.ypb.Prototype;

/**
 * @author ypb
 * @date 2021/8/15 21:13
 */
public class Test {

    public static void main(String[] args) {
        Resume resume = new Resume();
        WorkExperience workExperience = new WorkExperience();
        workExperience.setWorkDate("2020");
        resume.setAge(1);
        resume.setWorkExperience(workExperience);
        Resume clone = (Resume)resume.Clone();
        clone.setAge(2);
        clone.getWorkExperience().setWorkDate("2021");
        System.out.println(resume.getAge());
        System.out.println(resume.getWorkExperience().getWorkDate());
        System.out.println(clone.getAge());
        System.out.println(clone.getWorkExperience().getWorkDate());

    }
}
