package ru.iteco.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.google.gwt.i18n.client.DateTimeFormat;

import ru.iteco.client.model.Registry;

public class MockRegistriesTable {

	public static List<Registry> getMockData() {
		List<Registry> registryList = new ArrayList<Registry>();
		DateTimeFormat f = DateTimeFormat.getFormat("dd.mm.yyyy");
		Registry mock = new Registry(BigInteger.ONE, "", "", "popsb055.905",
				new BigDecimal("56.70"), f.parse("20.05.1988"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("2"), "", "", "popsb055.905",
				new BigDecimal("60.70"), f.parse("26.09.1989"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("3"), "", "", "popsb055.905",
				new BigDecimal("177.70"), f.parse("01.01.2003"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("4"), "", "", "popsb055.905",
				new BigDecimal("360.70"), f.parse("02.02.1989"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("5"), "", "", "popsb055.905",
				new BigDecimal("20.00"), f.parse("19.02.1989"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("6"), "", "", "popsb055.905",
				new BigDecimal("13.70"), f.parse("26.04.1989"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("7"), "", "", "popsb055.905",
				new BigDecimal("80.70"), f.parse("31.05.1989"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("8"), "", "", "popsb055.905",
				new BigDecimal("1110.90"), f.parse("21.09.2009"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("9"), "", "", "popsb055.905",
				new BigDecimal("99.20"), f.parse("16.09.1915"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("10"), "", "", "popsb055.905",
				new BigDecimal("13.13"), f.parse("26.09.1989"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("11"), "", "", "popsb055.905",
				new BigDecimal("15.00"), f.parse("12.12.2000"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("12"), "", "", "popsb055.905",
				new BigDecimal("44.20"), f.parse("26.09.2002"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		mock = new Registry(new BigInteger("13"), "", "", "popsb055.905",
				new BigDecimal("111.44"), f.parse("22.09.2011"), "", "", "",
				"Неизв.", "Готов");
		registryList.add(mock);
		return registryList;
	}

}
