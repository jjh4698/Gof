package bulider.builders;

import bulider.product.WebSite;

/**
 * Created by coupang on 2018. 3. 13..
 */
public interface Builder {
	void uxDesign();
	void backendCoding();
	void frontCoding();
	WebSite getProduct();
}
