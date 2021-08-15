package com.ypb.Decorator;

/**
 * @author ypb
 * @date 2021/8/13 20:53
 */
public class Decorator extends Component {
    // previous Node
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 此处执行的是component的Operation，不是Decorator的操作（Decorator的operation执行的是component的）
     */
    @Override
    public void Operation() {

        if (component != null) {
            component.Operation();
        }
    }
}
