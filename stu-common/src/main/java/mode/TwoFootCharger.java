package mode;

/**
 * @author zhoufe
 * @date 2018/12/4 15:10
 */
public class TwoFootCharger implements Charge {


    /**
     * 两只脚的充电功能
     * @params []
     * @return void
     * @author zhoufe
     * @date 2018/12/4 15:15
     */
    @Override
    public void charge() {
        System.out.println("two foot charge" + true);
    }
}
