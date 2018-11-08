package global

import com.github.javafaker.Faker

public class random_data {

	Faker faker = new Faker()

	String middleName() {
		return faker.name().name()
	}

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

	String postalCode() {
		return faker.address().zipCode()
	}

	String amount() {
		return faker.number().numberBetween(1, 99999)
	}

	String sourceOfFunds() {
		String sourceOfFundsList = [
			"Borrowed Funds/Loans",
			"Charitable Donations",
			"Gift",
			"Inheritance",
			"Pension/Government/Welfare",
			"Salary/Income",
			"Savings"
		]
		int ranNum = faker.number().numberBetween(0, sourceOfFundsList.length() - 1)
		return sourceOfFundsList[ranNum]
	}

	String message() {
		return faker.lorem().sentence()
	}
}
