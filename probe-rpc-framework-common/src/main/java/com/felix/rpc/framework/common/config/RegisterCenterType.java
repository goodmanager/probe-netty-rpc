package com.felix.rpc.framework.common.config;

public enum RegisterCenterType {

	ZOOKEEPER(1, "zookeeper"), CONSUL(2, "consul");

	private int index;

	private String description;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	RegisterCenterType(int index, String description) {
		this.index = index;
		this.description = description;
	}
}