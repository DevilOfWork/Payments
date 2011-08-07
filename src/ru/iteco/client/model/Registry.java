package ru.iteco.client.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import com.extjs.gxt.ui.client.data.BaseModel;

public class Registry extends BaseModel {

	private static final long serialVersionUID = 6827465919264054870L;

	public Registry() {
	}

	public Registry(BigInteger id, String contractNumber, String organization,
			String fileName, BigDecimal sum, Date acceptanceDate,
			String operator, String osb, String fosb, String upd,
			String status) {
		set("id", id);
		set("contractNumber", contractNumber);
		set("organization", organization);
		set("fileName", fileName);
		set("sum", sum);
		set("acceptanceDate", acceptanceDate);
		set("operator", operator);
		set("osb", osb);
		set("fosb", fosb);
		set("upd", upd);
		set("status", status);
	}

	public BigInteger getId() {
		return (BigInteger) get("id");
	}

	public String getContractNumber() {
		return (String) get("contractNumber");
	}

	public String getOrganization() {
		return (String) get("organization");
	}

	public String getFileName() {
		return (String) get("fileName");
	}

	public BigDecimal getSum() {
		return (BigDecimal) get("sum");
	}

	public Date getAcceptanceDate() {
		return (Date) get("acceptanceDate");
	}

	public String getOperator() {
		return (String) get("operator");
	}

	public String getOsb() {
		return (String) get("osb");
	}

	public String getFosb() {
		return (String) get("fosb");
	}

	public String getUpd() {
		return (String) get("upd");
	}

	public String getStatus() {
		return (String) get("status");
	}

}
