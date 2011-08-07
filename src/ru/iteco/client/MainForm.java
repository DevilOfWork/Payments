package ru.iteco.client;

import ru.iteco.client.model.Folder;

import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.data.BaseTreeModel;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.google.gwt.user.client.Element;

public class MainForm extends LayoutContainer {

	protected void onRender(Element target, int index) {
		super.onRender(target, index);
		final BorderLayout layout = new BorderLayout();
		setLayout(layout);
		setStyleAttribute("padding", "10px");
		
		BorderLayoutData northData = new BorderLayoutData(LayoutRegion.NORTH,
				80);
		northData.setCollapsible(true);
		northData.setFloatable(true);
		northData.setHideCollapseTool(true);
		northData.setSplit(true);
		northData.setMargins(new Margins(0, 0, 5, 0));

		BorderLayoutData westData = new BorderLayoutData(LayoutRegion.WEST, 250);
		westData.setSplit(true);
		westData.setCollapsible(true);
		westData.setMargins(new Margins(0, 5, 0, 0));

		BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
		centerData.setMargins(new Margins(0));

		add(createNorth(), northData);
		add(createWest(), westData);
		add(createCenter(), centerData);
	}

	/*
	 * Создаем север
	 */
	private LayoutContainer createNorth() {
		return new LayoutContainer();
	}

	/*
	 * Создаем восток
	 */
	private ContentPanel createWest() {
		ContentPanel west = new ContentPanel();
		//west.setWidth(200);
		west.setAutoWidth(true);
		west.setHeading("Основное меню");
		Folder model = RootMenu.getRootMenu();
		TreeStore<ModelData> store = new TreeStore<ModelData>();
		for (ModelData f : model.getChildren()) {
			if (f instanceof Folder) {
				store.add(((BaseTreeModel) f).getChildren(), true);
			} else {
				store.add(f, false);
			}
		}
		TreePanel<ModelData> tree = new TreePanel<ModelData>(store);
		tree.setDisplayProperty("name");
		//tree.setAutoWidth(true);
		tree.setSize(250, 400);
		west.add(tree);
		return west;
	}

	/*
	 * Создаем центр
	 */
	private ContentPanel createCenter() {
		//return new RegistryListForm().createCenter();
		return new SalaryProjectsForm().createCenter();
	}

}
