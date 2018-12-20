package com.example.demo.springretry.adapter;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

import com.example.demo.springretry.exception.RemoteServiceNotAvailableException;

public interface BackendAdapter {

	@Retryable(
			value = {RemoteServiceNotAvailableException.class},
			maxAttempts = 3,
			backoff = @Backoff(delay = 1000)
			)
	public String getBackendResponse(boolean simualteretry, boolean simulateretryfallback); 

	@Recover
	public String getBackendResponseFallback(RuntimeException e);
}
