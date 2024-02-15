package teste;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Só pra deixar claro, é uma loja sobre produtos agrícolas
		
		
		int resultado = 1;
		
		while(resultado != 8)
		{
			
			resultado = Integer.parseInt(JOptionPane.showInputDialog("Digite "
				+ "\n1 - Pessoa Física\n2 - Pessoa Jurídica"
				+ "\n3 - Cadastrar Usuário\n4 - Endereço "
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
						JOptionPane.showInputDialog("Digite seu gênero: "),
						JOptionPane.showInputDialog("Digite sua data de nascimento: "));
				
				System.out.println("\nSeu nome é: " + fisica.getNome() + 
						"\nSeu e-mail é: " + fisica.getEmail() + 
						"\nSeu telefone é: " + fisica.getTelefone() + 
						"\nSeu CPF é: " + fisica.getCpf() + 
						"\nSeu RG é: " + fisica.getRg() + 
						"\nSeu gênero é: " + fisica.getGenero() +
						"\nSua data de nascimento é: " + fisica.getDataNasc());
				
			} else if (resultado == 2) {
				//Instancia Pessoa Juridica
				Juridica juridica;
				juridica = new Juridica(
						JOptionPane.showInputDialog("Digite seu nome: "),
						JOptionPane.showInputDialog("Digite seu e-mail: "),
						JOptionPane.showInputDialog("Digite seu telefone: "),
						JOptionPane.showInputDialog("Digite seu CNPJ: "),
						JOptionPane.showInputDialog("Digite a data de fundação da empresa: "),
						JOptionPane.showInputDialog("Digite o tipo da empresa: "));
				
				System.out.println("\nSeu nome é: " + juridica.getNome() +
						"\nSeu e-mail é: " + juridica.getEmail() +
						"\nSeu telefone é: " + juridica.getTelefone() +
						"\nSeu CNPJ é: " + juridica.getCnpj() +
						"\nA data de fundação da empresa é: " + juridica.getDataFundacao() +
						"\nO tipo da empresa é: " + juridica.getTipoEmpresa());	
				
			} else if (resultado == 3) {
				//instancia Usuario
				Usuario usuario;
				usuario = new Usuario(
						JOptionPane.showInputDialog("Digite seu nome: "),
						JOptionPane.showInputDialog("Digite seu e-mail: "),
						JOptionPane.showInputDialog("Digite seu telefone: "),
						JOptionPane.showInputDialog("Digite seu login: "),
						JOptionPane.showInputDialog("Digite sua senha: "));
				
				System.out.println("\nSeu nome é: " + usuario.getNome() + 
						"\nSeu e-mail é: " + usuario.getEmail() + 
						"\nSeu telefone é: " + usuario.getTelefone() + 
						"\nSeu login é: " + usuario.getLoginUser() + 
						"\nSua senha é: " + usuario.getSenhaUser());
				
			} else if (resultado == 4) {
				//instancia Endereco
				Endereco endereco;
				endereco = new Endereco(
				JOptionPane.showInputDialog("Digite seu Logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o Número: ")),
				JOptionPane.showInputDialog("Digite o Complemento: "),
				JOptionPane.showInputDialog("Digite seu Bairro: "),
				JOptionPane.showInputDialog("Digite sua Cidade: "),
				JOptionPane.showInputDialog("Digite seu estado: "),
				JOptionPane.showInputDialog("Digite seu CEP: "));
				
				System.out.println("\nSeu logradouro é: " + endereco.getLogradouro() + 
						"\nO numero é: " + endereco.getNumero() + 
						"\nO complemento é: " + endereco.getComplemento() + 
						"\nSeu bairro é: " + endereco.getBairro() + 
						"\nSua cidade é: " + endereco.getCidade() +
						"\nSeu estado é: " + endereco.getEstado() +
						"\nSeu CEP é: " + endereco.getCep());
				
			} else if (resultado == 5) {
				//instncia Loja
				Loja loja;
				loja = new Loja(
				Integer.parseInt(JOptionPane.showInputDialog("Digite código da loja: ")),
				JOptionPane.showInputDialog("Digite o nome da loja: "));
				
				System.out.println("\nO código da Loja é: " + loja.getCodLoja() + 
						"\nO nome da Loja é: " + loja.getNomeLoja());
				
			} else if (resultado == 6) {
				//instancia Produto
				Produto produto;
				produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: ")),
				JOptionPane.showInputDialog("Digite o nome do produto: "));
				
				System.out.println("\nO código do produto é: " + produto.getCodProduto() + 
						"\nO nome do produto é: " + produto.getNomeProduto());
				
				} else if (resultado == 7) {
					//instancia Carrinho
					Carrinho carrinho;
					carrinho = new Carrinho(
					Integer.parseInt(JOptionPane.showInputDialog("Digite o código do carrinho: ")),
					Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: ")));
					
					System.out.println("\nO código do carrinho é: " + carrinho.getCodCarrinho() + 
							"\nA quantidade é: " + carrinho.getQuantidade());
					
					} 
			}
		
		System.out.println("\nPrograma Finalizado! :)");
		}
	}	
