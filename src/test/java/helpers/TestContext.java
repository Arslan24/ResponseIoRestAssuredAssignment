package helpers;

import apiEngine.Endpoints;

public class TestContext {
	private Endpoints endpoints;
	String baseUrl = ConfigReader.getInstance().getBaseUrl();

	public TestContext() {
		endpoints = new Endpoints(baseUrl);

	}

	public Endpoints getEndPoints() {
		return endpoints;
	}

}
