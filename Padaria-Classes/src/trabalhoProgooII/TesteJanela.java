package trabalhoProgooII;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TesteJanela {

	private JFrame frmPadariaTrmBom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteJanela window = new TesteJanela();
					window.frmPadariaTrmBom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TesteJanela() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//AQUI TEMOS QUE INICIAR OS 5 FUNCIONÁRIOS E OS 20 PRODUTOS INICIAIS
		
		EstoqueVendas estoque = new EstoqueVendas();
		
		Vendedor v1 = new Vendedor("Rafael", "Rua Recife", 5642.50f, "25462", 23f, 154f);
		
		FornecedorRecorrente fornecedor = new FornecedorRecorrente("Rede Globo", "Av. Projac", "3458468745/42", 1f);
		
		String[] apelido = new String[] {"Colherzão", "Colherzinha", "Colherão", "Colherzim", "Colherzom"};
		
		frmPadariaTrmBom = new JFrame();
		frmPadariaTrmBom.setTitle("Padaria Tr\u00EAm Bom S\u00F4");
		frmPadariaTrmBom.setBounds(100, 100, 450, 300);
		frmPadariaTrmBom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPadariaTrmBom.getContentPane().setLayout(null);
		
		JButton btnEstoque = new JButton("Gest\u00E3o de Estoque");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean continuarPerguntas = true;
				
				int opProduto = JOptionPane.showConfirmDialog(null, "Deseja adicionar um produto?");
				if(opProduto == 0 && continuarPerguntas) {
					continuarPerguntas = false;
					String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
					String precoCompra = JOptionPane.showInputDialog("Digite o preço de compra: ");
					String precoVenda = JOptionPane.showInputDialog("Digite o preço de venda: ");
					String codigo = JOptionPane.showInputDialog("Digite o codigo do produto: ");
					String quantidadeEstoque = JOptionPane.showInputDialog("Digite a quantidade inicial do estoque: ");
					
					if(estoque.cadastrarProduto(nome, fornecedor, Float.parseFloat(precoCompra), Float.parseFloat(precoVenda), apelido, Integer.parseInt(codigo), Integer.parseInt(quantidadeEstoque)));
						JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
				}
				
				else if (opProduto == 2)
					continuarPerguntas = false;
				
				if (continuarPerguntas) {
					opProduto = JOptionPane.showConfirmDialog(null, "Deseja vender um produto");
					if(opProduto == 0) {
						String codigo = JOptionPane.showInputDialog("Qual o código do produto que você quer vender: ");
						estoque.venderProduto(Integer.parseInt(codigo), 11, 10, 2018, v1);
						continuarPerguntas = false;
					}
				}
				if (continuarPerguntas) {
					opProduto = JOptionPane.showConfirmDialog(null, "Deseja informações");
					if (opProduto == 0) {
						estoque.imprimeInformacoesProdutosVendidos();
					}
				}
				
			}
		});
		btnEstoque.setBounds(104, 11, 230, 23);
		frmPadariaTrmBom.getContentPane().add(btnEstoque);
		
		JButton btnInformacoes = new JButton("Gest\u00E3o de informa\u00E7\u00F5es");
		btnInformacoes.setBounds(104, 45, 230, 23);
		frmPadariaTrmBom.getContentPane().add(btnInformacoes);
		
		JButton btnImprimeInformaes = new JButton("Imprime informa\u00E7\u00F5es");
		btnImprimeInformaes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				estoque.imprimeInformacoesProdutosVendidos();
				
				
				
			}
		});
		btnImprimeInformaes.setBounds(104, 139, 203, 23);
		frmPadariaTrmBom.getContentPane().add(btnImprimeInformaes);
	}

}
