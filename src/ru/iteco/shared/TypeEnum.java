package ru.iteco.shared;

public enum TypeEnum {
	
	ALL("Все"),
	INTERNAL("Внутренние"),
	EXTERNAL("Внешние"),
	PROCESSING("Процессинговые"),
	MILITARY_PENSIONS("Военные пенсии");
	
	private String name;
	
	private TypeEnum(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
