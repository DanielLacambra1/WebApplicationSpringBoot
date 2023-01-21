package com.bloque5rubrica2.springboot.bloque5rubrica2.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bloque5rubrica2.springboot.bloque5rubrica2.model.Todo;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;
    static {
        todos.add(new Todo(1, "user", "Estudiar Spring MVC", new Date(),false));
        todos.add(new Todo(2, "user", "Estudiar SpringBoot", new Date(), false));
        todos.add(new Todo(3, "user", "Estudiar Servlet", new Date(),false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
