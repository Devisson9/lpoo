 
public class Turma {
    private String nomeTurma;
     private List <Alunos>  Alunos = new ArrayList<Alunos> ();
     
     public String getNomeTurma (){
         return nomeTurma;
      }
     public void setNomeTurma (String nomeTurma){
         this.nomeTurma = nomeTurma;
     }
public void addAlunos(Alunos x) {
    Alunos.add(x);
}
}


 