package com.tecnosauro.financeiro.aplicacao;

import com.tecnosauro.financeiro.controle.CadastroCliente;
import com.tecnosauro.financeiro.dao.PessoaFisicaDAO;
import com.tecnosauro.financeiro.modelo.PessoaFisica;

public class MainApp {

	public static void main(String[] args) throws Exception {
		CadastroCliente c = new CadastroCliente();
		c.salvar();
		
		//PessoaFisicaDAO p = new PessoaFisicaDAO();
		//PessoaFisica pp = p.buscarPeloCodigo(1);
		
		
		//pp.getContatos().get(0).setEmail("teste5");
		
		//p.atualizar(pp);
		
		//pp = p.buscarPeloCodigo(1);
		//String i = pp.getContatos().get(0).getEmail();


		
		//System.out.println(i);
		
		//p.excluir(pp);
	}

}
