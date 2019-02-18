package com.example.tododemo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tododemo.model.TodoItem;
import com.example.todoemo.service.TodoService;


@RestController
public class TodoDemoController {

	@Autowired
	private TodoService todoService;

    @RequestMapping("/")
    public ArrayList<TodoItem> index(Model model) {
        return todoService.findAll();
    }

    @RequestMapping("/add")
    public TodoItem addTodo(@RequestBody TodoItem todoItem) {
    	return todoService.addItem(todoItem);
    }

    @RequestMapping(value = "/update")
    public TodoItem updateTodo(@RequestBody TodoItem todoItem) {
        return todoService.updateItem(todoItem);
    }


    @DeleteMapping(value = "/delete")
    public boolean deleteUser(@RequestParam("userid") Long userid) {
        return todoService.delete(userid);
    }
}
