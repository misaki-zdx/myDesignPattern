package commandPattern;

/**
 * @author Miskai
 * @date 2019/3/11
 */
public class HotDishes implements Order {
    private HotDishesChef hotDishesChef;

    public HotDishes(HotDishesChef hotDishesChef) {
        this.hotDishesChef = hotDishesChef;
    }

    public void execute() {
        hotDishesChef.cook();
    }
}
