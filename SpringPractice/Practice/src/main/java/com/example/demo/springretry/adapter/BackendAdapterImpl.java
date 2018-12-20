package com.example.demo.springretry.adapter;

import java.util.Random;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import com.example.demo.springretry.exception.RemoteServiceNotAvailableException;

@Service
public class BackendAdapterImpl/* implements BackendAdapter*/ {

	@Retryable(
			value = {RemoteServiceNotAvailableException.class},
			maxAttempts = 3,
			backoff = @Backoff(delay = 1000)
			)
	public String getBackendResponse(boolean simualteretry, boolean simulateretryfallback) {
		if (simualteretry) {
			 System.out.println("Simulateretry is true, so try to simulate exception scenerio.");
			 
			 if (simulateretryfallback) {
	                throw new RemoteServiceNotAvailableException(
	                        "Don't worry!! Just Simulated for Spring-retry..Must fallback as all retry will get exception!!!");
	            }
		}
		
		int random = new Random().nextInt(4);
		 
        System.out.println("Random Number : " + random);
        if (random % 2 == 0) {
            throw new RemoteServiceNotAvailableException("Don't worry!! Just Simulated for Spring-retry..");
        }

	return"Hello from Remote Backend!!!";

	}

	@Recover
	public String getBackendResponseFallback(RuntimeException e) {
		System.out.println("All retries completed, so Fallback method called!!!");
        return "All retries completed, so Fallback method called!!!";
	}
}
