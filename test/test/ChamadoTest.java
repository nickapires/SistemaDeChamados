
package test;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicole Pires
 */
public class ChamadoTest {
    
    @Test
    public void testaConstrutorComPrioridadeNegativa(){
            Tecnico tecnico = new Tecnico("Teste_Tecnico",1);
            Empresa empresa = new Empresa(1,"Teste_Empresa");
            ClienteEmpresa cliente_empresa= new ClienteEmpresa(1,empresa,1234,"",1234);
            Chamado chamado = new Chamado(1,"Teste_Titulo","Teste_Desc",-9,tecnico,cliente_empresa,"SOTeste","VersaoSOTest","TipoConexaoTest","EndRedeTest");
            assertNotNull(chamado);
        
    }
    @Test
    public void testaConstrutorComCodigoNegativo(){
        Tecnico tecnico = new Tecnico("Teste_Tecnico",1);
            Empresa empresa = new Empresa(1,"Teste_Empresa");
            ClienteEmpresa cliente_empresa= new ClienteEmpresa(1,empresa,1234,"",1234);
            Chamado chamado = new Chamado(-1,"Teste_Titulo","Teste_Desc",9,tecnico,cliente_empresa,"SOTeste","VersaoSOTest","TipoConexaoTest","EndRedeTest");
            assertNotNull(chamado);
    }
    
}
