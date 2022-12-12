public class ReportNext implements Report {
       
    private User user;

    public ReportNext(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
        
    }

}
