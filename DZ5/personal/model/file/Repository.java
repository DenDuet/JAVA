package personal.model.file;

import java.util.List;

import personal.model.User;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    User updateUser(User user) throws Exception;
    User readUser(String userId) throws Exception;
    void deleteUser(User user) throws Exception;
    

}
