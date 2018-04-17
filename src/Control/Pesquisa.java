package Control;

import DAO.Conta;
import DAO.contaEspecial;
import DAO.contaPoupanca;

import java.util.ArrayList;
import java.util.Collections;

public class Pesquisa {
    public String pesquisaCE(ArrayList<contaEspecial> e, int nConta){
        Conta ex= new Conta();
        ex.setNumero(nConta);
        int ob = Collections.binarySearch(e,ex);
        e.remove(ob);
        return e.toString();
    }
    public String pesquisaCP(ArrayList<contaPoupanca> e, int nConta){
        Conta ex= new Conta();
        ex.setNumero(nConta);
        int ob = Collections.binarySearch(e,ex);
        e.remove(ob);
        return e.toString();
    }
}
