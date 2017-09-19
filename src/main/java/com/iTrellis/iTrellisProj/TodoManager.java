package com.iTrellis.iTrellisProj;

import java.util.HashMap;

public class TodoManager {
	
	HashMap<String,Todo> todoList = new HashMap<String, Todo>();
	
	public boolean addTodo(Todo item){
		boolean isTaskAdded = false;
		try{
			if(item == null || todoList.containsKey(item.getTaskName())){
				return false; 
			}
			todoList.put(item.getTaskName(), item);
			isTaskAdded = true;
		}
		catch(Exception e){
			isTaskAdded = false;
			System.out.println("Unable to add task" + e.getMessage()  );
		}
		
		return isTaskAdded;
	}
	
	public boolean deleteTodo(String taskName){
		boolean isTaskDeleted = false;
		try{
			if(taskName == null || taskName.isEmpty()){
				isTaskDeleted = false;
			}
			if(todoList.containsKey(taskName)){
				todoList.remove(taskName);
				isTaskDeleted = true;
			}
		}
		catch(Exception e){
			isTaskDeleted = false;
			System.out.println("Unable to remove item "+e.getMessage());
		}
		return isTaskDeleted;
	}
	
	public boolean completeTodo(String taskName){
		boolean isTodoCompleted = false;
		try{
			if(taskName == null || taskName.isEmpty()){
				isTodoCompleted = false;
			}
			if(todoList.containsKey(taskName)){
				todoList.get(taskName).isCompleted = true;
				isTodoCompleted = true;
			}
		}
		catch(Exception e){
			isTodoCompleted = false;
			System.out.println("Unable to mark the task as complete"+e.getMessage());
		}
		return isTodoCompleted;
	}
	
	public HashMap<String, Todo> getTasks(){
		
		return todoList;
	}

}
