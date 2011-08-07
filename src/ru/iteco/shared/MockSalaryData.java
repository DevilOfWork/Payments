package ru.iteco.shared;

import java.util.Arrays;
import java.util.List;

import ru.iteco.client.model.SalaryData;

public class MockSalaryData {

	public static List<SalaryData> getSalaryData() {
		SalaryData[] sd = new SalaryData[] {
				new SalaryData("38060834 - 11.70"),
				new SalaryData("38060035 - 27.61"),
				new SalaryData("33546703 - 33.52"),
				new SalaryData("38067809 - 45.43"),
				new SalaryData("38060818 - 56.34"),
				new SalaryData("38067017 - 68.25"),
				new SalaryData("38067016 - 79.16"),
				new SalaryData("38067825 - 87.07"),
				new SalaryData("38067764 - 91.98"),
				new SalaryData("38067383 - 27.89"),
				new SalaryData("38067172 - 32.70"),
				new SalaryData("38067141 - 17.61"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38067242 - 52.43"),
				new SalaryData("38067635 - 66.34"),
				new SalaryData("38067236 - 79.25"),
				new SalaryData("38067327 - 88.16"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"),
				new SalaryData("38062313 - 42.52"), };
		return Arrays.asList(sd);
	}

}
