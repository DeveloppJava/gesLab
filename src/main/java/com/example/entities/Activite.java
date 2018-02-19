package com.example.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Activite implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_activite;
	private String type;
	private String description;
	private List<Log> lisetLogs;
	public Long getId_activite() {
		return id_activite;
	}
	
	public void setId_activite(Long id_activite) {
		this.id_activite = id_activite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Log> getLisetLogs() {
		return lisetLogs;
	}
	public void setLisetLogs(List<Log> lisetLogs) {
		this.lisetLogs = lisetLogs;
	}
	public Activite() {
		super();
	}
	public Activite(String type, String description, List<Log> lisetLogs) {
		super();
		this.type = type;
		this.description = description;
		this.lisetLogs = lisetLogs;
	}
	
}
