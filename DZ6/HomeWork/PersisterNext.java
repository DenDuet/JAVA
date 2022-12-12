public class PersisterNext implements Persister {
    
    private User user;

    public PersisterNext(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + user.getName());       
    }
    
    
}
