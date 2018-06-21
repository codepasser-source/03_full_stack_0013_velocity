package com.mattdamon.model.system;

import java.io.Serializable;

/**
 * 
 * @author MATTDAMON
 * 
 */
public class SysResourceEntity implements Serializable {

	private static final long serialVersionUID = 185676126792045803L;
	private String name;
	private String uri;
	private String priority;
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
