package com.mattdamon.model.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author MATTDAMON
 * 
 */
public class SysRoleEntity implements Serializable {

	private static final long serialVersionUID = -2635119650003013458L;

	private String name;

	private List<SysResourceEntity> resources = new ArrayList<SysResourceEntity>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SysResourceEntity> getResources() {
		return resources;
	}

	public void setResources(List<SysResourceEntity> resources) {
		this.resources = resources;
	}

	public void addResource(SysResourceEntity resource) {
		if (resource == null) {
			return;
		}
		this.resources.add(resource);
	}
}
