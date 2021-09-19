package com.coj.webProject.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="coj_user")
public class CojUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	String id;

	@Column(name="name")
	String name;

	@Column(name="pw")
	String pw;

	@Column(name="account_creation")
	String accountCreation;

	@Column(name="last_login")
	String lastLogin;

	@Column(name="admin")
	int admin;

	@Builder
	public CojUser(String id, String name, String pw, String accountCreation, String lastLogin, int admin) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.accountCreation = accountCreation;
		this.lastLogin = lastLogin;
		this.admin = admin;
	}
}

