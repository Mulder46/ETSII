import java.util.*;
public class Asignatura {
	String nombre;
	String[] Alumnos;
	String[] Malos;
	
	public Asignatura(String asig, String[] todos){
		nombre=asig;
		Alumnos=new String[todos.length];
		Malos=new String[todos.length];
		
		
		for(int i=0;i<todos.length;i++){
			Scanner scr=new Scanner(todos[i]);
			scr.useDelimiter("[;]+");
			scr.useLocale(Locale.ENGLISH);
		
			String nomb,dni;
			double notas;
			//contadores
			int buenos=0;
			int malos=0;
			
		
			try{
				nomb=scr.next();
				dni=scr.next();
				notas=scr.nextDouble();
				
				Alumno alumn=new Alumno(nomb,dni,notas); //
				Alumnos[buenos]=alumn.toString()+" "+alumn.getCalificacion();//si el alumno es correcto, lo paso al principal
				buenos++;
				
			}catch(InputMismatchException e){//algún error en la nota (debe estar primero)
				Malos[malos]="Error: Nota no es válida:"+todos[i];
				malos++;
			}catch(AlumnoException e){ //en el caso de que la nota sea negativa entra en este catch
				Malos[malos]="Error: Nota no válida:"+todos[i];
				malos++;
			}catch(NoSuchElementException e){//si falta algo
				Malos[malos]="Error: Falta algún dato:"+todos[i];
				malos++;
			}
			scr.close();
			
		}
	}
	
	//método
	double getCalificacion(Alumno al) throws AlumnoException{
		double nota=10.0;
		return nota;
	}
	
}
