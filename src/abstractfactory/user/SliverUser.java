package abstractfactory.user;

/**
 * Created by coupang on 2018. 3. 13..
 */
public class SliverUser implements User {
	@Override
	public long getDiscount() {
		return 20L;
	}
}
