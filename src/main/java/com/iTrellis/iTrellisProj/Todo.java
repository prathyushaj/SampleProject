package com.iTrellis.iTrellisProj;

import java.util.Date;

public class Todo {

	public String taskName;

	public String description;
	
	public Date deadLine; 
	
	public Boolean isCompleted;
	
	public String details;
	
	public Todo(){
		
	}
	
	public Todo(String description){
		this.description = description;
		this.isCompleted = false;
	}
	
	public Todo(String taskName, String description, Date deadLine, Boolean isCompleted, String details) {
		super();
		this.taskName = taskName;
		this.description = description;
		this.deadLine = deadLine;
		this.isCompleted = isCompleted;
		this.details = details;
	}
	
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadline) {
		this.deadLine = deadline;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
