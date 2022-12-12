package model.file;

import java.util.List;

public interface Operation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
