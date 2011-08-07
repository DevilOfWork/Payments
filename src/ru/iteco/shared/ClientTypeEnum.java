package ru.iteco.shared;

public enum ClientTypeEnum {
	
	ALL("Все"),
	VSP("ВСП"),
	TEKOS("Текос"),
	SBERBANK("Сбербанк");
	
	private String name;
	
	private ClientTypeEnum(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
