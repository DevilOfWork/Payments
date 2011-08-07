package ru.iteco.client.model;

import com.extjs.gxt.ui.client.data.BaseModel;

public class SalaryData extends BaseModel {

	private static final long serialVersionUID = 8764031943364673965L;

	public SalaryData() {
	}

	public SalaryData(String data) {
		set("data", data);
	}

	public String getData() {
		return (String) get("data");
	}

}
