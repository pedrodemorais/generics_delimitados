package service;

import java.util.List;

public class CalculationService {
	public static<T extends Comparable<T>> T max(List<T> lista) {
		
		if(lista.isEmpty()) {
			throw new IllegalStateException("Lista Vazia"); 
			
		}else {
			T max=lista.get(0);
			for(T x : lista) {
				if(x.compareTo(max)>0) {
					max=x;
					
				}
				
			}
			
			
			return max;
		}
		
		
	}
	

}
