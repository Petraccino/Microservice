package com.sistemi.informativi.service;

import java.util.List;
import java.util.Map;

import com.sistemi.informativi.entity.PostInstagram;

public interface PostInstagramService {
	public PostInstagram findPostInstagramById(Integer id) throws Exception;
	public List<PostInstagram> findPostsInstagram()throws Exception;
	public PostInstagram addOrUpdatePostInstagram(PostInstagram postInstagram)throws Exception;
	public Map<String, Boolean> deleteById(Integer id) throws Exception;

}
