package com.sistemi.informativi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sistemi.informativi.entity.Tweet;
import com.sistemi.informativi.service.TweetService;

@RestController
public class TweetController {

	@Autowired
	TweetService service;
	@GetMapping("/tweets/id/{id}")
	public Tweet findTweetById(@PathVariable Integer id) throws Exception{
		Tweet tweet = service.findTweetById(id);
		return tweet; 
	}
	@GetMapping("/tweets")
	public List<Tweet> findTweet()throws Exception{
		List<Tweet>tweets = service.findTweets();
		return tweets;
	}
	@PostMapping("/tweets")
	public Tweet addTweet(@RequestBody Tweet tweet)throws Exception{
		Tweet tweetAdd= service.addOrUpdateTweet(tweet);
		return tweetAdd;
	}
	@PutMapping("/tweets")
	public Tweet updateTweet(@RequestBody Tweet tweet)throws Exception{
		Tweet tweetUpdate= service.addOrUpdateTweet(tweet);
		return tweetUpdate;
	}
	@DeleteMapping("/tweets/id/{id}")
	public Map<String, Boolean> deleteById(@PathVariable Integer id) throws Exception{
		Map<String, Boolean> map = service.deleteById(id);
		return map;
	}
	
}
