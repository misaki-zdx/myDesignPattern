package commandPattern;

/**
 * @author Miskai
 * @date 2019/3/11
 *
 *  好处：请求者和执行者无耦合，自动识别。
 */
public class Client {
    public static void main(String[] args) {
        HotDishesChef hotDishesChef = new HotDishesChef();
        HotDishes hotDishes = new HotDishes(hotDishesChef);
        Waiter waiter = new Waiter(hotDishes);
        waiter.submit();
    }
}
