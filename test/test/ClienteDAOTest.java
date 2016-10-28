/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.ClienteDAO;

/**
 *
 * @author Nicole Pires
 */
public class ClienteDAOTest {
    
    @Test
   public void testaValidarCPF(){
       ClienteDAO dao = new ClienteDAO();
       assertTrue(dao.validarCPF(1111111111));
       
   }
   
   @Test
   public void testaGerarCodigo(){
      ClienteDAO dao = new ClienteDAO();
      assertNotNull(dao.gerarCodigo());
   }
   
   
   @Test public void testaVoltaCashCliente(){
       ClienteDAO dao = new ClienteDAO();
       assertNotNull(dao.voltaCashCliente());
   }

}
