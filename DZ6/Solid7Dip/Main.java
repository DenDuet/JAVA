public class Main {
    public static void main(String[] args) {

        Report report = new Report();
        PrintReport reportPrint = new PrintReport();
        SaveReport reportSave = new SaveReport();
        report.calculate();
        report.output(reportPrint);
        System.out.println("------------");
        report.output(reportSave);

    }
}
