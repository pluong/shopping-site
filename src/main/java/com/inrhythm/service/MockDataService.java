package  com.inrhythm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.inrhythm.model.Product;

public class MockDataService {
	
	private static final Map<Long, Product> productMap;
	
	public static List<Product> getProductList() {
		return new ArrayList(productMap.values());
	}
	
	public static Product getProduct(Long sku) {
		return productMap.get(sku);
	}

	static {
		productMap = new HashMap<Long, Product>();
		
		Product soup = new Product(1001,"Instant Soup", 3, 1, "images/5.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product noodles = new Product(1002,"Dried Noodles", 5, 1, "images/6.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product pasta = new Product(1003,"Pasta", 3, 1, "images/7.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product rusk = new Product(1004,"Rusk", 5, 1, "images/8.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		
		Product spinach = new Product(1005,"Fresh Spinach (1 kg)", 2, 1, "images/9.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product mango = new Product(1006,"Fresh Mango (1 kg)", 5, 1, "images/10.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product apple = new Product(1007,"Fresh Apple (1 kg)", 6, 1, "images/11.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product brocolli = new Product(1008,"Fresh Brocolli (1 kg)", 4, 1, "images/12.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		
		Product fruitJuice = new Product(1009,"Tropicana Fruit Juice (1 ltr)", 3, 1, "images/13.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product pruneJuice= new Product(1010,"Prune Juice (1 ltr)", 5, 1, "images/14.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product coke = new Product(1011,"Coca-cola (330 ml)", 3, 1, "images/15.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		Product sprite = new Product(1012,"Sprite (2 ltr)", 5, 1, "images/16.png", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		
		productMap.put(soup.getSku(), soup);
		productMap.put(noodles.getSku(), noodles);
		productMap.put(pasta.getSku(), pasta);
		productMap.put(rusk.getSku(), rusk);
		
		productMap.put(spinach.getSku(), spinach);
		productMap.put(mango.getSku(), mango);
		productMap.put(apple.getSku(), apple);
		productMap.put(brocolli.getSku(), brocolli);
		
		productMap.put(fruitJuice.getSku(), fruitJuice);
		productMap.put(pruneJuice.getSku(), pruneJuice);
		productMap.put(coke.getSku(), coke);
		productMap.put(sprite.getSku(), sprite);
	}
}
