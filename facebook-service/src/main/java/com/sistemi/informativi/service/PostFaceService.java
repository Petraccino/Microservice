package com.sistemi.informativi.service;

import java.util.List;
import java.util.Map;

import com.sistemi.informativi.entity.PostFacebook;

public interface PostFaceService {
	
	public PostFacebook findPostFacebookById(Integer id) throws Exception;
	public List<PostFacebook> findPostsFacebook()throws Exception;
	public PostFacebook addOrUpdatePostFacebook(PostFacebook postFacebook)throws Exception;
	public Map<String, Boolean> deleteById(Integer id) throws Exception;


}
