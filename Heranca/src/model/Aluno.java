package model;

public class Aluno extends Usuario {
	private String matricula;
	private String curso;
	public Aluno (String pCPF, String pMatricula) {
		super (pCPF);
		this.matricula = pMatricula;
		
	}

	public String getMatricula() {
	return this.matricula;
	}

	public void setCurso(String pCurso) {
		this.curso = pCurso;
	}

		public String getCurso() {
		return this.curso;
	}
		public String dadosFormatados() {
			String dadosUsuario = super.dadosFormatados();
			String dadosAluno = String.format("Mat: %s\nCurso: %s\n", this.matricula, this.curso);
			
			return dadosUsuario + dadosAluno;
			
		}
	
}
