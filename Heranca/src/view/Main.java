package view;
import model.Usuario;
import model.Aluno;
import model.Professor;

public class Main {
	public static void main(String args[]) {
		Usuario usuario1 = new Usuario ("050");
		usuario1.setNome("Andrézinho lima");
		
		System.out.println(usuario1.dadosFormatados());
		
		Aluno aluno1 = new Aluno("123.101.256-69", "20211940008");
		aluno1.setNome("André Luiz de Lima");
		aluno1.setCurso("SI");
		
		Professor professor1= new Professor ("499.1" , "688");
		professor1.setNome("Emerson");
		professor1.setArea("LPII");
		
		System.out.println(professor1.dadosFormatados());
		System.out.println(aluno1.dadosFormatados());

	}
}
