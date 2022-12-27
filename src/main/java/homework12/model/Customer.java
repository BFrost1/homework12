package homework12.model;

public class Customer {
	private String customerName;
	private Cart cart;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", cart=" + cart + "]";
	}
}
