package com.sistemi.informativi.service;

import java.util.List;
import java.util.Map;

import com.sistemi.informativi.entity.Tweet;

public interface TweetService {
	public Tweet findTweetById(Integer id) throws Exception;
	public List<Tweet> findTweets()throws Exception;
	public Tweet addOrUpdateTweet(Tweet tweet)throws Exception;
	public Map<String, Boolean> deleteById(Integer id) throws Exception;

}
