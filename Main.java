import java.util.Stack;

public class Main {
        public static void main(String[] args) {
            Inverso InverterPalavras = new Inverso();
            String exemplo1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
            String exemplo2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";
    
            String resultado1 = Inverso.InverterPalavras(exemplo1);
            String resultado2 = Inverso.InverterPalavras(exemplo2);
    
            System.out.println("Exemplo 1:");
            System.out.println("Entrada: " + exemplo1);
            System.out.println("Saída: " + resultado1);
            System.out.println();
    
            System.out.println("Exemplo 2:");
            System.out.println("Entrada: " + exemplo2);
            System.out.println("Saída: " + resultado2);
        }
}
