package fatec.ams.sempadrao;

public class ClientWithoutPattern {

    public static void execute() {
        // Criando documentos diretamente sem clonagem
        Document document = new Document("Generic Document", "Generic content");
        Report report = new Report("Monthly Report", "Content of the report", "Alice");
        Contract contract = new Contract("Service Contract", "Terms and conditions", "Bob's Company");

        // Modificando os objetos diretamente
        report.setTitle("Modified Monthly Report");
        report.setAuthor("Bob");
        contract.setTitle("Modified Service Contract");
        contract.setClient("Alice's Company");

        // Mostrando os documentos
        System.out.println(document);
        System.out.println(report);
        System.out.println(contract);
    }
}
