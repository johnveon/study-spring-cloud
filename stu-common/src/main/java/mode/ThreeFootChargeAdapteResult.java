package mode;

/**
 * @author zhoufe
 * @date 2018/12/4 15:19
 */
public class ThreeFootChargeAdapteResult extends ThreeFootCharger implements Charge {
    @Override
    public void charge() {
        specCharge();
    }
}
