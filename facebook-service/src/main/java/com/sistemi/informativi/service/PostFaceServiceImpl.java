package com.sistemi.informativi.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.PostFacebook;
import com.sistemi.informativi.repository.PostFacebookRepository;

@Service
public class PostFaceServiceImpl implements PostFaceService{
	
	@Autowired
	private PostFacebookRepository facebookRepository;

	@Override
	public PostFacebook findPostFacebookById(Integer id) throws Exception {
		
		PostFacebook postFacebook = facebookRepository.findById(id).orElseThrow(()-> new Exception("Not found post Facebook"));
		return postFacebook;
	}

	@Override
	public List<PostFacebook> findPostsFacebook() throws Exception {
		
		List<PostFacebook> postFacebook = facebookRepository.findAll();
		if(postFacebook.isEmpty()) {
			throw new Exception("The list of posts Facebook is empty");
		} else {
			return postFacebook;
		}
	}

	@Override
	public PostFacebook addOrUpdatePostFacebook(PostFacebook postFacebook) throws Exception {
		
		PostFacebook postFacebookAddOrUpdate = facebookRepository.save(postFacebook);
		if (!postFacebookAddOrUpdate.getMessage().equals(postFacebook.getMessage())) {
			throw new Exception("Insert or update for post Facebook failed");
		} else {
			return postFacebookAddOrUpdate;
		}
	}

	@Override
	public Map<String, Boolean> deleteById(Integer id) throws Exception {
		
		Map<String, Boolean> map = new HashMap<String,Boolean>();
		PostFacebook postFacebook = findPostFacebookById(id);
		try {
			facebookRepository.deleteById(id);
			map.put("Deletion: "+postFacebook.getMessage(), Boolean.TRUE);
		} catch(IllegalArgumentException iae) {
			map.put("Deletion", Boolean.FALSE);
			iae.printStackTrace();
		}
		return map;
	}
	

	
}
