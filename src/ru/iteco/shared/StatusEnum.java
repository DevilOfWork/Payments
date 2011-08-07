package ru.iteco.shared;

public enum StatusEnum {

	ALL("Все"),
	IN("В работе"),
	SEND("Отправленные"),
	WASTE("Отбракованные"),
	READY("Готовые");
	
	private String name;
	
	private StatusEnum(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
