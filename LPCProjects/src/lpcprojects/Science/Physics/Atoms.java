package lpcprojects.Science.Physics;

import abhishekjava.Science.Constants;
import java.math.BigDecimal;

/**
 *
 * @author Abhishek
 */
public 

 class Atoms {

    /**
     * no. of electron in atom.
     */
    public int electron;
    /**
     * no. of neutron in nucleus.
     */
    public int neutron;
    /**
     * no. of potons in nucleus.
     */
    public int proton;

    public double getNuclearRadius() {
        return BigDecimal.valueOf(Constants.r_o).multiply(BigDecimal.valueOf(Math.pow(proton + neutron, 1 / 3))).doubleValue();
    }
}
