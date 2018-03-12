import factoryPattern.RestaurantFactory;
import factoryPattern.restaurant.MenuType;
import factoryPattern.restaurant.Restaurant;
import factoryPattern.UserDiscountFactory;
import factoryPattern.user.User;
import factoryPattern.user.UserType;

public class Main {

	public static void main(String[] args) {
		RestaurantFactory restaurantFactory = new RestaurantFactory();

		Restaurant restaurant;
		User user;
		for (MenuType menuType : MenuType.values()) {
			restaurant = restaurantFactory.get(menuType);
			System.out.println(restaurant.getMenu());
		}

		UserDiscountFactory userDiscountFactory = new UserDiscountFactory();

		for (UserType userType : UserType.values()) {
			user = userDiscountFactory.get(userType);
			System.out.println(user.getDiscount());
		}

	}

}
