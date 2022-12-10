package personal;

import personal.controllers.UserController;
import personal.model.file.FileOperation;
import personal.model.file.FileOperationImpl;
import personal.model.file.Repository;
import personal.model.file.RepositoryFile;
import personal.model.file.RepositoryFileNext;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        // FileOperation fileOperation = new FileOperationImpl("users.txt");
        FileOperation fileOperationNew = new FileOperationImpl("usersNew.txt");
        // Repository repository = new RepositoryFile(fileOperation);
        Repository repositoryNext = new RepositoryFileNext(fileOperationNew);
        // UserController controller = new UserController(repository);
        UserController controllerNext = new UserController(repositoryNext);
        // ViewUser view = new ViewUser(controller);
        ViewUser view = new ViewUser(controllerNext);
        view.run();
    }
}
