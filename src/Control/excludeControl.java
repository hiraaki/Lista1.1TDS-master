package Control;

import DAO.Conta;
import DAO.contaEspecial;
import DAO.contaPoupanca;

import java.util.ArrayList;
import java.util.Collections;

public class excludeControl {
    public ArrayList<contaEspecial> delContaE(ArrayList<contaEspecial> e, int nconta){
        Conta ex= new Conta();
        ex.setNumero(nconta);
        int ob = Collections.binarySearch(e,ex);
        e.remove(ob);
        return e;
    }
    public ArrayList<contaPoupanca> delContaP(ArrayList<contaPoupanca> e, int nconta){
        Conta ex= new Conta();
        ex.setNumero(nconta);
        int ob = Collections.binarySearch(e,ex);
        e.remove(ob);
        return e;
    }
}
