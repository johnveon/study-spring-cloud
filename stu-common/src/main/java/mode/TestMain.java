package mode;

/**
 * @author zhoufe
 * @date 2018/12/4 15:20
 */
public class TestMain {

    public static void main(String[] args) {

        Charge charge = new TwoFootCharger();
        charge.charge();


        Charge charge1 = new ThreeFootChargeAdapteResult();
        charge1.charge();

    }
}
