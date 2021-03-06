package com.handzap.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ARTICLE")
public class Article  {
   private long id;
   private String title;
   private String description;
   private Date publishedDate;
    
   private Author author;

   public Article() {
   }

   public Article(long id, String title, String description) {
	this.id = id;
	this.title = title;
	this.description = description;
}




@Id
   @Column(name = "ARTICLE_ID")
   @GeneratedValue
   public long getId() {
       return id;
   }

   public void setId(long id) {
       this.id = id;
   }

   @Column(name = "TITLE")
   public String getTitle() {
       return title;
   }

   public void setTitle(String title) {
       this.title = title;
   }

   @Column(name = "DESCRIPTION")
   public String getDescription() {
       return description;
   }

   public void setDescription(String description) {
       this.description = description;
   }

   @Temporal(TemporalType.DATE)
   @Column(name = "PUBLISHED")
   public Date getPublishedDate() {
       return publishedDate;
   }

   public void setPublishedDate(Date publishedDate) {
       this.publishedDate = publishedDate;
   }

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "AUTHOR_ID")
   public Author getAuthor() {
       return author;
   }

   public void setAuthor(Author author) {
       this.author = author;
   }
}