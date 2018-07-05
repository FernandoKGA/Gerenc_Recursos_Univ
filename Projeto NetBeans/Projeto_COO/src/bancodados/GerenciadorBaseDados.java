package bancodados;
import java.util.LinkedList;
import java.util.List;

import objetos.*;

public interface GerenciadorBaseDados {

	//public void insereUsuario(Usuario usuario) throws Banco_de_DadosException; //Modificado

	public void insereRecurso(Recurso recurso) throws Banco_de_DadosException; //Modificado

	//public void insereReserva(Reserva reserva) throws Banco_de_DadosException; //Modificado
        
        //public void insereLaboratorio(Laboratorio l) throws Banco_de_DadosException;

	//public Usuario buscaUsuario(String numeroUSP) throws Banco_de_DadosException;  //Modificado
        
        public Recurso buscaRecurso(String nome, String predio, String tipo) throws Banco_de_DadosException;
        
        public Recurso buscaRecursoID(int idRecurso) throws Banco_de_DadosException;

	//public Reserva buscaReserva() throws Banco_de_DadosException; //Modificado
        
        //public List<Reserva> buscaReservasDiaRec(String data_ftf,
              //  Recurso rec) throws Banco_de_DadosException; //Modificado
        
        public void excluirRecurso(Recurso r) throws Banco_de_DadosException;
        
        //public void excluirReserva(Reserva r) throws Banco_de_DadosException;

	//public List<Usuario> listaUsuarios() throws Banco_de_DadosException; //Modificado

	public List<Recurso> listaRecursos() throws Banco_de_DadosException; //Modificado
        
        public List<Recurso> listaRecursos(String predio, String tipo) throws Banco_de_DadosException; //Modificado

	//public List<Reserva> listaReservas() throws Banco_de_DadosException; //Modificado

	//public List<Reserva> listaReservasDoUsuario(String numeroUSP) throws Banco_de_DadosException; //Modificado
        
       //public List<Reserva> listaReservasMensaisDoUsuario(String numeroUSP,
        //        String data_ftf) throws Banco_de_DadosException;

       // public void atualizaReservas() throws Banco_de_DadosException;
        
        //public boolean verificaQuantCoordenador(String curso) throws Banco_de_DadosException;
}
