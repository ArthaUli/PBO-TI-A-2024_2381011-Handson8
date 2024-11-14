import config.Database;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryDblmpl;
import repositories.TodoListRepositoryImpl;
import services.TodoListServices;
import services.TodoListServicesImpl;
import view.TodoListTerminalView;
import view.TodoListView;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("my_database", "root", "", "localhost", "3306");
        database.setup();

        TodoListRepository todoListRepository = new TodoListRepositoryDblmpl(database);
        TodoListServices todoListService = new TodoListServicesImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}