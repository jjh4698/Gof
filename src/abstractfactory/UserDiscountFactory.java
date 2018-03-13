package abstractfactory;

import abstractfactory.restaurant.MenuType;
import abstractfactory.restaurant.Restaurant;
import abstractfactory.user.*;

/**
 * Created by coupang on 2018. 3. 13..
 */
public class UserDiscountFactory extends AbstractFactory {
	@Override
	public Restaurant get(MenuType menuType) {
		throw new RuntimeException();
	}

	@Override
	public User get(UserType userType) {
		if (userType.equals(UserType.GOLD)) {
			return new GoldUser();
		} else if (userType.equals(UserType.SLIVER)) {
			return new SliverUser();
		}
		return new BronzeUser();
	}

}
