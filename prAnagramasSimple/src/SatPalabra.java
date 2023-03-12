import java.util.*;

public class SatPalabra implements Comparator <Palabra> {
	
	public int compare(Palabra arg0, Palabra arg1){
		int res;
		int aux= arg0.getPalabra().length() - arg1.getPalabra().length();
		if(aux<0){
			res=-1;
		}else if(aux>0){
			res=1;
		}else{
			res=arg0.compareTo(arg1);
		}
		return res;
	}

}
