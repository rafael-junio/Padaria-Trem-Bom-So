package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controle.Padaria;
import controle.produto.Produto;
import pessoa.funcionario.Padeiro;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;

public class TelaPrincipal{
	

	private JFrame frmPadariaTremBo;
	private static Padaria padaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal(padaria);
					window.frmPadariaTremBo.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	@SuppressWarnings("static-access")
	public TelaPrincipal(Padaria padaria) {
		initialize();
		this.padaria = padaria;
	}

	/**
	 * Initialize the contents of the frame.
	 * @param <funcionarios>
	 */
	private <funcionarios> void initialize() {
		
		frmPadariaTremBo = new JFrame();
		frmPadariaTremBo.setTitle("Padaria Trem B\u00E3o S\u00F4");
		frmPadariaTremBo.setBounds(100, 100, 450, 300);
		frmPadariaTremBo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPadariaTremBo.getContentPane().setLayout(null);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		btnCadastrarProduto.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastraProduto p = new TelaCadastraProduto(padaria);
				p.main(null);
				
			}
		});
		btnCadastrarProduto.setBounds(10, 11, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarProduto);
		
		JButton btnVenderProduto = new JButton("Vender produto");
		btnVenderProduto.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				padaria.removeProdutosVenda();
				TelaVendeProduto p = new TelaVendeProduto(padaria);
				p.main(null);
			}
		});
		btnVenderProduto.setBounds(227, 11, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnVenderProduto);
		
		JButton btnImprimirInformaes = new JButton("Verifique aqui as informa\u00E7\u00F5es que queira mostrar");
		btnImprimirInformaes.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				TelaImprimeInformacoes p = new TelaImprimeInformacoes(padaria);
				p.main(null);
			}
		});
		btnImprimirInformaes.setBounds(25, 216, 383, 34);
		frmPadariaTremBo.getContentPane().add(btnImprimirInformaes);
		
		JButton btnNewButton = new JButton("Cadastrar cliente");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				
				TelaCadastraCliente p = new TelaCadastraCliente(padaria);
				p.main(null);
				
			}
		});
		btnNewButton.setBounds(10, 45, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnNewButton);
		
		JButton btnCadastrarFornecedor = new JButton("Cadastrar Fornecedor");
		btnCadastrarFornecedor.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				TelaCadastraFornecedor p = new TelaCadastraFornecedor(padaria);
				p.main(null);
			}
		});
		btnCadastrarFornecedor.setBounds(10, 79, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarFornecedor);
		
		JButton btnCadastrarFuncionrio = new JButton("Cadastrar Funcion\u00E1rio");
		btnCadastrarFuncionrio.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				TelaCadastraFuncionario p = new TelaCadastraFuncionario(padaria);
				p.main(null);
				
			}
		});
		btnCadastrarFuncionrio.setBounds(10, 113, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarFuncionrio);
		
		JButton btnRemoverCliente = new JButton("Remover cliente");
		btnRemoverCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente que deseja remover do sistema. (Não use caracteres especiais)");
				if(cpf == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if(padaria.descadastrarCliente(cpf)){
					JOptionPane.showMessageDialog(null, "Cliente descadastrado com suecsso");
				}
				else {
					JOptionPane.showMessageDialog(null, "CPF não encontrado no sistema");
				}
			}
		});
		btnRemoverCliente.setBounds(227, 45, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverCliente);
		
		JButton btnRemoverFornecedor = new JButton("Remover Fornecedor");
		btnRemoverFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = JOptionPane.showInputDialog("Digite o código do fornecedor que deseja remover do sistema.");
				if(codigo == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if(padaria.descadastrarFornecedor(codigo)) {
					JOptionPane.showMessageDialog(null, "Fornecedor descadastrado com suecsso");
				}
				else
					JOptionPane.showMessageDialog(null, "Código não encontrado no sistema");
			}
		});
		btnRemoverFornecedor.setBounds(227, 79, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverFornecedor);
		
		JButton btnRemoverFuncionrio = new JButton("Remover funcion\u00E1rio");
		btnRemoverFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = JOptionPane.showInputDialog("Digite o código do funcionário que deseja remover do sistema.");
				if(codigo == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if(padaria.descadastrarFuncionario(codigo)){
					JOptionPane.showMessageDialog(null, "Funcionario descadastrado com suecsso");
				}
				else {
					JOptionPane.showMessageDialog(null, "Código não encontrado no sistema");
				}
			}
		});
		btnRemoverFuncionrio.setBounds(227, 113, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverFuncionrio);
		
		JButton btnHoraExtraPadeiro = new JButton("Adicional noturno (Padeiros)");
		btnHoraExtraPadeiro.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnHoraExtraPadeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String codigo = "";
				try {
					codigo = JOptionPane.showInputDialog("Digite o código do padeiro (4 dígitos)");
					try {
						if(padaria.encontraFuncionario(codigo) != null) {
							String horasTrabalhadas = JOptionPane.showInputDialog("Digite quantas horas extras o padeiro trabalhou");
							Padeiro padeiro = (Padeiro) padaria.encontraFuncionario(codigo);
							if(padeiro.informaHoraNoturnaPadeiro(Integer.parseInt(horasTrabalhadas))) {
								padeiro.calcularSalarioFinal();
								JOptionPane.showMessageDialog(null, "Adicional noturno do mês cadastrado com sucesso");
							}
							else
								JOptionPane.showMessageDialog(null, "Valor inválido!");
						}
						else
							JOptionPane.showMessageDialog(null, "Código do padeiro inválido!");
					}
					catch (Exception exception) {
						JOptionPane.showMessageDialog(null, "Digite um número de horas válido!");
					}
					
				}
				catch (Exception NullPointerException) {
					JOptionPane.showMessageDialog(null, "Número de horas inválido");
				}		
			}
		});
		btnHoraExtraPadeiro.setBounds(10, 147, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnHoraExtraPadeiro);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 140, 414, 2);
		frmPadariaTremBo.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 210, 414, 2);
		frmPadariaTremBo.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("Abastecer estoque");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String codigoProduto = JOptionPane.showInputDialog(null, "Insira o código do produto (6 digítos)");
					if(padaria.getEstoque().produdoEmEstoque(codigoProduto)) {
						try {	
							Produto produto = padaria.getEstoque().procurarProduto(codigoProduto);
							
							int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas unidades serão adicionadas ao estoque?. Estoque atual: " 
									+ padaria.getEstoque().procurarProduto(codigoProduto).getQuantidade() + " unidades"));
							if(produto.verificaQuantidadeProduto(quantidade)) {
								JOptionPane.showMessageDialog(null, "Estoque reabastecido!");
							}
							else
								JOptionPane.showMessageDialog(null, "Não foi possível reabastercer o estoque pois a quantidade inserida ultrapassa o limite de 30 unidades por produto.");
						}
						catch (Exception exception) {
							JOptionPane.showMessageDialog(null, "Insira uma quantidade valida!");
						}
					}
					else
						JOptionPane.showMessageDialog(null, "Código do produto inválido");
				}
				catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Código inválido");
				}
				
			}
		});
		btnNewButton_1.setBounds(227, 147, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Calcular imposto");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "O imposto deve ser calculado SOMENTE no final do mês e o adicional noturno do padeiro deve estar cadastrado caso ele seja diferente de 0.");
				int estado = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja calcular os impostos devidos?", null, 0);
				
				if(estado == 0) {
					JOptionPane.showMessageDialog(null, "Imposto calculado com sucesso!");
					padaria.calcularImpostos();
				}
				else
					JOptionPane.showMessageDialog(null, "Aguarde o final do mês e/ou faça o adicional noturno do padeiro");
				
			}
		});
		btnNewButton_2.setBounds(10, 182, 414, 23);
		frmPadariaTremBo.getContentPane().add(btnNewButton_2);
	}
}
