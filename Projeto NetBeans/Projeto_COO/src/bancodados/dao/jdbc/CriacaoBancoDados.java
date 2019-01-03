package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import objetos.*;
import bancodados.dao.*;
import java.sql.SQLException;

public class CriacaoBancoDados extends ConectorDAO_JDBC {

    private TipoDAO tipodao;
    private CursoDAO cursodao;
    private PredioDAO prediodao;
    private UsuarioDAO usuariodao;
    private RecursoDAO recursodao;
    private ReservaDAO reservadao;

    public CriacaoBancoDados(TipoDAO t, CursoDAO c, PredioDAO p, 
            UsuarioDAO u, RecursoDAO rc, ReservaDAO rs) throws Banco_de_DadosException {
        super();
        //partimos do principio que estaremos usando o MySQL pelo sistema 
        this.tipodao = t;
        this.cursodao = c;
        this.prediodao = p;
        this.usuariodao = u;
        this.recursodao = rc;
        this.reservadao = rs;
    }

    public void criaTabelas() throws Banco_de_DadosException {
        System.out.println("Passando");
        try {
            criaBancoDados();
            System.out.println("criei bd");
            criaTabelaTipos();
            System.out.println("criei tipos");
            criaTabelaCursos();
            System.out.println("criei cursos");
            criaTabelaPredios();
            System.out.println("criei predios");
            criaTabelaUsuario();
            System.out.println("criei usuario");
            criaTabelaRecurso();
            System.out.println("criei recurso");
            criaTabelaReserva();
            System.out.println("criei reserva");
            populaTabelas();
            System.out.println("Passou");
        } catch (SQLException ex) {
            throw new Banco_de_DadosException("Erro ao tentar criar o banco de dados.");
        }
    }

    private void criaBancoDados() throws SQLException, Banco_de_DadosException {
        System.out.println("bancodados.dao.jdbc.CriacaoBancoDados.criaBancoDados()");
        String database_name = getDbName();
        String query = String.format("CREATE DATABASE IF NOT EXISTS %s", database_name);
        System.out.println(query);
        preparaComandoSQL_SemBD(query);
        jaCriouBD = true;
        pstmt.execute();
        System.out.println("erro");
        fechaConexao();
    }
    
    private void criaTabelaTipos() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `TIPOS` ("
                + " `IDTIPO` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,"
                + " `NOME` VARCHAR(30) NOT NULL,"
                + " PRIMARY KEY (`IDTIPO`),"
                + " UNIQUE KEY`IDTIPO_UNIQUE` (`IDTIPO`),"
                + " INDEX (`IDTIPO`)"
                + ")";
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }
    
    private void criaTabelaCursos() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `CURSOS` ("
                + " `IDCURSO` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,"
                + " `NOME` VARCHAR(60) NOT NULL,"
                + " PRIMARY KEY (`IDCURSO`),"
                + " UNIQUE KEY `IDCURSO_UNIQUE` (`IDCURSO`),"
                + " INDEX (`IDCURSO`)"
                + ")";
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }
    
    private void criaTabelaPredios() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `PREDIOS` ("
                + " `IDPREDIO` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,"
                + " `NOME` VARCHAR(30) NOT NULL,"
                + " PRIMARY KEY (`IDPREDIO`),"
                + " UNIQUE KEY `IDPREDIO_UNIQUE` (`IDPREDIO`),"
                + " INDEX (`IDPREDIO`)"
                + ")";
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
        String query = "CREATE TABLE IF NOT EXISTS `RECURSO` ("
                + "`IDRECURSO` int(10) unsigned NOT NULL AUTO_INCREMENT,"
                + "`NOME` varchar(50) NOT NULL,"
                + "`ID_PREDIO` varchar(50) NOT NULL,"
                + "`ID_TIPO` varchar(50) NOT NULL,"
                + "`ID_CURSO` varchar(50),"
                + "PRIMARY KEY (`IDRECURSO`),"
                + "UNIQUE KEY `IDRECURSO_UNIQUE` (`IDRECURSO`)"
                + ")";
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

        //buscar um usuario que nunca sera mostrado?

        if (usuariodao.busca("10236540") != null) {
            return; //ou seja, a inserção já tinha sido feita
        }
        
        Tipo tp = new Tipo("SALA");
        tipodao.insere(tp);
        Tipo tp1 = new Tipo("LABORATÓRIO");
        tipodao.insere(tp1);
        Tipo tp2 = new Tipo("AUDITÓRIO");
        tipodao.insere(tp2);
        
        //CB,I1,I3,I5,M7,A2,INCUB
        Predio pd = new Predio("CB");
        prediodao.insere(pd);
        Predio pd1 = new Predio("I1");
        prediodao.insere(pd1);
        Predio pd2 = new Predio("I3");
        prediodao.insere(pd2);
        Predio pd3 = new Predio("I5");
        prediodao.insere(pd3);
        Predio pd4 = new Predio("M7");
        prediodao.insere(pd4);
        Predio pd5 = new Predio("A2");
        prediodao.insere(pd5);
        Predio pd6 = new Predio("INCUB");
        prediodao.insere(pd6);
        
        //BTC, LCN, EFS, GER, GA, GPP, LZT, MKT, OBS, SI, TM
        Curso cr = new Curso("SI");
        cursodao.insere(cr);
        Curso cr1 = new Curso("GA");
        cursodao.insere(cr1);
        Curso cr2 = new Curso("EFS");
        cursodao.insere(cr2);
        Curso cr3 = new Curso("GPP");
        cursodao.insere(cr3);
        Curso cr4 = new Curso("LCN");
        cursodao.insere(cr4);
        Curso cr5 = new Curso("GER");
        cursodao.insere(cr5);
        Curso cr6 = new Curso("LZT");
        cursodao.insere(cr6);
        Curso cr7 = new Curso("MKT");
        cursodao.insere(cr7);
        Curso cr8 = new Curso("OBS");
        cursodao.insere(cr8);
        Curso cr9 = new Curso("TM");
        cursodao.insere(cr9);
        Curso cr10 = new Curso("BTC");
        cursodao.insere(cr10);
        
        //Usuario - criados 1 aluno, 1 professor e 1 coordenador
        Usuario u = new Usuario("João Figueiredo da Silva", "10236540", "testeSilva@gmail.com", "11977555530", cr, "Aluno");
        System.out.println(u.getNome());
        usuariodao.insere(u);
        Usuario u2 = new Usuario("Pedro Olivares", "6549871", "profpedro@usp.br", "11978546601", cr, "Professor");
        usuariodao.insere(u2);
        Usuario u3 = new Usuario("Mariana Medeiros", "2345678", "marina.med@usp.br", "11966879845", cr1, "Coordenador");
        usuariodao.insere(u3);
        Usuario u4 = new Usuario("Cláudia Excluível", "63295831", "me.exclua@usp.br", "11963294872", cr2, "Aluno");
        usuariodao.insere(u4);
        
        //Recursos - serão criados 1 sala, 1 auditório e 1 laboratório
        Recurso rc = new Recurso("102", tp, pd1, null); //Sala não possui curso
        recursodao.insere(rc);
        rc = new Recurso("AUD1", tp2, pd, null); //
        recursodao.insere(rc);
        System.out.println("CRIOU");
        rc = new Recurso("LAB02", tp1, pd, cr);
        recursodao.insere(rc);
        rc = new Recurso("220", tp, pd1, null);
        recursodao.insere(rc);

        //Reservas teste - Faremos com alguns
        u = usuariodao.busca("10236540"); //busca pelo aluno
        rc = recursodao.busca("102", pd1, tp); //busca pela sala
        System.out.println(rc.getId_Recurso());
        Reserva rs = new Reserva("12:00", "13:00", "2018-12-02", u, rc);
        reservadao.insere(rs);

        u = usuariodao.busca("2345678"); //busca pelo coordenador
        rc = recursodao.busca("LAB02", pd, tp1); //busca pelo lab
        //Para reservas de duas horas, fazemos o processo duas vezes
        rs = new Reserva("12:00", "13:00", "2018-12-02", u, rc);
        reservadao.insere(rs);
        rs = new Reserva("13:00", "14:00", "2018-12-02", u, rc);
        reservadao.insere(rs);
        
        //reserva que será usada de teste para exclusão
        u = usuariodao.busca("10236540"); //busca pelo aluno
        rc = recursodao.busca("102", pd1, tp); //busca pela sala
        System.out.println(rc.getId_Recurso());
        rs = new Reserva("13:00", "14:00", "2018-12-02", u, rc);
        reservadao.insere(rs);
    }

}
