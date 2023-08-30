package javapooclass;
import javax.swing.JOptionPane;
public class Exercício2 {
public class Pessoa {
private String Nome;
private String CPF;
private char sexo;
private int idade;

public Pessoa(String Nome, String CPF, char sexo, int idade) {
this.Nome = Nome;
this.CPF = CPF;
this.sexo = sexo;
this.idade = idade;
}

    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public static void main(String[] args) {
Pessoa pessoa = null;   

    while (true) {
        String[] options = { "Criar Pessoa", "Ver Pessoa", "Sair" };
        int choice = JOptionPane.showOptionDialog(
            null,
            "Escolha uma opção:",
            "Menu",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            options,
            options[0]
        );

        if (choice == 0) {
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            String cpf = JOptionPane.showInputDialog("Digite o CPF:");
            char sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):").charAt(0);
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));


            JOptionPane.showMessageDialog(null, "Pessoa criada com sucesso!");

        } else if (choice == 1) {
            if (pessoa != null) {
                String pessoaInfo = "Nome: " + pessoa.getNome() + "\\nCPF: " + pessoa.getCPF()
                        + "\\nSexo: " + pessoa.getSexo() + "\\nIdade: " + pessoa.getIdade();
                JOptionPane.showMessageDialog(null, pessoaInfo, "Detalhes da Pessoa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma pessoa criada ainda.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Saindo do programa.", "Fim", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }
}

}