import Control.Pesquisa;
import Control.cadastroControl;
import Control.excludeControl;
import DAO.Conta;
import DAO.contaEspecial;
import DAO.contaPoupanca;
import View.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void clearConsole()
    {
        for(int i=0;i<15;i++)
            System.out.println("");
    }


    public static void main(String[] args) {
        ArrayList<contaEspecial> cE= new ArrayList<>();
        ArrayList<contaPoupanca> cP= new ArrayList<>();
        cadastroControl cC = new cadastroControl();
        excludeControl eX= new excludeControl();
        Pesquisa pe= new Pesquisa();
        int op = -1;
        while(op!=0) {
            menu m = new menu();
            op = m.menuInicial();
            //cadastro
            if(op==1){
                op=m.menuTipoDeConta();
                //conta Especial
                if(op==1){
                    cE= cC.addNovaCE(cE,m.menuCadastroCE());
                //conta Poupança
                }else if(op==2){
                    cP= cC.addNovaCP(cP,m.menuCadastroCP());
                }
            //Exclusão
            }else if(op==2){
                op=m.menuTipoDeConta();
                //conta Especial
                if(op==1){
                    int ob = m.menuNConta();
                    cE = eX.delContaE(cE,ob);
                //conta Poupança
                }else if(op==2){
                    int ob = m.menuNConta();
                    cP = eX.delContaP(cP,ob);
                }
            }else if(op==3){
                op=m.menuTipoDeConta();
                if(op==1){
                    op=m.menuNConta();
                    System.out.println(pe.pesquisaCE(cE,op));
                }else if(op==2){
                    op=m.menuNConta();
                    System.out.println(pe.pesquisaCP(cP,op));
                }
            }
            clearConsole();

        }

    }
}
