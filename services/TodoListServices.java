package services;

import entities.TodoList;

public interface TodoListServices {
    TodoList[] getTodoList();
    void removedTodoList(String todo);
    Boolean removedTodoList(Integer number);
    Boolean editTodoList(Integer number, String todo);

    boolean addtodoList(Integer integer);
}
