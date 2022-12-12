public class ReportNextNext implements Report {
       
    private User user;

    public ReportNextNext(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Twice");
        System.out.println("Report for user: " + user.getName());
        System.out.println("Report for user: " + user.getName());
        
    }

}
