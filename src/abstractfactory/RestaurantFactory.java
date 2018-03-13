package abstractfactory;

import abstractfactory.restaurant.*;
import abstractfactory.user.User;
import abstractfactory.user.UserType;

/**
 * Created by coupang on 2018. 3. 12..
 */
public class RestaurantFactory extends AbstractFactory {
	@Override
	public Restaurant get(MenuType menuType) {
		if (menuType.equals(MenuType.DOMINOPIZZA)) {
			return new DominoPizza();
		} else if (menuType.equals(MenuType.PIZZAHUT)) {
			return new PizzaHut();
		}
		return new NeneChicken();
	}

	@Override
	public User get(UserType userType) {
		throw new RuntimeException();
	}
}
