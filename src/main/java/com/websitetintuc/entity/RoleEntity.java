package com.websitetintuc.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity{
	@Column
	private String name;
	
	@Column
	private String code;
	
	 @ManyToMany
		    @JoinTable(name = "user_role",// tên bảng trung gian
		        joinColumns = @JoinColumn(name = "role_id"),// tên khóa ngoại của user_role
		        inverseJoinColumns = @JoinColumn(name = "user_id")
		    )
		    private List<UserEntity> users = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
