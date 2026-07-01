package streams;

public class Product {
	
	private int productId;
	private String productName;
	private String category;
	private double price;
	
	public Product(int productId, String productName, String category, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
