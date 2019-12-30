package edu.swjtuhc.demo.model;

import org.hibernate.annotations.Entity;

@Entity
public class CollectionModel {
	private int id;
	private String CollectionName;
	private String author;
	private String Image;

	public String getCollectionName() {
		return CollectionName;
	}
	public void setCollectionName(String collectionName) {
		CollectionName = collectionName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		author = author;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	@Override
	public String toString() {
		return "CollectionModel [id=" + id + ", CollectionName=" + CollectionName + ", author=" + author + ", Image="
				+ Image + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
