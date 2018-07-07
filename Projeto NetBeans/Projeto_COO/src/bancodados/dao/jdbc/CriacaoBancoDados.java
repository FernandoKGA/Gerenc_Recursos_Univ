package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import objetos.*;
import bancodados.dao.*;
import java.sql.SQLException;

public class CriacaoBancoDados extends ConectorDAO_JDBC {

    private UsuarioDAO usuariodao;
    private RecursoDAO recursodao;
    private ReservaDAO reservadao;

    public CriacaoBancoDados(UsuarioDAO u, RecursoDAO rc, ReservaDAO rs) throws Banco_de_DadosException {
        super();
        //partimos do principio que estaremos usando o MySQL pelo sistema 
        this.usuariodao = u;
        this.recursodao = rc;
        this.reservadao = rs;
    }

    public void criaTabelas() throws Banco_de_DadosException {
        System.out.println("Passando");
        try {
            criaBancoDados();
            criaTabelaUsuario();
            criaTabelaRecurso();
            criaTabelaReserva();
            populaTabelas();
            System.out.println("Passou");
        } catch (SQLException ex) {
            throw new Banco_de_DadosException("Erro ao tentar criar o banco de dados.");
        }
    }

    private void criaBancoDados() throws SQLException, Banco_de_DadosException {
        abreConexaoSemBD();
        String wtf = getDbName();
        String query = String.format("CREATE DATABASE IF NOT EXISTS %s", wtf);
        preparaComandoSQL_SemBD(query);
        jaCriouBD = true;
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

    private void populaTabelas() throws Banco_de_DadosException {

        if (usuariodao.busca("10236540") != null) {
            return; //ou seja, a inserção já tinha sido feita
        }

        //Usuario - criados 1 aluno, 1 professor e 1 coordenador
        Usuario u = new Usuario("João Figueiredo da Silva", "10236540", "testeSilva@gmail.com", "11977555530", "SI", "Aluno");
        System.out.println(u.getNome());
        usuariodao.insere(u);
        Usuario u2 = new Usuario("Pedro Olivares", "6549871", "profpedro@usp.br", "11978546601", "SI", "Professor");
        usuariodao.insere(u2);
        Usuario u3 = new Usuario("Mariana Medeiros", "2345678", "marina.med@usp.br", "11966879845", "GA", "Coordenador");
        usuariodao.insere(u3);
        Usuario u4 = new Usuario("Cláudia Excluível", "63295831", "me.exclua@usp.br", "11963294872", "EFS", "Aluno");
        usuariodao.insere(u4);
        
        //Recursos - serão criados 1 sala, 1 auditório e 1 laboratório
        Recurso rc = new Recurso("102", "Sala", "I1", null); //Sala não possui curso
        recursodao.insere(rc);
        rc = new Recurso("AUD1", "Auditório", "CB", null); //
        recursodao.insere(rc);
        System.out.println("CRIOU");
        rc = new Recurso("LAB02", "Laboratório", "CB", "SI");
        recursodao.insere(rc);
        rc = new Recurso("220", "Sala", "I1", null);
        recursodao.insere(rc);

        //Reservas teste - Faremos com alguns
        u = usuariodao.busca("10236540"); //busca pelo aluno
        rc = recursodao.busca("102", "I1", "Sala"); //busca pela sala
        System.out.println(rc.getId_Recurso());
        Reserva rs = new Reserva("12:00", "13:00", "2018-12-02", u, rc);
        reservadao.insere(rs);

        u = usuariodao.busca("2345678"); //busca pelo coordenador
        rc = recursodao.busca("LAB02", "CB", "Laboratório"); //busca pelo lab
        //Para reservas de duas horas, fazemos o processo duas vezes
        rs = new Reserva("12:00", "13:00", "2018-12-02", u, rc);
        reservadao.insere(rs);
        rs = new Reserva("13:00", "14:00", "2018-12-02", u, rc);
        reservadao.insere(rs);
        
        //reserva que será usada de teste para exclusão
        u = usuariodao.busca("10236540"); //busca pelo aluno
        rc = recursodao.busca("102", "I1", "Sala"); //busca pela sala
        System.out.println(rc.getId_Recurso());
        rs = new Reserva("13:00", "14:00", "2018-12-02", u, rc);
        reservadao.insere(rs);
    }

}
