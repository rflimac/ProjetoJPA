package controller;

import java.util.List;

import dao.ContaDAO;
import dao.impl.ContaDAOImpl;
import model.Conta;

public class Principal {
	public static void main(String[] args) {
	
		// teste de conexao
		//Conexao conexao = new Conexao();
		//Connection conn = conexao.getConnection();
		
		//Conta conta =new Conta();
		//conta.setNumero(1005);
		//conta.setSaldo(450);
		//conta.setLimite(300);
		
		ContaDAO contaDAO = new ContaDAOImpl();
		
		Conta conta =new Conta();
		conta.setNumero(1007);
		conta.setSaldo(450);
		conta.setLimite(300);
		contaDAO.salvar(conta);
		
		Conta contaAlterar =new Conta();
		conta.setNumero(1007);
		conta.setSaldo(458);
		conta.setLimite(350);
		contaDAO.alterar(contaAlterar);
		
		//contaDao.salvar(conta);
		contaDAO.remover(1001);
		
		Conta conta1 =contaDAO.pesquisar(1007);
		System.out.println(conta1.toString());
		
		List<Conta> listaConta = contaDAO.listarTodos();
		for (Conta p : listaConta) {
		System.out.println(p.toString());
	//	}
		
		
		
		
		}
	}
}

	
	

