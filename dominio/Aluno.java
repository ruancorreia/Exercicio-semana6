package dominio;

public class Aluno {

		private int matricula;
		private String nome;
		
		public Aluno(int matricula, String aluno) {
			super();
			this.matricula = matricula;
			this.nome = aluno;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String aluno) {
			this.nome = aluno;
		}
		
		public String toString(){
			return this.matricula + ": " + this.getNome();
		}
}
