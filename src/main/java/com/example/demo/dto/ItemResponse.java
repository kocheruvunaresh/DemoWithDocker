package com.example.demo.dto;

import java.time.Instant;

public class ItemResponse {

	private long id;
	private String name;
	private String description;
	private Instant createdAt;

	public ItemResponse(long id, String name, String description, Instant createdAt) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdAt = createdAt;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}
}
