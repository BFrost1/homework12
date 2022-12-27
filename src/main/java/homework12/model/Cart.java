package homework12.model;

import java.util.Map;

public class Cart {

	private Map<Integer, Product> cart;
	private int maxSize;

	public Map<Integer, Product> getCart() {
		return cart;
	}

	public void setCart(Map<Integer, Product> cart) {
		this.cart = cart;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	public String toString() {
		return "Cart [cart=" + cart + ", maxSize=" + maxSize + "]";
	}
}
