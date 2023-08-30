package javapooclass;
import javax.swing.JOptionPane;

public class Exercício01 {
public static class Aluno {
private String Nome;
private String RA;
private float AC1;
private float AC2;
private float AG;
private float AF;

    public Aluno(String Nome, String RA, float AC1, float AC2, float AG, float AF) {
        this.Nome = Nome;
        this.RA = RA;
        this.AC1 = AC1;
        this.AC2 = AC2;
        this.AG = AG;
        this.AF = AF;
    }

    public String getNome() {
        return Nome;
    }

    public String getRA() {
        return RA;
    }

    public float getAC1() {
        return AC1;
    }

    public float getAC2() {
        return AC2;
    }

    public float getAG() {
        return AG;
    }

    public float getAF() {
        return AF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }

    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }

    public void setAF(float AF) {
        this.AF = AF;
    }
    public float calcularMedia() {
        return (AC1 * 0.15f) + (AC2 * 0.30f) + (AG * 0.10f) + (calcularAF() * 0.45f);
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7.0f) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    private float calcularAF() {
        return AF;
    }


    public String imprimir() {
        return "RA: " + RA +
               "\\nNome: " + Nome +
               "\\nAC1: " + AC1 +
               "\\nAC2: " + AC2 +
               "\\nAG: " + AG +
               "\\nAF: " + AF +
               "\\nMédia: " + calcularMedia() +
               "\\nSituação: " + verificarAprovacao();
    }
}

 public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String ra = JOptionPane.showInputDialog("Digite o RA do aluno:");
        float ac1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AC1:"));
        float ac2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AC2:"));
        float ag = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AG:"));

        Aluno aluno = new Aluno(nome, ra, ac1, ac2, ag, 0.0f);

        JOptionPane.showMessageDialog(null, aluno.imprimir(), "Dados do Aluno", JOptionPane.INFORMATION_MESSAGE);
    }

}
