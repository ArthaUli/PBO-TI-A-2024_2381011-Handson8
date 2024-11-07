import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;
import services.TodoListServices;
import services.TodoListServicesImpl;
import view.TodoListTerminalView;
import view.TodoListView;

public class Main {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListServices todoListServices = new TodoListServicesImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListServices);
        todoListView.run();
    }
}
