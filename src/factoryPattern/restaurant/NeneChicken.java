package factoryPattern.restaurant;

/**
 * Created by coupang on 2018. 3. 12..
 */
public class NeneChicken implements Restaurant {

	private String chicken;
	private Long price;
	private String sauce;

	public NeneChicken() {
		chicken = "harim";
		price = 20000L;
		sauce = "chile";
	}

	@Override
	public String getMenu() {
		return chicken + sauce + price;
	}
}
