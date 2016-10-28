/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entidade.Chamado;
import entidade.RegistroChamado;
import java.util.Collection;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.ChamadoDAO;

/**
 *
 * @author Nicole Pires
 */
public class ChamadoDAOTest {
    
    @Test
    public void testaConstrutorChamadoDAO() {
        ChamadoDAO dao = new ChamadoDAO();
        HashMap<Integer, Chamado> cashChamado = new HashMap<>();
        HashMap<Integer, Chamado> cashRegistroChamado = new HashMap<>();
        assertNotNull(dao);
    }

    @Test
    public void testaGetChamados() {
        ChamadoDAO dao = new ChamadoDAO();
        Collection<Chamado> chamados = dao.getChamados();
        assertNotNull(chamados);
    }

    @Test
    public void testGetRegistrosNaoNulos() {
        ChamadoDAO dao = new ChamadoDAO();
        Collection<RegistroChamado> registros = dao.getRegistros();
        assertNotNull(registros);
    }
}
