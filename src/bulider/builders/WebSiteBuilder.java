package bulider.builders;

import bulider.product.BackendCoding;
import bulider.product.FrontCoding;
import bulider.product.UxDesign;
import bulider.product.WebSite;

/**
 * Created by coupang on 2018. 3. 13..
 */
public class WebSiteBuilder implements Builder {
	private WebSite webSite;

	public WebSiteBuilder() {
		this.webSite = new WebSite();
	}

	@Override
	public void uxDesign() {
		webSite.setUxDesign(new UxDesign());
	}

	@Override
	public void backendCoding() {
		webSite.setBackendCoding(new BackendCoding());
	}

	@Override
	public void frontCoding() {
		webSite.setFrontCoding(new FrontCoding());
	}

	@Override
	public WebSite getProduct() {
		return this.webSite;
	}
}
