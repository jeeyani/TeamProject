package ch06.exam05;

public class ShopService {

	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopservice;
	}
}
