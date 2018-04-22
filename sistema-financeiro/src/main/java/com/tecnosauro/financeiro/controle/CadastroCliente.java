package com.tecnosauro.financeiro.controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.tecnosauro.financeiro.dao.PessoaFisicaDAO;
import com.tecnosauro.financeiro.modelo.Cidade;
import com.tecnosauro.financeiro.modelo.Contato;
import com.tecnosauro.financeiro.modelo.Endereco;
import com.tecnosauro.financeiro.modelo.Estado;
import com.tecnosauro.financeiro.modelo.PessoaFisica;
import com.tecnosauro.financeiro.modelo.TipoTelefone;

public class CadastroCliente {

	PessoaFisica pessoaFisica = new PessoaFisica();

	public void salvar() {

		Endereco endereco = new Endereco();

		Estado estado = new Estado();
		estado.setCodigo(1);
		estado.setNome("PARANA");

		Cidade cidade = new Cidade();
		cidade.setCodigo(1);
		cidade.setEstado(estado);
		//cidade.setNome("MANDAGUAÇU");

		endereco.setLogradouro("Rua Marcilio Perioto");
		endereco.setNumero("197");
		endereco.setBairro("Parque Ouro Verde");
		endereco.setComplemento("Proximo ao posto de saude");
		endereco.setCep("87.160.000");
		endereco.setCidade(cidade);
		//endereco.setEstado(estado);

		Contato contato = new Contato();
		contato.setPessoa(pessoaFisica);
		contato.setTipoTelefone(TipoTelefone.CELULAR);
		contato.setTelefone("44 99851-3831");
		contato.setEmail("thiagosilva.zip@gmail.com");
		contato.setSite("www.tecnosauro.com.br");
		ArrayList<Contato> contatos = new ArrayList<>();
		contatos.add(contato);

		pessoaFisica.setNome("THIAGO DA SILVA");
		pessoaFisica.setRg("13040823-0");
		pessoaFisica.setCpf("094.216.329-07");
		pessoaFisica.setTituloEleitor("00000000");
		pessoaFisica.setPis("000000");
		pessoaFisica.setCei("00000000");
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			pessoaFisica.setDataNascimento(df.parse("27/08/1992"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			pessoaFisica.setDataCadastro(df.parse("21/04/2018"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		pessoaFisica.setEndereco(endereco);
		pessoaFisica.setContatos(contatos);
		
		//PessoaFisicaDAO dao = new PessoaFisicaDAO();
		//dao.salvar(pessoaFisica);

	}

}
