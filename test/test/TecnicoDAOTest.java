/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entidade.Tecnico;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.TecnicoDAO;

/**
 *
 * @author Nicole Pires
 */
public class TecnicoDAOTest {
    
    @Test
    public void getTecnicoComCodigoNegativo() {
        HashMap<Integer, Tecnico> cashTecnicos = new HashMap<>();
        Tecnico t = new Tecnico("Teste", -2);
        cashTecnicos.put(-2, t);
        TecnicoDAO dao = new TecnicoDAO();
        assertNull(dao.get(-1));
    }

    @Test
    public void getTecnicoComCodigoPositivo() {
        HashMap<Integer, Tecnico> cashTecnicos = new HashMap<>();
        Tecnico t = new Tecnico("Teste", 2);
        cashTecnicos.put(2, t);
        TecnicoDAO dao = new TecnicoDAO();
        assertNull(dao.get(2));
    }

    @Test
    public void testaGerarCodigoNaoNegativo() {
        TecnicoDAO dao = new TecnicoDAO();
        int esseValorNaoPodeSerNegativo = dao.gerarCodigo();
        //se o valor gerado for menor que zero, ele irá falha
        if (esseValorNaoPodeSerNegativo < 0) {
            fail();
        }

    }
}
