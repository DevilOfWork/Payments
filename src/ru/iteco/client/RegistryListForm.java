package ru.iteco.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ru.iteco.client.model.Registry;
import ru.iteco.shared.ClientTypeEnum;
import ru.iteco.shared.StatusEnum;
import ru.iteco.shared.TypeEnum;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.DateField;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.CheckBoxSelectionModel;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.ListBox;

public class RegistryListForm {

	public ContentPanel createCenter() {
		ContentPanel center = new ContentPanel();
		center.setHeaderVisible(false);
		center.setScrollMode(Scroll.AUTOX);
		for (HorizontalPanel hp : getHorizontalPanels(getVerticalPanels())) {
			center.add(hp);
		}
		return center;
	}

	private List<VerticalPanel> getVerticalPanels() {
		List<VerticalPanel> vpList = new ArrayList<VerticalPanel>();

		VerticalPanel vp1 = new VerticalPanel();
		vp1.setSpacing(6);
		vp1.add(new Text("Дата с"));
		vp1.add(new Text("Организация"));
		vpList.add(vp1);

		VerticalPanel vp2 = new VerticalPanel();
		vp2.setSpacing(5);
		DateField from = new DateField();
		from.setWidth(90);
		from.getPropertyEditor().setFormat(
				DateTimeFormat.getFormat("dd.MM.yyyy"));
		from.setValue(new Date());
		vp2.add(from);
		TextField<String> organization = new TextField<String>();
		organization.setWidth(120);
		vp2.add(organization);
		vpList.add(vp2);

		VerticalPanel vp3 = new VerticalPanel();
		vp3.setWidth(90);
		vp3.setSpacing(7);
		vp3.add(new Text("Дата по"));
		vp3.add(new Text("Сумма от и"));
		vp3.add(new Text("до"));
		vpList.add(vp3);

		VerticalPanel vp4 = new VerticalPanel();
		vp4.setSpacing(5);
		DateField to = new DateField();
		to.setWidth(90);
		to.getPropertyEditor()
				.setFormat(DateTimeFormat.getFormat("dd.MM.yyyy"));
		to.setValue(new Date());
		vp4.add(to);
		TextField<String> minSum = new TextField<String>();
		minSum.setWidth(120);
		TextField<String> maxSum = new TextField<String>();
		maxSum.setWidth(120);
		vp4.add(minSum);
		vp4.add(maxSum);
		vpList.add(vp4);

		VerticalPanel vp5 = new VerticalPanel();
		vp5.setWidth(100);
		vp5.setSpacing(6);
		vp5.add(new Text("№ договора"));
		vp5.add(new Text("Имя файла"));
		vpList.add(vp5);

		VerticalPanel vp6 = new VerticalPanel();
		vp6.setWidth(140);
		vp6.setSpacing(5);
		TextField<String> contractNumber = new TextField<String>();
		contractNumber.setWidth(120);
		TextField<String> fileName = new TextField<String>();
		fileName.setWidth(120);
		vp6.add(contractNumber);
		vp6.add(fileName);
		vpList.add(vp6);

		VerticalPanel vp7 = new VerticalPanel();
		vp7.setWidth(40);
		Text typeTop = new Text();
		typeTop.setHeight(25);
		vp7.add(typeTop);
		Text typeText = new Text("Тип");
		vp7.add(typeText);
		vpList.add(vp7);

		VerticalPanel vp8 = new VerticalPanel();
		vp8.setWidth(130);
		ListBox typeBox = new ListBox();
		typeBox.setVisibleItemCount(4);
		for (TypeEnum te : TypeEnum.values()) {
			typeBox.addItem(te.getName());
		}
		vp8.add(typeBox);
		vpList.add(vp8);

		VerticalPanel vp9 = new VerticalPanel();
		vp9.setWidth(60);
		Text statusTop = new Text();
		statusTop.setHeight(25);
		vp9.add(statusTop);
		vp9.add(new Text("Статус"));
		vpList.add(vp9);

		VerticalPanel vp10 = new VerticalPanel();
		vp10.setWidth(130);
		ListBox statusBox = new ListBox();
		statusBox.setVisibleItemCount(4);
		for (StatusEnum te : StatusEnum.values()) {
			statusBox.addItem(te.getName());
		}
		vp10.add(statusBox);
		vpList.add(vp10);

		VerticalPanel vp11 = new VerticalPanel();
		vp11.setWidth(60);
		Text clientTypeTop = new Text();
		clientTypeTop.setHeight(12);
		vp11.add(clientTypeTop);
		vp11.add(new Text("Тип клиента"));
		vpList.add(vp11);

		VerticalPanel vp12 = new VerticalPanel();
		ListBox clientTypeBox = new ListBox();
		clientTypeBox.setVisibleItemCount(3);
		for (ClientTypeEnum te : ClientTypeEnum.values()) {
			clientTypeBox.addItem(te.getName());
		}
		vp12.add(clientTypeBox);
		vpList.add(vp12);
		return vpList;
	}

	private List<HorizontalPanel> getHorizontalPanels(List<VerticalPanel> vpList) {
		List<HorizontalPanel> hpList = new ArrayList<HorizontalPanel>();

		HorizontalPanel hp1 = new HorizontalPanel();
		for (VerticalPanel vp : vpList) {
			hp1.add(vp);
		}
		hpList.add(hp1);

		HorizontalPanel hp2 = new HorizontalPanel();
		VerticalPanel vp1 = new VerticalPanel();
		vp1.setWidth(50);
		Button find = new Button("Найти");
		vp1.add(find);
		hp2.add(vp1);

		VerticalPanel vp2 = new VerticalPanel();
		vp2.setWidth(150);
		Button clear = new Button("Сбросить фильтры");
		vp2.add(clear);
		hp2.add(vp2);

		VerticalPanel vp3 = new VerticalPanel();
		vp3.setWidth(150);
		vp3.add(new Text("Количесто на страницу:"));
		hp2.add(vp3);

		VerticalPanel vp4 = new VerticalPanel();
		ListBox size = new ListBox();
		size.addItem("10");
		size.addItem("15");
		size.addItem("25");
		size.addItem("30");
		size.addItem("50");
		size.addItem("75");
		size.addItem("100");
		size.addItem("250");
		size.addItem("500");
		vp4.add(size);
		hp2.add(vp4);
		hp2.setHeight(40);
		hpList.add(hp2);

		HorizontalPanel hp3 = getPagingInfo();
		hp3.setWidth(1200);
		Text fake = new Text();
		fake.setWidth(480);
		hp3.add(fake);
		Text currentTime = new Text(DateTimeFormat.getFormat("dd.MM.yyyy HH:mm:ss").format(new Date()));
		hp3.add(currentTime);
		hpList.add(hp3);

		HorizontalPanel hp4 = new HorizontalPanel();
		hp4.add(createMockTable(MockRegistriesTable.getMockData(),
				getColumnConfigList()));
		hpList.add(hp4);

		HorizontalPanel hp5 = getPagingInfo();
		hp5.setHeight(40);
		hpList.add(hp5);

		HorizontalPanel hp6 = new HorizontalPanel();
		hp6.setHeight(30);

		VerticalPanel vpFooter1 = new VerticalPanel();
		vpFooter1.setWidth(62);
		Button remove = new Button("Удалить");
		vpFooter1.add(remove);
		hp6.add(vpFooter1);
		VerticalPanel vpFooter2 = new VerticalPanel();
		vpFooter2.setWidth(44);
		Button stop = new Button("Стоп");
		vpFooter2.add(stop);
		hp6.add(vpFooter2);
		VerticalPanel vpFooter3 = new VerticalPanel();
		vpFooter3.setWidth(50);
		Button start = new Button("Старт");
		vpFooter3.add(start);
		vpFooter3.setWidth(95);
		hp6.add(vpFooter3);
		VerticalPanel vpFooter4 = new VerticalPanel();
		vpFooter4.add(new Text("(Выбор с помощью &#9632)"));
		hp6.add(vpFooter4);
		hpList.add(hp6);

		HorizontalPanel hp7 = new HorizontalPanel();
		VerticalPanel vpFooter5 = new VerticalPanel();
		Button print = new Button("Напечатать акт приема/передачи");
		vpFooter5.setWidth(200);
		vpFooter5.add(print);
		hp7.add(vpFooter5);
		VerticalPanel vpFooter6 = new VerticalPanel();
		vpFooter6.add(new Text("(Выбор с помощью &#9679)"));
		hp7.add(vpFooter6);
		hpList.add(hp7);

		return hpList;
	}

	private HorizontalPanel getPagingInfo() {
		HorizontalPanel hp3 = new HorizontalPanel();
		Text paging = new Text("Найдено записей "
				+ MockRegistriesTable.getMockData().size()
				+ ", показано с 1 по 10.");
		paging.setWidth(300);
		hp3.add(paging);
		Hyperlink beginingLink = new Hyperlink();
		beginingLink.setText("(В начало/");
		hp3.add(beginingLink);
		Hyperlink beforeLink = new Hyperlink();
		beforeLink.setText("предыдущая)");
		hp3.add(beforeLink);
		Hyperlink pagesLink = new Hyperlink();
		pagesLink.setText(" 1,2 ");
		hp3.add(pagesLink);
		Hyperlink nextLink = new Hyperlink();
		nextLink.setText("(Следующая/");
		hp3.add(nextLink);
		Hyperlink lastLink = new Hyperlink();
		lastLink.setText("в конец)");
		hp3.add(lastLink);
		return hp3;
	}

	private ContentPanel createMockTable(List<Registry> rList,
			List<ColumnConfig> ccList) {
		ContentPanel cp = new ContentPanel();
		cp.setHeaderVisible(false);
		cp.setBodyBorder(false);
		cp.setButtonAlign(HorizontalAlignment.CENTER);
		cp.setLayout(new FitLayout());
		cp.setSize(1200, 200);
		ListStore<Registry> store = new ListStore<Registry>();
		store.add(rList);
		CheckBoxSelectionModel<Registry> sm = new CheckBoxSelectionModel<Registry>();
		ccList.add(0, sm.getColumn());
		ColumnModel cm = new ColumnModel(ccList);
		Grid<Registry> grid = new Grid<Registry>(store, cm);
		grid.setSelectionModel(sm);
		grid.setAutoExpandColumn("id");
		grid.setBorders(true);
		grid.setColumnReordering(true);
		grid.addPlugin(sm);
		cp.add(grid);
		return cp;
	}

	private List<ColumnConfig> getColumnConfigList() {
		List<ColumnConfig> configs = new ArrayList<ColumnConfig>();
		ColumnConfig column = new ColumnConfig("id", "ID", 20);
		configs.add(column);
		column = new ColumnConfig("contractNumber", "№ дог.", 100);
		configs.add(column);
		column = new ColumnConfig("organization", "Организация", 100);
		configs.add(column);
		column = new ColumnConfig("fileName", "Файл", 100);
		configs.add(column);
		column = new ColumnConfig("sum", "Сумма", 100);
		configs.add(column);
		column = new ColumnConfig("acceptanceDate", "Дата приемки", 100);
		column.setDateTimeFormat(DateTimeFormat.getFormat("dd.MM.yyyy"));
		configs.add(column);
		column = new ColumnConfig("operator", "Оператор", 100);
		configs.add(column);
		column = new ColumnConfig("osb", "ОСБ", 100);
		configs.add(column);
		column = new ColumnConfig("fosb", "ФОСБ", 100);
		configs.add(column);
		column = new ColumnConfig("upd", "УПД", 100);
		configs.add(column);
		column = new ColumnConfig("status", "Статус", 100);
		configs.add(column);
		return configs;
	}

}
