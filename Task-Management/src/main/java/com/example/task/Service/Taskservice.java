package com.example.task.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.entity.Task;
import com.example.task.repository.TaskRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Taskservice {

	@Autowired
	TaskRepository taskrepo;
	
	public Task createTask(Task taskname)
	{
		Task name = taskrepo.save(taskname);
		return name;
	}
}
