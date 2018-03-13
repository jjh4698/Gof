package bulider.customer;

import bulider.builders.Builder;
import bulider.product.WebSite;

/**
 * Created by coupang on 2018. 3. 13..
 */
public class TeamVenice {
	private Builder builder;

	public TeamVenice(Builder builder) {
		this.builder = builder;
	}

	public WebSite makeWebsite() {
		builder.backendCoding();
		builder.frontCoding();
		builder.uxDesign();

		return builder.getProduct();
	}
}
