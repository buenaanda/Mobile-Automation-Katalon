package global

import com.github.javafaker.Faker

public class random_data {

	Faker faker = new Faker()

	String middleName() {
		return faker.name().lastName()
	}

	String firstName() {
		return faker.name().firstName()
	}

	String lastName() {
		return faker.name().lastName()
	}

	String mobileNumber() {
		String ranNum1 = faker.number().numberBetween(0, 99999)
		String ranNum2 = faker.number().numberBetween(0, 9999999)
		return ranNum1+ranNum2
	}

	String phoneNumber() {
		String ranNum1 = faker.number().numberBetween(0, 99999)
		String ranNum2 = faker.number().numberBetween(0, 9999999)
		return ranNum1+ranNum2
	}

	String postalCode() {
		return faker.address().zipCode()
	}

	String amount() {
		return faker.number().numberBetween(1, 4000)
	}

	String sourceOfFunds() {
		String[] sourceOfFundsList = [
			"Borrowed Funds/Loan",
			"Charitable Donations",
			"Gift",
			"Inheritance",
			"Pension/Government/Welfare",
			"Salary/Income",
			"Savings"
		]
		def arrayLength = sourceOfFundsList.length
		int ranNum = faker.number().numberBetween(0, arrayLength - 1)
		return sourceOfFundsList[ranNum]
	}

	String message() {
		return faker.lorem().sentence()
	}
}
