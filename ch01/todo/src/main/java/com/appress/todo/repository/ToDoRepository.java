package com.appress.todo.repository;

import com.appress.todo.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Denis Zaytsev
 */
public interface ToDoRepository extends CrudRepository<ToDo, String> {
}

