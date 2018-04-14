package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC03CadastrarUsuario {
	public static Usuario usuario;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}
	

	@Test(expected=RuntimeException.class)
	public void CT01UC03CadasUsuario_ra_invalido (){
		usuario.setRa("");
	}
	
	@Test(expected=RuntimeException.class)
	public void CT02UC03CadasUsuario_ra_nulo (){
		usuario.setRa(null);
	}
	
	@Test
	public void CT03UC03CadastrarUsuario_validar_equals (){
		Usuario resultadoEsperado = new Usuario();
		resultadoEsperado.setRa("11111");
		resultadoEsperado.setNome("Jose da Silva");
		assertTrue(resultadoEsperado.equals(usuario));
	}
	
	@Test(expected=RuntimeException.class)
	public void CT04UC03CadasUsuario_nome_invalido (){
		usuario.setNome("");
	}
	
	@Test(expected=RuntimeException.class)
	public void CT05UC03CadasUsuario_nome_nulo (){
		usuario.setNome(null);
	}
	
}
