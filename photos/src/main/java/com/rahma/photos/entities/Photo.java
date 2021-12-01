package com.rahma.photos.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Photo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idPhoto;
private String nomPhoto;
private Double prixPhoto;
private Date dateCreation;
@ManyToOne
private Photographe photographe;

public Photo() {
	super();
}

public Photo(Long idPhoto, String nomPhoto, Double prixPhoto, Date dateCreation, Photographe photographe) {
	super();
	this.idPhoto = idPhoto;
	this.nomPhoto = nomPhoto;
	this.prixPhoto = prixPhoto;
	this.dateCreation = dateCreation;
	this.photographe = photographe;
}

public Long getIdPhoto() {
	return idPhoto;
}

public void setIdPhoto(Long idPhoto) {
	this.idPhoto = idPhoto;
}

public String getNomPhoto() {
	return nomPhoto;
}

public void setNomPhoto(String nomPhoto) {
	this.nomPhoto = nomPhoto;
}

public Double getPrixPhoto() {
	return prixPhoto;
}

public void setPrixPhoto(Double prixPhoto) {
	this.prixPhoto = prixPhoto;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}

public Photographe getPhotographe() {
	return photographe;
}

public void setPhotographe(Photographe photographe) {
	this.photographe = photographe;
}

@Override
public String toString() {
	return "Photo [idPhoto=" + idPhoto + ", nomPhoto=" + nomPhoto + ", prixPhoto=" + prixPhoto + ", dateCreation="
			+ dateCreation + ", photographe=" + photographe + "]";
}



}