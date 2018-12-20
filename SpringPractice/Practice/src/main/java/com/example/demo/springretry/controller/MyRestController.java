package com.example.demo.springretry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.springretry.adapter.BackendAdapter;
import com.example.demo.springretry.adapter.BackendAdapterImpl;

@RestController
public class MyRestController {

	@Autowired
	BackendAdapterImpl backendAdapter;

	@GetMapping("/retry")
	@ExceptionHandler({ Exception.class })
	public String validateSpringRetryCapability(@RequestParam(required = false) boolean simulateretry,
			@RequestParam(required = false) boolean simulateretryfallback) {
		System.out.println("===================");
		System.out.println("inside restcontroller methos");

		return backendAdapter.getBackendResponse(simulateretry, simulateretryfallback);

	}
}
