//package model.file;
//
//import controllers.Loggable;
//import model.Note;
//
//import java.util.List;
//
//public class IRepositor implements Repository {
//    private Repository repository;
//    private Loggable logger;
//
//    public void Irepositor(Repository repository, Loggable logger) {
//        this.repository = repository;
//        this.logger = logger;
//    }
//    @Override
//    public List<Note> getAllNotes() {
//        return null;
//    }
//
//    @Override
//    public String CreateNote(Note note) {
//        logger.log("Начинаем создавать новую записку.");
////        Repository result = repository.CreateNote(Note note);
//        logger.log("Создали.");
////        return result.toString();
//        return "";
//    }
//
//    @Override
//    public Note updateNote(Note note) throws Exception {
//        return null;
//    }
//
//    @Override
//    public Note readNote(String noteId) throws Exception {
//        return null;
//    }
//
//    @Override
//    public void deleteNote(Note note) throws Exception {
//
//    }
//}
