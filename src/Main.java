import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Imposto Java");
        Scanner leitura = new Scanner(System.in);
        System.out.print("Renda anual com salário: ");
        double salarioAnual = leitura.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double servicoAnual = leitura.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double capitalAnual = leitura.nextDouble();
        System.out.print("Gasto Médico: ");
        double gastoMedico = leitura.nextDouble();
        System.out.print("Renda Educacional: ");
        double gastoEducacional = leitura.nextDouble();

        System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA\n");

        System.out.println("CONSOLIDADO DE RENDA:");
        leitura.close();
        double impostoSalario = 0;
        double salario = salarioAnual/12;
        if(salario >= 5000)
        {
            impostoSalario = (salarioAnual * 0.20);
        } else if (salario < 5000 && salario >= 3000) {
            impostoSalario = (salarioAnual * 0.10);
        }

        double impostoServico = 0;

        if (servicoAnual > 0)
            impostoServico = servicoAnual * 0.15;

        double impostoCapital = 0;
        if (capitalAnual > 0)
            impostoCapital = capitalAnual * 0.20;

        System.out.printf("Imposto sobre o salário: %.2f", impostoSalario);
        System.out.printf("\nImposto sobre serviço: %.2f", impostoServico);
        System.out.printf("\nImposto sobre ganho de capital: %.2f", impostoCapital);

        System.out.println("\nDEDUÇÕES:");
        double maximoDedutivel = (impostoCapital + impostoServico + impostoSalario) * 0.3;
        double gastosDedutivel = gastoEducacional + gastoMedico;

        System.out.printf("\nMáximo dedutível: %.2f", maximoDedutivel);
        System.out.printf("\nGastos dedutíveis: %.2f", gastosDedutivel);

        System.out.println("\nRESUME:");
        double impostoTotal = impostoSalario + impostoServico + impostoCapital;
        System.out.printf("\nImposto bruto total: %.2f", impostoTotal);
        double abatimento = (gastosDedutivel >= maximoDedutivel ? gastosDedutivel : gastosDedutivel);
        System.out.printf("\nAbatimento: %.2f", abatimento);
        System.out.printf("\nImposto devido: %.2f", (impostoTotal - abatimento));



    }
}