package com.np.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@PostMapping("/test")
	public UserDetails test()
	{
		return new UserDetails();
	}
	
	@GetMapping("/test2")
	public void test2(@RequestBody UserDetails ud)
	{
		System.out.println(ud);
	}
	
	@GetMapping("/test3")
	public String test3()
	{
		return "hello test3";
	}

}
