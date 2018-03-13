package abstractfactory.restaurant;

/**
 * Created by coupang on 2018. 3. 12..
 */
public class PizzaHut implements Restaurant {

	private String dow;
	private String ingredient;
	private Long price;

	public PizzaHut() {
		ingredient = "chillCrip";
		dow = "cheeze";
		price = 20000L;
	}

	@Override
	public String getMenu() {
		return ingredient + dow + String.valueOf(price);
	}
}
