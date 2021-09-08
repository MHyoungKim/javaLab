package Example;

public class ShopService {
	private static ShopService singleton = new ShopService();
	private ShopService() {}
	ShopService getInstance(){
		return singleton;
	}
}
