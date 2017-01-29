package cz.jzeman.swagger.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jazeman on 27/01/2017.
 */
@XmlRootElement
public class PlusResult extends Plus {
    final public int result;

    public PlusResult(final int operatorA, final    int operatorB) {
        super(operatorA, operatorB);
        this.result = operatorA + operatorB;
    }

    public PlusResult(final Plus plus) {
        super(plus);
        this.result = operatorA + operatorB;
    }

    public PlusResult() {
        super();
        this.result = 0;
    }

    public int getResult() {
        return result;
    }
}
