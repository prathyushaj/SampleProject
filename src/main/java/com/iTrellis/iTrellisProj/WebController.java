package com.iTrellis.iTrellisProj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class WebController {

	TodoManager todoManager =  new TodoManager();
	
	
	@PostMapping("/TaskManager/Addtask")
	public Boolean addTask(@RequestBody Todo item){
		return todoManager.addTodo(item);
	}
	
	@GetMapping("/TaskManager/Gettasks")
	public String getTasks(){
		return new Gson().toJson(todoManager.getTasks());
	}
	
	@PostMapping("/TaskManager/Deletetasks")
	public Boolean deleteATask(@RequestBody String taskName){
		return todoManager.deleteTodo(taskName);
	}
	
}
