package personal.model;

public class UserMapperNext {
    public String map(User user) {
        return String.format("%s_%s_%s_%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split("_");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
