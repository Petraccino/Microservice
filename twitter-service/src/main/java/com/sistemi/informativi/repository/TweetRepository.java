package com.sistemi.informativi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemi.informativi.entity.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Integer>{

}
