package Control;

import DAO.contaEspecial;
import DAO.contaPoupanca;

import java.util.ArrayList;
//dsadsdsa
public class cadastroControl {
    public ArrayList<contaEspecial> addNovaCE(ArrayList<contaEspecial> contasE, contaEspecial conta){
        contasE.add(conta);
        return  contasE;
    }
    public ArrayList<contaPoupanca> addNovaCP(ArrayList<contaPoupanca> contasP, contaPoupanca conta){
        contasP.add(conta);
        return  contasP;
    }
}
