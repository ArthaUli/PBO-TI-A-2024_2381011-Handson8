package services;

import entities.TodoList;
import repositories.TodoListRepository;

public class TodoListServicesImpl implements  TodoListServices{
    private final TodoListRepository todoListRepository;

    public TodoListServicesImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public TodoList[] getTodoList() {
        return todoListRepository.getAll();
    }

    @Override
    public void removedTodoList(String todo) {
        if(todo.isEmpty() || todo.isBlank()) {
            System.out.println("Masukkan todo dengan benar");
            return;
        }
    }

    @Override
    public Boolean removedTodoList(Integer number) {
        return null;
    }

    @Override
    public Boolean editTodoList(final Integer number, final String todo) {
        TodoList todoList = new TodoList();
        todoList.setId(number);
        todoList.setTodo(todo);
        return todoListRepository.edit(todoList);
    }

    @Override
    public boolean addtodoList(Integer integer) {
        return false;
    }
}
