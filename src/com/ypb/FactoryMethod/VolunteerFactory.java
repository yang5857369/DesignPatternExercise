package com.ypb.FactoryMethod;

/**
 * @author ypb
 * @date 2021/8/15 20:11
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
