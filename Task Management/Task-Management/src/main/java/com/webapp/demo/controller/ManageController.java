package com.webapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.dao.TMDao;
import com.webapp.demo.TasManag.TaskManager;

@RestController
public class ManageController {
	
	@Autowired
	TMDao dao;
	
	@RequestMapping("/addTask")
	@ResponseBody
	public void addTask(@RequestParam String id,@RequestParam String holdname,@RequestParam String tskdate,@RequestParam String tskName,@RequestParam String tskstatus,TaskManager obj ) {
		
		obj.setTaskid(id);
		obj.setTaskHolderName(holdname);
		obj.setTaskDate(tskdate);
		obj.setTaskName(tskName);
		obj.setTaskStatus(tskstatus);
		dao.save(obj);
		System.out.println("task added");
		
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public void addTask(@RequestParam String id) {
		
		dao.updateStatus(id);
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public void deleteTask(@RequestParam String id) {
		
		dao.deleteTask(id);
		
	}
	
	@RequestMapping("/allTask")
	@ResponseBody
	public List<TaskManager> getAllTask(){
		
		return dao.findAll();
		
	}
	
	@RequestMapping("/getByHolder")
	@ResponseBody
	public List<TaskManager> getTaskByHolderName(@RequestParam String holdname){
		
		return dao.getTaskByHolder(holdname);
		
	}
}