/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicole Pires
 */
public class ClienteEmpresaTest {
    
    @Test
    public void testaSetCodigoNegativo(){
        Empresa empresa = new Empresa(1,"Teste_Empresa");
        ClienteEmpresa cliente_empresa = new ClienteEmpresa(1,empresa,12345678,"Teste_Nome",1);
        cliente_empresa.setCodigo(-21);
        assertNotNull(cliente_empresa.getCodigo());
    }
}
