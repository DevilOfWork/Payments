package ru.iteco.client;

import java.util.ArrayList;
import java.util.List;

import ru.iteco.client.model.SalaryData;
import ru.iteco.shared.MockSalaryData;

import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;

public class SalaryProjectsForm {

	public ContentPanel createCenter() {
		ContentPanel center = new ContentPanel();
		center.setHeaderVisible(false);
		center.setScrollMode(Scroll.AUTOX);
		HorizontalPanel hp = new HorizontalPanel();
		hp.add(createSalaryDataList());
		hp.add(createMainPanel());
		center.add(hp);
		return center;
	}

	private ContentPanel createMainPanel(){
		ContentPanel main = new ContentPanel();
		main.setHeaderVisible(false);
		main.setSize(945, 460);
		HorizontalPanel fakeHp = new HorizontalPanel();
		fakeHp.setHeight(20);
		main.add(fakeHp);
		
		HorizontalPanel hp1 = new HorizontalPanel();
		hp1.add(getFakeText(15));
		Text innText = new Text("ИНН");
		innText.setWidth(40);
		hp1.add(innText);
		TextField<String> inn = new TextField<String>();
		hp1.add(inn);
		hp1.add(getFakeText(50));
		Text contractNumberText = new Text("Номер договора");
		contractNumberText.setWidth(115);
		hp1.add(contractNumberText);
		TextField<String> contractNumber = new TextField<String>();
		hp1.add(contractNumber);
		hp1.add(getFakeText(200));
		Button view = new Button("Просмотр договора АС ВИК и БДК");
		view.setWidth(200);
		hp1.add(view);
		main.add(hp1);
		
		HorizontalPanel hp2 = new HorizontalPanel();
		hp2.add(getFakeText(15));
		Text payerText = new Text("Плательщик");
		payerText.setWidth(100);
		hp2.add(payerText);
		Text payer = new Text("ГОУ СОШ №156");
		hp2.add(payer);
		main.add(hp2);
		HorizontalPanel hp3 = new HorizontalPanel();
		hp3.setHeight(50);
		main.add(hp3);
		
		HorizontalPanel hp4 = new HorizontalPanel();
		hp4.add(getFakeText(15));
		Text fileNameText = new Text("Имя файла");
		fileNameText.setWidth(80);
		hp4.add(fileNameText);
		TextField<String> fileName = new TextField<String>();
		hp4.add(fileName);
		main.add(hp4);
		return main;
	}

	private ContentPanel createSalaryDataList() {
		ContentPanel dataListPanel = new ContentPanel();
		dataListPanel.setSize(120, 460);
		dataListPanel.setHeaderVisible(false);
		List<ColumnConfig> ccList = new ArrayList<ColumnConfig>();
		ColumnConfig cc = new ColumnConfig("data", 100);
		ccList.add(cc);
		ColumnModel cm = new ColumnModel(ccList);
		ListStore<SalaryData> store = new ListStore<SalaryData>();
		store.add(MockSalaryData.getSalaryData());
		Grid<SalaryData> grid = new Grid<SalaryData>(store, cm);
		grid.setAutoWidth(true);
		grid.setHeight(460);
		grid.setAutoExpandColumn("data");
		grid.setColumnReordering(true);
		grid.setHideHeaders(true);
		dataListPanel.add(grid);
		return dataListPanel;
	}
	
	private Text getFakeText(int width) {
		Text fake = new Text();
		fake.setWidth(width);
		return fake;
	}

}
