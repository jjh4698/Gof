import factoryPattern.RestaurantFactory;
import factoryPattern.restaurant.MenuType;
import factoryPattern.restaurant.Restaurant;

public class Main {

	public static void main(String[] args) {
		RestaurantFactory restaurantFactory = new RestaurantFactory();

		Restaurant restaurant;

		for (MenuType menuType : MenuType.values()) {
			restaurant = restaurantFactory.get(menuType);
			System.out.println(restaurant.getMenu());
		}
	}

}
