
public class Cancion {
	private String interprete,titulo;
	private Duracion duracion;
	private genero gener;
	
	public Cancion(String t,String i,int m,int s, genero g){
		titulo=t;
		interprete=i;
		gener=g;
		;
	}

	public String getInterprete() {
		return interprete;
	}

	public String getTitulo() {
		return titulo;
	}

	public Duracion getDuracion() {
		return duracion;
	}

	public genero getGener() {
		return gener;
	}
	public boolean equals(Object o){
		boolean res=o instanceof Cancion;
		Cancion c==res ? (Cancion) o : null;
		return res &&
				titulo.equalsIgnoreCase(c.titulo)&&
				interprete.toUpperCase().hashCode()+
				duracion.hashCode();
	}
	public int compareTo(cancion c){
		int res = titulo.compareToIgnoreCase((c.interprete);
		if(res==0){
			res=interprete.compareToIgnoreCase((c.interprete);
		}
		if(res==0){
			res=duracion.compa
		}
		public String toString(){
			
		}
	}

}
