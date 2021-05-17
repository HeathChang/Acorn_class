package com.example.config;


public class ServerConnector {
	String url;
	String name;

	public ServerConnector(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}



	public ServerConnector() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ServerConnector [url=" + url + ", name=" + name + "]";
	}

}
