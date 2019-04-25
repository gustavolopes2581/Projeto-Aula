package view;

import javax.swing.JOptionPane;

import model.Aluno;

public class vizualizar {

	public static void main(String[] args) {
		Aluno obj = new Aluno();
		obj.setNome(JOptionPane.showInputDialog("Digite seu nome"));
		obj.setEndereco(JOptionPane.showInputDialog("Digite seu endereço"));
		obj.setBairro(JOptionPane.showInputDialog("Digite seu bairro"));
		obj.setCep(Long.parseLong(JOptionPane.showInputDialog("Digite seu CEP")));
		obj.setCidade(JOptionPane.showInputDialog("Digite sua cidade"));
		obj.setEstado(JOptionPane.showInputDialog("Digite seu estado"));
		
		System.out.println("Seu nome: "+obj.getNome());
		System.out.println("Seu endereço: "+obj.getEndereco());
		System.out.println("Seu bairro: "+obj.getBairro());
		System.out.println("Seu cep: "+obj.getCep());
		System.out.println("Sua cidade: "+obj.getCidade());
		System.out.println("Seu estado: "+obj.getEstado());
	}

}
