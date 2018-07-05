package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import objetos.*;
import bancodados.dao.*;
import java.sql.SQLException;
public class criacaoBancoDados extends ConectorDAO_JDBC {

    private UsuarioDAO usuariodao;
    private RecursoDAO recursodao;
    private ReservaDAO reservadao;

    public criacaoBancoDados(UsuarioDAO u, RecursoDAO rc, ReservaDAO rs) throws Banco_de_DadosException {
        super();
        //partimos do principio que estaremos usando o MySQL pelo sistema 
        this.usuariodao = u;
        this.recursodao = rc;
        this.reservadao = rs;
    }

    public void criaTabelas() throws Banco_de_DadosException {
        try {
            criaBancoDados();
            criaTabelaUsuario();
            criaTabelaRecurso();
            criaTabelaReserva();
        } catch (SQLException ex) {
            throw new Banco_de_DadosException("Erro ao tentar criar o banco de dados.");
        }
    }

    private void criaBancoDados() throws SQLException, Banco_de_DadosException {
        abreConexaoSemBD();
        jaCriouBD = true;
        String wtf = getDbName();
        String query = String.format("CREATE DATABASE IF NOT EXISTS %s", wtf);
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }

    private void criaTabelaUsuario() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `USUARIO` ("
                + " `IDUSUARIO` int(10) unsigned NOT NULL AUTO_INCREMENT,"
                + " `NOME` varchar(50) NOT NULL,"
                + " `NUSP` varchar(11) NOT NULL,"
                + " `EMAIL` varchar(50) NOT NULL,"
                + " `CARGO` VARCHAR(20) NOT NULL,"
                + " `CURSO` VARCHAR(3) NOT NULL,"
                + " `TELEFONE` varchar(11) NOT NULL,"
                + " PRIMARY KEY (`IDUSUARIO`),"
                + " UNIQUE KEY `NUSP` (`NUSP`),"
                + " UNIQUE KEY `TELEFONE_UNIQUE` (`TELEFONE`),"
                + " UNIQUE KEY `EMAIL_UNIQUE` (`EMAIL`))";
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }

    private void criaTabelaRecurso() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `RECURSO` ("
                + "`IDRECURSO` int(10) unsigned NOT NULL AUTO_INCREMENT,"
                + "`NOME` varchar(50) NOT NULL,"
                + "`PREDIO` varchar(50) NOT NULL,"
                + "`TIPO` varchar(50) NOT NULL,"
                + "`CURSO` varchar(50),"
                + "PRIMARY KEY (`IDRECURSO`),"
                + "UNIQUE KEY `IDRECURSO_UNIQUE` (`IDRECURSO`))";
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }

    private void criaTabelaReserva() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `RESERVA` ("
                + "`IDRESERVA` int(10) unsigned NOT NULL AUTO_INCREMENT,"
                + "`HINICIO` varchar(5) NOT NULL,"
                + "`HFIM` varchar(5) NOT NULL,"
                + "`DATA` date NOT NULL,"
                + "`ID_RECURSO` int(10) unsigned NOT NULL,"
                + "`ID_USUARIO` int(10) unsigned NOT NULL,"
                + "`FINALIZADA` tinyint(4) NOT NULL,"
                + "PRIMARY KEY (`IDRESERVA`),"
                + "UNIQUE KEY `IDRESERVA_UNIQUE` (`IDRESERVA`),"
                + "KEY `ID_RECURSO_idx` (`ID_RECURSO`),"
                + "KEY `ID_USUARIO_idx` (`ID_USUARIO`),"
                + "CONSTRAINT `fk_ID_RECURSO_1` FOREIGN KEY (`ID_RECURSO`) REFERENCES `RECURSO` (`IDRECURSO`) ON DELETE NO ACTION ON UPDATE NO ACTION,"
                + "CONSTRAINT `fk_ID_USUARIO_1` FOREIGN KEY (`ID_USUARIO`) REFERENCES `USUARIO` (`IDUSUARIO`) ON DELETE NO ACTION ON UPDATE NO ACTION)";
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }
    
    private void populaTabelas() throws Banco_de_DadosException{
        //Usuario
        Usuario u = new Usuario();
        u.setNome("João Figueiredo da Silva");
        u.setNUSP("10236540");
        u.setTelefone("11977555530");
        u.setEmail("testeSilva@gmail.com");
        u.setCargo("Aluno");
        u.setCurso("SI");
        usuariodao.insere(u);
        u.setNome("Pedro Olivares");
        u.setNUSP("6549871");
        u.setTelefone("11978546601");
        u.setEmail("profpedro@usp.br");
        u.setCargo("Professor");
        u.setCurso("SI");
        usuariodao.insere(u);
        u.setNome("Mariana Medeiros");
        u.setNUSP("2345678");
        u.setTelefone("11966879845");
        u.setEmail("marina.med@usp.br");
        u.setCargo("Coordenador");
        u.setCurso("GA");
        usuariodao.insere(u);
        
    }

}
