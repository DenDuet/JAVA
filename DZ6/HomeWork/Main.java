public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		// PersisterNextNext persister = new PersisterNextNext(user);
		// ReportNextNext report = new ReportNextNext(user);
		PersisterNext persister = new PersisterNext(user);
		ReportNext report = new ReportNext(user);
		report.report();
		persister.save();
	}
}