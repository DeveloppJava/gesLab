package com.example.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Antecedent implements Serializable{
	@Id
	@GeneratedValue
	private Long id_antecedent;
	private String type;
	private String description;
	@ManyToMany
	private List<DossierMedical> dossiersMedical;
	public Long getId_antecedent() {
		return id_antecedent;
	}
	public void setId_antecedent(Long id_antecedent) {
		this.id_antecedent = id_antecedent;
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
		
	public List<DossierMedical> getDossiersMedical() {
		return dossiersMedical;
	}
	public void setDossiersMedical(List<DossierMedical> dossiersMedical) {
		this.dossiersMedical = dossiersMedical;
	}
	public Antecedent() {
		super();
	}
	public Antecedent(String type, String description, List<DossierMedical> dossiersMedical) {
		super();
		this.type = type;
		this.description = description;
		this.dossiersMedical = dossiersMedical;
	}
		
}
