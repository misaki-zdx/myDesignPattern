package commandPattern;

/**
 * @author Miskai
 * @date 2019/3/11
 * <p>
 * Invoker
 */
public class Waiter {
    private Order order;

    public Waiter(Order order) {
        this.order = order;
    }

    public void submit() {
        order.execute();
    }
}
