public class LivroDeNotas {

    private String disciplina;

    public void setDisciplina(String disciplina) {
        if (disciplina.length() >= 3) {
            this.disciplina = disciplina;
        }
    }

    public String getDisciplina {
        return disciplina;
       
    }



    public void exibirMensagem() {
        System.out.println("Bem vindo ao livro de " + disciplina);
    }



    //isso é um contrutor 
    //não existe a expressão "metodo construtor "
    public LivroDeNotas (String disciplina) {
        //System.out.println("Criando mais um");
        this.setDisciplina(disciplina);
    }

}




































//nico nico nii