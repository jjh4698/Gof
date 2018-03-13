package abstractfactory.restaurant;

/**
 * Created by coupang on 2018. 3. 12..
 */
public class DominoPizza implements Restaurant {

	private String ingredient;
	private String dow;
	private Long price;

	public DominoPizza() {
		ingredient = "combination";
		dow = "rice";
		price = 30000L;
	}

	@Override
	public String getMenu() {
		return ingredient + dow + String.valueOf(price);
	}
}
