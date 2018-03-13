package abstractfactory;

import abstractfactory.restaurant.MenuType;
import abstractfactory.restaurant.Restaurant;
import abstractfactory.user.User;
import abstractfactory.user.UserType;

/**
 * Created by coupang on 2018. 3. 12..
 */
public abstract class AbstractFactory {
	public abstract Restaurant get(MenuType menuType);
	public abstract User get(UserType userType);
	// how to add india Food?
	// 1. add MenuType.
	// 2. RestaurantFactoryMethod modify
	// 3. create IndiaFood

	// how to add non-Restaurant Interface?

	// 4 wheel + car
}
