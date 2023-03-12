
public class Alumno {
	String alumno,dni;
	double Calificacion;
	
	//CONSTRUCTORES
	Alumno (String name, String DNI){
			alumno=name;
			dni=DNI;
			Calificacion=0;	//llama a this en vez de hacer esto, con nota=0
	}
	
	public Alumno (String name, String DNI,double nota) throws AlumnoException{
			alumno=name;
			dni=DNI;
			if(nota>0){
				Calificacion=nota;
			}else{
			throw new AlumnoException("Nota negativa");
			
		}
	}
	

	//MÉTODOS	
	
	public String getNombre(){
		return alumno;
	}
	
	public String getDni(){
		return dni;
	}
	public double getCalificacion(){
		return Calificacion;
	}
	public String toString(){
		return "Nombre: "+alumno+" DNI: "+dni;
	}
}
