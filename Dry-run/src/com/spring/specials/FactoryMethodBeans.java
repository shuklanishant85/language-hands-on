package com.spring.specials;

public class FactoryMethodBeans {

}

class ClientService {
	private static ClientService clientService = new ClientService();

	private ClientService() {
		// do nothing
	}

	static ClientService getInstance() {
		return clientService;
	}

}