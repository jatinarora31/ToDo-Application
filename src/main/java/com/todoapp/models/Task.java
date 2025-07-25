package com.todoapp.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private boolean completed;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}
	public Task(Long id, String title, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
	public Task() {
		super();
	}
	
	
	

}
