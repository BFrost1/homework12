package homework12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import homework12.model.Customer;

public class MainAnno {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println(context.getBean(Customer.class));
		context.close();
	}
}
