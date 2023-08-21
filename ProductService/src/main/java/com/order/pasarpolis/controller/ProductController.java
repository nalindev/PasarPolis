package com.order.pasarpolis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<String> getProduct() {
		List<String> list = new ArrayList<>();
		list.add("nalin");
		list.add("saurav");
		return list;
	}

}
