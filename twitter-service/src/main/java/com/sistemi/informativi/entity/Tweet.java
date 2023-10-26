package com.sistemi.informativi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tweet implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 12)
    private String hashTag;

    @Column(nullable = false, length = 140)
    private String message;

    @Column(nullable = false)
    private Boolean isTagged;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getHashTag() {
        return hashTag;
    }

    public void setHashTag(final String hashTag) {
        this.hashTag = hashTag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public Boolean getIsTagged() {
        return isTagged;
    }

    public void setIsTagged(final Boolean isTagged) {
        this.isTagged = isTagged;
    }

	public Tweet(String hashTag, String message, Boolean isTagged) {
		super();
		this.hashTag = hashTag;
		this.message = message;
		this.isTagged = isTagged;
	}

	protected Tweet() {
		super();
	}
    

}
