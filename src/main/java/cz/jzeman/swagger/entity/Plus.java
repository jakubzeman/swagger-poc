package cz.jzeman.swagger.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jazeman on 27/01/2017.
 */
@XmlRootElement
public class Plus {
    final public int operatorA;
    final public int operatorB;

    public Plus(final int operatorA, final int operatorB) {
        this.operatorA = operatorA;
        this.operatorB = operatorB;
    }

    public Plus(final Plus plus) {
        this.operatorA = plus.getOperatorA();
        this.operatorB = plus.getOperatorB();
    }

    public Plus() {
        this.operatorA = 0;
        this.operatorB = 0;
    }

    public int getOperatorA() {
        return operatorA;
    }

    public int getOperatorB() {
        return operatorB;
    }
}
