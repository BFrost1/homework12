package homework12;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import homework12.model.Cart;
import homework12.model.Customer;
import homework12.model.Product;

@Configuration
public class Config {

	@Bean
	public Cart getCart() {
		Cart cart = new Cart();
		cart.setMaxSize(5);
		Map<Integer, Product> map = new HashMap<>();
		map.put(1, getProduct().setProductName("AnnotationProduct1").setPrice(35.0));
		map.put(2, getProduct().setProductName("AnnotationProduct2").setPrice(55.0));
		map.put(3, getProduct().setProductName("AnnotationProduct3").setPrice(17.0));
		map.put(4, getProduct().setProductName("AnnotationProduct4").setPrice(23.0));
		map.put(5, getProduct().setProductName("AnnotationProduct5").setPrice(70.0));
		cart.setCart(map);
		return cart;
	}

	@Bean
	public Product getProduct() {
		Product product = new Product();
		return product;
	}

	@Bean
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setCustomerName("AnnotationCustomer");
		customer.setCart(getCart());
		return customer;
	}
}
