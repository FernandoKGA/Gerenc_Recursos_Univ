package bancodados;
import java.util.LinkedList;
import java.util.List;

import objetos.*;

public interface GerenciadorBaseDados {

	public void insereUsuario(Usuario usuario) throws Banco_de_DadosException; //Modificado

	public void insereRecurso(Recurso recurso) throws Banco_de_DadosException; //Modificado

	public void insereReserva(Reserva reserva) throws Banco_de_DadosException; //Modificado

	public Usuario buscaUsuario(String numeroUSP) throws Banco_de_DadosException;  //Modificado

	public Reserva buscaReserva() throws Banco_de_DadosException; //Modificado

	public List<Usuario> listaUsuarios() throws Banco_de_DadosException; //Modificado

	public List<Recurso> listaRecursos() throws Banco_de_DadosException; //Modificado
        
        public List<Recurso> listaRecursos(String predio, String tipo) throws Banco_de_DadosException; //Modificado

	public List<Reserva> listaReservas() throws Banco_de_DadosException; //Modificado

	public List<Reserva> listaReservasDoUsuario(String numeroUSP) throws Banco_de_DadosException; //Modificado


}
