package fatec.ams.compadrao;

public class ClientWithPattern {
    public static void execute() {

        // Criação dos documentos originais
        Report report = new Report("Monthly Report", "Content of the report", "Alice");
        Contract contract = new Contract("Service Contract", "Terms and conditions", "Bob's Company");

        // Clonando os documentos
        Report clonedReport = (Report) report.clone();
        Contract clonedContract = (Contract) contract.clone();

        // Modificando os clones
        clonedReport.setTitle("Cloned Monthly Report");
        clonedReport.setAuthor("Bob");
        clonedContract.setTitle("Cloned Service Contract");
        clonedContract.setClient("Alice's Company");

        // Mostrando os documentos originais e clonados
        System.out.println("Original Report: " + report);
        System.out.println("Cloned Report: " + clonedReport);
        System.out.println("Original Contract: " + contract);
        System.out.println("Cloned Contract: " + clonedContract);

    }

}
