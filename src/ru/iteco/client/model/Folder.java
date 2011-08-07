package ru.iteco.client.model;

import java.io.Serializable;

import com.extjs.gxt.ui.client.data.BaseTreeModel;

public class Folder extends BaseTreeModel implements Serializable {

	private static final long serialVersionUID = 4020620381250785377L;
	private static int id = 0;

	public Folder() {
		set("id", id++);
	}

	public Folder(String name) {
		set("id", id++);
		set("name", name);
	}

	public Folder(String name, BaseTreeModel[] children) {
		this(name);
		for (int i = 0; i < children.length; i++) {
			add(children[i]);
		}
	}

	public Integer getId() {
		return (Integer) get("id");
	}

	public String getName() {
		return (String) get("name");
	}

}
