 
public class Escola {
    String nome;
    List <Turma> turma = new ArrayList<Turma> ();
    public String getNome (){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void exibirTurma (){
        System.out.println("Turma: " +this.getNome());
}

}
