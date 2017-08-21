package  com.inrhythm.model;

public class Product {

    private final long sku;
    private final String name;
    private final double price;
    private final double discount;
    private final String imgPath;
    private final String description;
    
	public Product(long sku, String name, double price, double discount, String imgPath, String description) {
		super();
		this.sku = sku;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.imgPath = imgPath;
		this.description = description;
	}

	public long getSku() {
		return sku;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public String getImgPath() {
		return imgPath;
	}

	public String getDescription() {
		return description;
	}
}
