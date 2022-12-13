package model.file;

import controllers.Loggable;
import model.Mapper;
import model.Note;

import java.util.List;

public class IRepositor implements Repository {
    private Repository repository;
    private Loggable logger;
    protected Mapper mapper = new Mapper();
    private Operation fileOperation;

    public IRepositor(Repository repository, Loggable logger, Operation fileOperation) {
        this.repository = repository;
        this.logger = logger;
        this.fileOperation = fileOperation;
        // this.mapper = mapper;
    }
    @Override
    public List<Note> getAllNotes() {
        logger.log("- Инициализируем список записок... ");
        List<Note> notes = repository.getAllNotes();
        return notes;
    }

    @Override
    public String CreateNote(Note note) {
        String result;
        logger.log("- Начинаем создавать новую записку... ");
        result = repository.CreateNote(note);
        return result;
    }

    @Override
    public Note updateNote(Note note) throws Exception {
        logger.log("- Начинаем обновлять записку... ");
        Note noteUpdate = repository.updateNote(note);
        return noteUpdate;
    }

    @Override
    public Note readNote(String noteId) throws Exception {
        logger.log("- Ищем записку по Id и читаем её... ");
        Note noteRead = repository.readNote(noteId);
        return noteRead;
    }

    @Override
    public void deleteNote(Note note) throws Exception {
        logger.log("- Ищем записку по Id и удаляем её... ");
        repository.deleteNote(note);
    }
}
