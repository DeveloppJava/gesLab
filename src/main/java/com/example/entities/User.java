package com.example.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class User extends Personne implements Serializable{
	private Long id_User;
	private boolean isAdmin;
	@ManyToMany
	@JoinTable(name="User_Priv",
				joinColumns= @JoinColumn(name="id_user"),
				inverseJoinColumns=@JoinColumn(name="id_privilege"))
	private List<privilege> listePrivileges;
	@OneToMany(mappedBy="user")
	private List<Log> listeLogs;
	public Long getId_User() {
		return id_User;
	}
	public void setId_User(Long id_User) {
		this.id_User = id_User;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public List<privilege> getListePrivileges() {
		return listePrivileges;
	}
	public void setListePrivileges(List<privilege> listePrivileges) {
		this.listePrivileges = listePrivileges;
	}
	public List<Log> getListeLogs() {
		return listeLogs;
	}
	public void setListeLogs(List<Log> listeLogs) {
		this.listeLogs = listeLogs;
	}
	
	public User() {
		super();
	}
	public User(boolean isAdmin, List<privilege> listePrivileges, List<Log> listeLogs) {
		super();
		this.isAdmin = isAdmin;
		this.listePrivileges = listePrivileges;
		this.listeLogs = listeLogs;
	}
	
}
