package com.sistemi.informativi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.Tweet;
import com.sistemi.informativi.repository.TweetRepository;

@Service
public class TweetServiceImpl implements TweetService{
	@Autowired
	TweetRepository repository;

	@Override
	public Tweet findTweetById(Integer id) throws Exception {
		Tweet tweet = repository.findById(id).orElseThrow(()-> new Exception("Not found Tweet"));
		return tweet;
	}

	@Override
	public List<Tweet> findTweets() throws Exception {
		List<Tweet> tweets = repository.findAll();
		if(tweets.isEmpty()) {
			throw new Exception("The list of tweet is empty");
		} else {
			return tweets;
		}
	}

	@Override
	public Tweet addOrUpdateTweet(Tweet tweet) throws Exception {
		Tweet tweetAddOrUpdate = repository.save(tweet);
		if (!tweetAddOrUpdate.getHashTag().equals(tweet.getHashTag())) {
			throw new Exception("Insert or update for tweet failed");
		} else {
			return tweetAddOrUpdate;
		}

	}

	@Override
	public Map<String, Boolean> deleteById(Integer id) throws Exception {
		Map<String, Boolean> map = new HashMap<String,Boolean>();
		Tweet tweet = findTweetById(id);
		try {
			repository.deleteById(id);
			map.put("Deletion: "+tweet.getHashTag(), Boolean.TRUE);
		} catch(IllegalArgumentException iae) {
			map.put("Deletion", Boolean.FALSE);
			iae.printStackTrace();
		}
		return map;
	}

}
