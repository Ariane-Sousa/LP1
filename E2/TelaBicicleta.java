package bicicleta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.awt.event.ActionEvent;

public class TelaBicicleta extends JFrame {

	private JPanel contentPane;
	private JTextField tfCor;
	private JTextField tfAro;
	private JTextField tfAcessorio;
	private JTextField tfMarca;
	private JTextField tfModelo;
	HashSet<String> Bicicleta;
	ArrayList <Bicicleta> x;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBicicleta frame = new TelaBicicleta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaBicicleta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		x = new ArrayList<>();
		Bicicleta = new HashSet<String>();
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBackground(Color.WHITE);
		contentPane.add(jPanel1, BorderLayout.CENTER);
		
		JLabel Cor = new JLabel();
		Cor.setText("Cor");
		Cor.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfCor = new JTextField();
		tfCor.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel Cor1 = new JLabel();
		Cor1.setText("Aro");
		Cor1.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfAro = new JTextField();
		tfAro.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel modelo = new JLabel();
		modelo.setText("Acessorio");
		modelo.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfAcessorio = new JTextField();
		tfAcessorio.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel Marca = new JLabel();
		Marca.setText("Marca");
		Marca.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfMarca = new JTextField();
		tfMarca.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel modelo1 = new JLabel();
		modelo1.setText("Modelo");
		modelo1.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfModelo = new JTextField();
		tfModelo.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton Cadastrar1 = new JButton();
		Cadastrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bicicleta c1 = new Bicicleta();
	            c1.setModelo(tfModelo.getText());
	            c1.setAcessorio(tfAcessorio.getText());
	            c1.setMarca(tfMarca.getText());
	            c1.setCor(tfCor.getText());
	            c1.setAro(tfAro.getText());
	            x.add(c1);
	            
	            for(Bicicleta item: x) {
	            	System.out.println("Lista");
	    			System.out.printf("%s\n", item.toString());
	    		}
	       
	            try{
	            		
	               FileWriter fw = new FileWriter("C:\\Users\\Ariane Sousa\\Documents\\NetBeansProjects\\Bicicleta\\src\\bicicleta\\nomes.csv", true);
	               BufferedWriter bw = new BufferedWriter(fw);
	               PrintWriter out = new PrintWriter(bw);
				   StringBuilder sb = new StringBuilder();
				   
				   sb.append(tfModelo.getText() + ";");
				   sb.append(tfAcessorio.getText() + ";");
				   sb.append(tfMarca.getText() + ";");
				   sb.append(tfCor.getText() + ";");
				   sb.append(tfAro.getText() + ";");
				   bw.write(sb.toString() + "\n");
				   bw.close();
	            
	        } catch (Exception e1){
	            System.out.println("Erro !");
	        }
	           
			}
		});
		Cadastrar1.setText("Cadastrar");
		Cadastrar1.setFont(new Font("Arial", Font.BOLD, 14));
		Cadastrar1.setBackground(new Color(204, 204, 255));
		
		JButton Cadastrar = new JButton();
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		Cadastrar.setText("Sair");
		Cadastrar.setFont(new Font("Arial", Font.BOLD, 14));
		Cadastrar.setBackground(new Color(204, 204, 255));
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("Bicicleta");
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setFont(new Font("Arial", Font.BOLD, 24));
		
		JButton Dicionario = new JButton();
		Dicionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ariane Sousa\\Documents\\NetBeansProjects\\Bicicleta\\src\\bicicleta\\nomes.csv"))){
					String line = br.readLine();
					Map<String, String> map = new HashMap<>();
					while (line != null) {
						String [] fields = line.split(";");
						
						String modeloc = "Modelo: ";
						String modelo = fields[0];
						String acessorioc = "Acessorio: ";
						String acessorio = fields[1];
						String marcac = "Marca: ";
						String marca = fields[2];
						String corc = "Cor: ";
						String cor = fields[3];
						String aroc = "Aro: ";
						String aro = fields[4];
						
						map.put(modeloc, modelo);
						map.put(acessorioc, acessorio);
						map.put(marcac, marca);
						map.put(corc, cor);
						map.put(aroc, aro);
						
						line = br.readLine();
						
					}
					System.out.println("Dicionario");
					for (String key: map.keySet()) {
						
						System.out.println(key + map.get(key));
						JOptionPane.showMessageDialog(null, key + map.get(key));
						
					}
				} catch (Exception e2) {
					System.out.println("Error: " + e2.getMessage());
					// TODO: handle exception
				}
				
			}
		});
		Dicionario.setText("Dicionário");
		Dicionario.setFont(new Font("Arial", Font.BOLD, 14));
		Dicionario.setBackground(new Color(204, 204, 255));
		GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
		gl_jPanel1.setHorizontalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(Cadastrar1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Dicionario, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Cadastrar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_jPanel1.createSequentialGroup()
									.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(Marca)
										.addComponent(modelo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Cor))
									.addGap(18))
								.addGroup(gl_jPanel1.createSequentialGroup()
									.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
										.addComponent(modelo1, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
										.addComponent(Cor1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
								.addComponent(tfAro, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCor, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfModelo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfMarca, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfAcessorio, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(145, Short.MAX_VALUE))))
				.addComponent(jLabel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addGap(10)
					.addComponent(jLabel2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(modelo1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(modelo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfAcessorio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Marca, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Cor, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfAro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Cor1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(Cadastrar1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(Dicionario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(Cadastrar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		jPanel1.setLayout(gl_jPanel1);
	}
}
