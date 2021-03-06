package shops;

import store.IStock;
import tonchev.sportsdirect.R;

public class Clothing extends Product {

	public enum ClothType implements IStock{
		TSHIRTS,JEANS,JACKETS,SWIMWEAR,HOODIES;
	}
	private ClothType clothType;

	public Clothing(String name, Brand brand,Gender gender, double price , String productInfo,	ClothType clothType, String color, String size, int quantity) {
		super(name, brand, gender,price, productInfo, color, size, quantity, R.drawable.clothing  );
		this.clothType = clothType;
		this.productType = ProductType.CLOTHING;
		this.stock = clothType;



	}
	
	
}
