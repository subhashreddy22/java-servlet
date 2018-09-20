package com.webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todoList = new ArrayList<>();
	
	static {
		todoList.add(new Todo("Learn Java"));
		todoList.add(new Todo("Learn Spring MVC"));
		todoList.add(new Todo("Learn Angular JS"));
	}
	
	public List<Todo> getTodoList() {
		return todoList;
	}
}
