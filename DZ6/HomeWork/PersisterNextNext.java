public class PersisterNextNext implements Persister {
    
    private User user;

    public PersisterNextNext(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Twice");
        System.out.println("Saved user: " + user.getName());
        System.out.println("Saved user: " + user.getName());
    }
    
    
}
