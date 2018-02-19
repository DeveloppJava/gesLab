package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public abstract class Personne implements Serializable{
	@Id
	private String nom;
	private String prenom;
	private String sex;
	private Date dateDeNaissance;
	private String nomMarital;
	private Adresse adresse;
	private String email;
	private String numerotel;
	private int numéroDesecuriteSocial;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getNomMarital() {
		return nomMarital;
	}
	public void setNomMarital(String nomMarital) {
		this.nomMarital = nomMarital;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumerotel() {
		return numerotel;
	}
	public void setNumerotel(String numerotel) {
		this.numerotel = numerotel;
	}
	public int getNuméroDesecuriteSocial() {
		return numéroDesecuriteSocial;
	}
	public void setNuméroDesecuriteSocial(int numéroDesecuriteSocial) {
		this.numéroDesecuriteSocial = numéroDesecuriteSocial;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Personne() {
		super();
	}
	public Personne(String nom, String prenom, String sex, Date dateDeNaissance, String nomMarital, Adresse adresse,
			String email, String numerotel, int numéroDesecuriteSocial) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sex = sex;
		this.dateDeNaissance = dateDeNaissance;
		this.nomMarital = nomMarital;
		this.adresse = adresse;
		this.email = email;
		this.numerotel = numerotel;
		this.numéroDesecuriteSocial = numéroDesecuriteSocial;
	}
		
}
