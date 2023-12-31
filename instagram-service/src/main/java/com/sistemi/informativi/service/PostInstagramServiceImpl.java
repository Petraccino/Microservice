package com.sistemi.informativi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.PostInstagram;
import com.sistemi.informativi.repository.PostInstagramRepository;

@Service
public class PostInstagramServiceImpl implements PostInstagramService{

	@Autowired
	private PostInstagramRepository instagramRepository;

	@Override
	public PostInstagram findPostInstagramById(Integer id) throws Exception {
		PostInstagram postInstagram = instagramRepository.findById(id).orElseThrow(()-> new Exception("Not found post Instagram"));
		return postInstagram;
	}

	@Override
	public List<PostInstagram> findPostsInstagram() throws Exception {
		List<PostInstagram> postsInstagram = instagramRepository.findAll();
		if(postsInstagram.isEmpty()) {
			throw new Exception("The list of post Instagram is empty");
		} else {
			return postsInstagram;
		}
	}

	@Override
	public PostInstagram addOrUpdatePostInstagram(PostInstagram postInstagram) throws Exception {
		PostInstagram postInstagramAddOrUpdate = instagramRepository.save(postInstagram);
		if (!postInstagramAddOrUpdate.getMessage().equals(postInstagram.getMessage())) {
			throw new Exception("Insert or update for post Instagram failed");
		} else {
			return postInstagramAddOrUpdate;
		}
	}

	@Override
	public Map<String, Boolean> deleteById(Integer id) throws Exception {
		Map<String, Boolean> map = new HashMap<String,Boolean>();
		PostInstagram postInstagram = findPostInstagramById(id);
		try {
			instagramRepository.deleteById(id);
			map.put("Deletion: "+postInstagram.getMessage(), Boolean.TRUE);
		} catch(IllegalArgumentException iae) {
			map.put("Deletion", Boolean.FALSE);
			iae.printStackTrace();
		}
		return map;
	}

}
