package Store;

public class Store {

	private int id;
	private String productName;
	private int unitPrice;
	private int discount;
	private String[] images;
	private String explanation;
	private int discountedPrice;
	
	public Store() {
		super();
	}

	public Store(int id, String productName, int unitPrice, int discount, String[] images, String explanation) {
		super();
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.images = images;
		this.explanation = explanation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public int getDiscountedPrice() {
		discountedPrice = unitPrice - discount;
		return discountedPrice;
	}
	
	
}
