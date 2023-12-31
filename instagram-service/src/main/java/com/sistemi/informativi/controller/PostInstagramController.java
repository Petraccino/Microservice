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

import com.sistemi.informativi.entity.PostInstagram;
import com.sistemi.informativi.service.PostInstagramService;


@RestController
public class PostInstagramController {
@Autowired
PostInstagramService instagramService;

@GetMapping("/instagram-posts/id/{id}")
public PostInstagram findPostInstagramById(@PathVariable Integer id) throws Exception{
	PostInstagram postInstagram = instagramService.findPostInstagramById(id);
	return postInstagram; 
}
@GetMapping("/instagram-posts")
public List<PostInstagram> findPostInstagram()throws Exception{
	List<PostInstagram>postInstagrams = instagramService.findPostsInstagram();
	return postInstagrams;
}
@PostMapping("/instagram-posts")
public PostInstagram addPostInstagram(@RequestBody PostInstagram postInstagram)throws Exception{
	PostInstagram postInstagramAdd= instagramService.addOrUpdatePostInstagram(postInstagram);
	return postInstagramAdd;
}
@PutMapping("/instagram-posts")
public PostInstagram updatePostInstagram(@RequestBody PostInstagram postInstagram)throws Exception{
	PostInstagram postInstagramUpdate= instagramService.addOrUpdatePostInstagram(postInstagram);
	return postInstagramUpdate;
}
@DeleteMapping("/instagram-posts/id/{id}")
public Map<String, Boolean> deleteById(@PathVariable Integer id) throws Exception{
	Map<String, Boolean> map = instagramService.deleteById(id);
	return map;
}
}
