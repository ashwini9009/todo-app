package com.app.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.todoapp.service.TaskService;

@Controller
 @RequestMapping("/tasks")
public class TaskController {
	
	private final TaskService taskService;
	
	public TaskController( TaskService taskService)
	{
		this.taskService =taskService;
	}
	
	@GetMapping
	public String getTasks(Model model) {
	    model.addAttribute("tasks", taskService.getAllTasks());
	    return "index";
	}

	@PostMapping
	public String createTasks(@RequestParam String title)
	{
		taskService.createTasks(title);
		return "redirect:/tasks";
	}
	
	//delete task using id
	@GetMapping("/{id}/delete") 
	public String deleteTasks(@PathVariable Long id) {
	    taskService.deleteTask(id);
	    return "redirect:/tasks"; // after deleting it will refresh the page
	}
	
	@GetMapping("/{id}/completed") 
	public String MarkAsCompletedTasks(@PathVariable Long id) {
	    taskService.MarkAsCompletedTask(id);
	    return "redirect:/tasks"; // after deleting it will refresh the page
	}
	
	
	

}
