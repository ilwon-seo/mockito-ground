package com.vogella.junit5;
public class Database {
	
	int uniqueId;

	public boolean isAvailable() {
		// currently not implemented, as this is just demo used in a software test
		return false;
	}

	public int getUniqueId() {
		return 42;
	}

	public void setUniqueId(int i) {
		this.uniqueId = i;
	}
}