package ru.iteco.client;

import java.util.List;

import ru.iteco.client.model.Registry;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface RegistryServiceAsync {

	void findRegistries(int pageSize, int pageNumber,
			AsyncCallback<List<Registry>> callback);
}
