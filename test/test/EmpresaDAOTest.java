/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entidade.Empresa;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.EmpresaDAO;

/**
 *
 * @author Nicole Pires
 */
public class EmpresaDAOTest {
    
   @Test
   public void testaGetEmpresas(){
       EmpresaDAO dao = new EmpresaDAO();
       Collection<Empresa> empresas = dao.getEmpresas();
       assertNotNull(empresas);
   }
   
   @Test
   public void testeVoltaEmpresa(){
       EmpresaDAO dao = new EmpresaDAO();
       assertNotNull(dao.voltaEmpresa());
   }
   
   @Test 
   public void testaConstrutorEmpresaDAO(){
       EmpresaDAO dao = new EmpresaDAO();
       assertNotNull(dao);
   }
}
