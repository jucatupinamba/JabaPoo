import java.util.ArrayList;
import java.util.List;

public class ExercicioArray {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		for (String x : list) {  // laço for each
			System.out.println(x);
		}
		System.out.println("------------------");
		list.remove(1); //remove n referência da lista
		list.removeIf(x -> x.charAt(0) == 'M'); 
		//expressão lambda removendo arquivo pela primeira letra
	
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		/* 
		 * Busca de arquivo na lista;
		 * Caso resultado seja ausente o retorno será negativo
		 */
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		System.out.println("------------------");
		/* erro de sintaxe? List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());;
		for (String x : result) {
			System.out.println(x);
		}*/
	}
}