package teste;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//S� pra deixar claro, � uma loja sobre produtos agr�colas
		
		
		int resultado = 1;
		
		while(resultado != 8)
		{
			
			resultado = Integer.parseInt(JOptionPane.showInputDialog("Digite "
				+ "\n1 - Pessoa F�sica\n2 - Pessoa Jur�dica"
				+ "\n3 - Cadastrar Usu�rio\n4 - Endere�o "
				+ "\n5 - Loja\n6 - Produto\n7 - Carrinho\n8 - Finalizar"));
		
			if (resultado == 1) {
				//Instancia Pessoa Fisica
				Fisica fisica;
				fisica = new Fisica(
						JOptionPane.showInputDialog("Digite seu nome: "),
						JOptionPane.showInputDialog("Digite seu e-mail: "),
						JOptionPane.showInputDialog("Digite seu telefone: "),
						JOptionPane.showInputDialog("Digite seu CPF: "),
						JOptionPane.showInputDialog("Digite seu RG: "),
						JOptionPane.showInputDialog("Digite seu g�nero: "),
						JOptionPane.showInputDialog("Digite sua data de nascimento: "));
				
				System.out.println("\nSeu nome �: " + fisica.getNome() + 
						"\nSeu e-mail �: " + fisica.getEmail() + 
						"\nSeu telefone �: " + fisica.getTelefone() + 
						"\nSeu CPF �: " + fisica.getCpf() + 
						"\nSeu RG �: " + fisica.getRg() + 
						"\nSeu g�nero �: " + fisica.getGenero() +
						"\nSua data de nascimento �: " + fisica.getDataNasc());
				
			} else if (resultado == 2) {
				//Instancia Pessoa Juridica
				Juridica juridica;
				juridica = new Juridica(
						JOptionPane.showInputDialog("Digite seu nome: "),
						JOptionPane.showInputDialog("Digite seu e-mail: "),
						JOptionPane.showInputDialog("Digite seu telefone: "),
						JOptionPane.showInputDialog("Digite seu CNPJ: "),
						JOptionPane.showInputDialog("Digite a data de funda��o da empresa: "),
						JOptionPane.showInputDialog("Digite o tipo da empresa: "));
				
				System.out.println("\nSeu nome �: " + juridica.getNome() +
						"\nSeu e-mail �: " + juridica.getEmail() +
						"\nSeu telefone �: " + juridica.getTelefone() +
						"\nSeu CNPJ �: " + juridica.getCnpj() +
						"\nA data de funda��o da empresa �: " + juridica.getDataFundacao() +
						"\nO tipo da empresa �: " + juridica.getTipoEmpresa());	
				
			} else if (resultado == 3) {
				//instancia Usuario
				Usuario usuario;
				usuario = new Usuario(
						JOptionPane.showInputDialog("Digite seu nome: "),
						JOptionPane.showInputDialog("Digite seu e-mail: "),
						JOptionPane.showInputDialog("Digite seu telefone: "),
						JOptionPane.showInputDialog("Digite seu login: "),
						JOptionPane.showInputDialog("Digite sua senha: "));
				
				System.out.println("\nSeu nome �: " + usuario.getNome() + 
						"\nSeu e-mail �: " + usuario.getEmail() + 
						"\nSeu telefone �: " + usuario.getTelefone() + 
						"\nSeu login �: " + usuario.getLoginUser() + 
						"\nSua senha �: " + usuario.getSenhaUser());
				
			} else if (resultado == 4) {
				//instancia Endereco
				Endereco endereco;
				endereco = new Endereco(
				JOptionPane.showInputDialog("Digite seu Logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o N�mero: ")),
				JOptionPane.showInputDialog("Digite o Complemento: "),
				JOptionPane.showInputDialog("Digite seu Bairro: "),
				JOptionPane.showInputDialog("Digite sua Cidade: "),
				JOptionPane.showInputDialog("Digite seu estado: "),
				JOptionPane.showInputDialog("Digite seu CEP: "));
				
				System.out.println("\nSeu logradouro �: " + endereco.getLogradouro() + 
						"\nO numero �: " + endereco.getNumero() + 
						"\nO complemento �: " + endereco.getComplemento() + 
						"\nSeu bairro �: " + endereco.getBairro() + 
						"\nSua cidade �: " + endereco.getCidade() +
						"\nSeu estado �: " + endereco.getEstado() +
						"\nSeu CEP �: " + endereco.getCep());
				
			} else if (resultado == 5) {
				//instncia Loja
				Loja loja;
				loja = new Loja(
				Integer.parseInt(JOptionPane.showInputDialog("Digite c�digo da loja: ")),
				JOptionPane.showInputDialog("Digite o nome da loja: "));
				
				System.out.println("\nO c�digo da Loja �: " + loja.getCodLoja() + 
						"\nO nome da Loja �: " + loja.getNomeLoja());
				
			} else if (resultado == 6) {
				//instancia Produto
				Produto produto;
				produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto: ")),
				JOptionPane.showInputDialog("Digite o nome do produto: "));
				
				System.out.println("\nO c�digo do produto �: " + produto.getCodProduto() + 
						"\nO nome do produto �: " + produto.getNomeProduto());
				
				} else if (resultado == 7) {
					//instancia Carrinho
					Carrinho carrinho;
					carrinho = new Carrinho(
					Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do carrinho: ")),
					Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: ")));
					
					System.out.println("\nO c�digo do carrinho �: " + carrinho.getCodCarrinho() + 
							"\nA quantidade �: " + carrinho.getQuantidade());
					
					} 
			}
		
		System.out.println("\nPrograma Finalizado! :)");
		}
	}	
