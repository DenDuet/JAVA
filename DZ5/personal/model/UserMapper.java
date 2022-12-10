package personal.model;

public class UserMapper {

    String subLine = ",";

    public UserMapper(String subLine) {
        this.subLine = subLine;
    }
   
    public UserMapper() {
    }


    public String map(User user) {
        return String.format("%s%s%s%s%s%s%s", user.getId(), subLine, user.getFirstName(), subLine, user.getLastName(), subLine, user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(subLine);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
