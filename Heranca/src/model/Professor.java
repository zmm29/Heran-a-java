package model;

public class Professor extends Usuario{
	
	private String siape;
	private String area; 
	
	public Professor (String pCPF, String pSiape) {
		super (pCPF);
		this.siape = pSiape;
		
	}

	public String getSiape() {
	return this.siape;
	}

	public void setArea(String pArea) {
		this.area = pArea;
	}

		public String getArea() {
		return this.area;
	}
		public String dadosFormatados() {
			String dadosUsuario = super.dadosFormatados();
			String dadosProfessor = String.format("Siape: %s\nArea: %s\n", this.siape, this.area);
			
			return dadosUsuario + dadosProfessor;
			
		}
	

}
