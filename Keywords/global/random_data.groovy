package global

import com.github.javafaker.Faker

public class random_data {

	Faker faker = new Faker()

	String firstName() {
		return faker.name().firstName()
	}

	String lastName() {
		return faker.name().lastName()
	}

	String mobileNumber() {
		return faker.phoneNumber().cellPhone()
	}

	String phoneNumber() {
		return faker.phoneNumber().phoneNumber()
	}
}
