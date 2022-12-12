package views;

import controllers.Controller;
import model.Note;

import java.util.List;
import java.util.Scanner;

public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду из списка: READ, CREATE, UPDATE, LIST, DELETE, EXIT: \n", true);
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
                continue;
            }

            try {
                switch (com) {
                    case CREATE:
                        Note note = setNote(false);
                        controller.saveNote(note);
                        break;
                    case READ:
                        String id = prompt("Номер заметки: ", false);
                        Note readedNote = controller.readNote(id);
                        System.out.println(readedNote);
                        break;
                    case LIST:
                        System.out.println("Все заметки: \n");
                        List<Note> noteList = controller.readNoteList();
                        for (Note u : noteList) {
                            System.out.println(u+"\n");
                        }
                        break;
                    case UPDATE:
                        Note updateNote = setNote(true);
                        controller.updateNote(updateNote);
                        System.out.println("Заметка заменена. \n");
                        break;
                    case DELETE:
                        String noteId = prompt("Номер заметки: ", false);
                        Note deleteNote = controller.readNote(noteId);
                        controller.deleteNote(deleteNote);
                        System.out.println("Заметка удалена. \n");
                        break;
                    case EXIT:
                        return;
                    case NONE:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String prompt(String message, Boolean upCase) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        if (upCase) {
            return in.nextLine().toUpperCase();
        } else {
            return in.nextLine();
        }
    }

    private Note setNote(boolean forUpdate) {
        String idString = "";
        if (forUpdate) {
            idString = prompt("Id: ", false);

        }

        String title = prompt("Заголовок: ", false);
        String fieldString = prompt("Заметка: ", false);
        String dataString = prompt("Дата создания: ", false);
        if (forUpdate) {
            return new Note(idString, title, fieldString, dataString);
        }
        return new Note(title, fieldString, dataString);

    }
}
