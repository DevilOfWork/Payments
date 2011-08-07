package ru.iteco.client;

import ru.iteco.client.model.Folder;
import ru.iteco.client.model.Title;

public class RootMenu {

	public static Folder getRootMenu() {
		Folder[] folders = new Folder[] { new Folder("Root", new Folder[] {
				new Folder("Безналичные расчеты", new Title[] {
						new Title("Список реестров"),
						new Title("Загрузить реестр") }),
				new Folder("Управление платежными документами"),
				new Folder("Справочники"), new Folder("Администрирование"),
				new Folder("Безопасность") }) };
		Folder rootMenu = new Folder("root");
		for (int i = 0; i < folders.length; i++) {
			rootMenu.add((Folder) folders[i]);
		}
		rootMenu.add(new Title("Загрузка реестра"));
		rootMenu.add(new Title("Руководство пользователя"));
		return rootMenu;
	}

}
