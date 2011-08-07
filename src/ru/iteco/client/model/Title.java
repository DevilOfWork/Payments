package ru.iteco.client.model;

import com.extjs.gxt.ui.client.data.BaseTreeModel;

public class Title extends BaseTreeModel {

	private static final long serialVersionUID = 878986002955121319L;
	
	public Title() {
		
	}
	
	public Title(String name) {
		set("name", name);
	}
	
	public String getName() {
		return (String) get("name");
	}
	
	
	
	

}
