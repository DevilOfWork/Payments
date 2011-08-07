package ru.iteco.client;

import java.util.List;

import ru.iteco.client.model.Registry;

import com.google.gwt.user.client.rpc.RemoteService;

public interface RegistryService extends RemoteService {
	
	List<Registry> findRegistries(int pageSize, int pageNumber);
	
}
