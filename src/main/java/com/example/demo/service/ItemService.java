package com.example.demo.service;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CreateItemRequest;
import com.example.demo.dto.ItemResponse;

@Service
public class ItemService {

	private final AtomicLong idSequence = new AtomicLong(1);

	public ItemResponse createItem(CreateItemRequest request) {
		if (request.getName() == null || request.getName().isBlank()) {
			throw new IllegalArgumentException("name is required");
		}

		long id = idSequence.getAndIncrement();
		System.out.println("Creating item with id: " + id);
		System.out.println("Request name: " + request.getName());
		return new ItemResponse(
				id,
				request.getName().trim(),
				request.getDescription(),
				Instant.now());
	}
}
