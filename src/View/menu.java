package View;

import Control.excludeControl;
import DAO.contaEspecial;
import DAO.contaPoupanca;

import java.util.Scanner;

public class menu {

    public static Scanner in = new Scanner(System.in);

    public int menuInicial(){
        System.out.print("Escolha a Operação:" +
                "\n\tCriar Conta:(1)" +
                "\n\tExcluir Conta(2)" +
                "\n\tVisualizar Conta(3)" +
                "\nDigite a Opção: ");
        return in.nextInt();
    }
    public int menuTipoDeConta(){
        System.out.print("Digite o tipo da conta" +
                "\n\tConta Especial (1)" +
                "\n\tConta Poupanca (2)" +
                "\nDigite a Opção: ");
        return in.nextInt();
    }
    public contaEspecial menuCadastroCE(){
        String nome = in.nextLine();
        System.out.print("Nome Do Cliente: ");
        nome = in.nextLine();
        System.out.print("Saldo Inicial: ");
        float saldo = in.nextFloat();
        System.out.print("Limite Inicial: ");
        float limit = in.nextFloat();
        contaEspecial e = new contaEspecial(nome,-1,saldo,limit);
        return e;
    }
    public contaPoupanca menuCadastroCP(){
        String nome = in.nextLine();
        System.out.print("Nome Do Cliente: ");
        nome = in.nextLine();
        System.out.print("Saldo Inicial: ");
        float saldo = in.nextFloat();
        System.out.print("Dia de rendimento: ");
        int dia = in.nextInt();
        contaPoupanca p = new contaPoupanca(nome,-1,saldo,dia);
        return p;
    }
    public int menuNConta(){
        excludeControl ex= new excludeControl();
        System.out.print("\nNº da Conta: ");
        return in.nextInt();
    }


}
