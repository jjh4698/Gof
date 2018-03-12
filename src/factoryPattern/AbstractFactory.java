package factoryPattern;

import factoryPattern.restaurant.MenuType;
import factoryPattern.restaurant.Restaurant;

/**
 * Created by coupang on 2018. 3. 12..
 */
public abstract class AbstractFactory {
	public abstract Restaurant get(MenuType menuType);
}
