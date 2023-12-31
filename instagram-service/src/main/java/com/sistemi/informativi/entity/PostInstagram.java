package com.sistemi.informativi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PostInstagram implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Boolean isTagged;

    @Column(nullable = false)
    private Boolean isStory;

    @Column(nullable = false)
    private Boolean isReel;

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

    public Boolean getIsStory() {
        return isStory;
    }

    public void setIsStory(final Boolean isStory) {
        this.isStory = isStory;
    }

    public Boolean getIsReel() {
        return isReel;
    }

    public void setIsReel(final Boolean isReel) {
        this.isReel = isReel;
    }

	public PostInstagram(String message, Boolean isTagged, Boolean isStory, Boolean isReel) {
		super();
		this.message = message;
		this.isTagged = isTagged;
		this.isStory = isStory;
		this.isReel = isReel;
	}

	protected PostInstagram() {
		super();
	}
    

}
