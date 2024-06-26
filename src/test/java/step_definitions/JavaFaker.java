package step_definitions;

import com.github.javafaker.Faker;

public class JavaFaker {
	
	public static void main(String[] args) {
		Faker fake = new Faker();
		
		System.out.println(fake.address().streetAddress());
		
		System.out.println(fake.phoneNumber().cellPhone());
		
		System.out.println(fake.business().creditCardNumber());
		
		System.out.println(fake.animal().name());
		
		System.out.println(fake.internet().emailAddress());
		
		System.out.println(fake.name().fullName());
		
		System.out.println(fake.commerce().productName());
		
		
	}

}
