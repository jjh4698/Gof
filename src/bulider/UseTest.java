package bulider;

import bulider.builders.WebSiteBuilder;
import bulider.customer.TeamVenice;
import bulider.product.WebSite;

/**
 * Created by coupang on 2018. 3. 14..
 */
public class UseTest {
	public static void main(String[] args) {
		// 어떻게 하든지 WebSite 를 만들기는 하는데, 세부 구현 방법이 다를 뿐이다.
		TeamVenice teamVenice = new TeamVenice(new WebSiteBuilder());

		WebSite webSite = teamVenice.makeWebsite();
		System.out.println(webSite);
	}
}
