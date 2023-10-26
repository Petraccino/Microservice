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

import com.sistemi.informativi.entity.PostFacebook;
import com.sistemi.informativi.service.PostFaceService;


@RestController
public class PostFacebookController {
	
	@Autowired
	private PostFaceService facebookService;
	
	@GetMapping("/facebook-posts/id/{id}")
	public PostFacebook findPostFacebookById(@PathVariable Integer id) throws Exception{
		PostFacebook postFacebook = facebookService.findPostFacebookById(id);
		return postFacebook; 
	}
	@GetMapping("/facebook-posts")
	public List<PostFacebook> findPostFacebook()throws Exception{
		List<PostFacebook>postsFacebook = facebookService.findPostsFacebook();
		return postsFacebook;
	}
	@PostMapping("/facebook-posts")
	public PostFacebook addPostFacebook(@RequestBody PostFacebook postFacebook)throws Exception{
		PostFacebook postFacebookAdd= facebookService.addOrUpdatePostFacebook(postFacebook);
		return postFacebookAdd;
	}
	@PutMapping("/facebook-posts")
	public PostFacebook updatePostFacebook(@RequestBody PostFacebook postFacebook)throws Exception{
		PostFacebook postFacebookUpdate= facebookService.addOrUpdatePostFacebook(postFacebook);
		return postFacebookUpdate;
	}
	@DeleteMapping("/facebook-posts/id/{id}")
	public Map<String, Boolean> deleteById(@PathVariable Integer id) throws Exception{
		Map<String, Boolean> map = facebookService.deleteById(id);
		return map;
	}

}
