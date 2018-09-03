package com.heteroDB.metaDataStore.model;

import java.util.Set;

public class UserTable {
	
	private Long tableId;
	private String tableName;
	
	private Set<TableColumn> tableColumns;

	public UserTable() {
		super();
	}

	public Long getTableId() {
		return tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Set<TableColumn> getTableColumns() {
		return tableColumns;
	}

	public void setTableColumns(Set<TableColumn> tableColumns) {
		this.tableColumns = tableColumns;
	}

}
