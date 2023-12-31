package com.sistemi.informativi.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PostFacebook implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Boolean isTagged;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
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

	public PostFacebook(String message, Boolean isTagged) {
		super();
		this.message = message;
		this.isTagged = isTagged;
	}

	protected PostFacebook() {
		super();
	}
    

}
