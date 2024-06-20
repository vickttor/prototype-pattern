package fatec.ams;

import fatec.ams.compadrao.ClientWithPattern;
import fatec.ams.sempadrao.ClientWithoutPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== Com Padrão =====\n");
        ClientWithPattern.execute();

        System.out.println("\n===== Sem Padrão =====\n");
        ClientWithoutPattern.execute();
    }
}