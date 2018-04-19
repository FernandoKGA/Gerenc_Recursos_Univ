package Banco_de_Dados;
import java.util.LinkedList;
import java.util.List;

import objetos.*;

public interface GerenciadorBaseDados {

	public void insereUsuario(Usuario usuario) throws Banco_de_DadosException; //Modificado

	public void insereRecurso(Recurso recurso) throws Banco_de_DadosException; //Modificado

	public void insereReserva(Reserva reserva) throws Banco_de_DadosException; //Modificado

	public void insereLivro(Livro livro) throws Banco_de_DadosException;

	public void insereCD(CD cd) throws Banco_de_DadosException;

	public void insereEmprestimo(Emprestimo emprestimo) throws Banco_de_DadosException;

	public void alteraEmprestimo(Emprestimo emprestimoAlterado) throws Banco_de_DadosException;

	public CD buscaCD(int codigo) throws Banco_de_DadosException;

	public Livro buscaLivro(int codigo) throws Banco_de_DadosException;

	public Usuario buscaUsuario(int numeroUSP) throws Banco_de_DadosException;  //Modificado

	public Recurso buscaRecurso() throws Banco_de_DadosException; //Modificado

	public Reserva buscaReserva() throws Banco_de_DadosException; //Modificado

	public Emprestimo buscaEmprestimo(int codigoEmprestimo) throws Banco_de_DadosException;

	public List<Usuario> listaUsuarios() throws Banco_de_DadosException; //Modificado

	public List<Recurso> listaRecursos() throws Banco_de_DadosException; //Modificado

	public List<Reserva> listaReservas() throws Banco_de_DadosException; //Modificado

	public List<Reserva> listaReservasDoUsuario(int numeroUSP) throws Banco_de_DadosException; //Modificado

	public List<Livro> listaLivros() throws Banco_de_DadosException;

	public List<CD> listaCD() throws Banco_de_DadosException;
	
	public LinkedList<Emprestimo> listaEmprestimosEmAbertoDoUsuario(
			Usuario usuario) throws Banco_de_DadosException;

}
