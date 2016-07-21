import javax.print.attribute.HashAttributeSet;

import scala.collection.mutable.HashTable;
import scala.collection.mutable.Map;

public class Prueba {

	public static void main(String[] args) {
		Map prueba = (Map) new HashAttributeSet();
		
		prueba.put("uno", "valor1");
		prueba.put("dos","valor2");
		
		System.out.println(prueba.get("uno"));
	}

}
