public class LivroDeNotas {

    private String disciplina;

    public void setDisciplina(String d) {
        if (d.length() >= 3) {
            disciplina = d;
        }
    }

    public void exibirMensagem() {
        System.out.println("Bem vindo ao livro de " + disciplina);
    }

}
