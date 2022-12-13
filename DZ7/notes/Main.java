// package notes;

// Написать проект, "Записки", содержащий работу с записками из консоли (можно прочитать все записки, создать одну записку, 
// отредактировать записку, удалить, и прочитать одну записку по ID), записка содержит в себе как минимум 3 поля Id, 
// заголовок и текст, можно добавить дату. 
// Хранение по вашему выбору, можно в текстовом файле (или каждая записка в одном файле, как вам удобнее)

import controllers.Controller;
import controllers.Logger;
import model.file.FileOperation;
import model.file.IRepositor;
import model.file.Repository;
import model.file.RepositoryFile;

import views.View;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("s.txt");
        FileOperation fileOperation = new FileOperation("notes.txt");
        
        Repository repository = new RepositoryFile(fileOperation);
        Repository repositoryLog = new IRepositor(repository, logger, fileOperation);
        Controller controller = new Controller(repositoryLog);
        
        View view = new View(controller, logger);
        view.run();
    }
}
