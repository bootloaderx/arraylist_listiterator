//ArrayList listIterator kod örneği
import java.util.*;

public class ArrayListOrnegi {
    public static void main(String[] args) {
      
    // Boş bir ArrayList oluşturuyorum 
    ArrayList<String> firmalar = new ArrayList<String>();

    // Listeme eleman eklemek için add() metodunu kullandım
    firmalar.add("Apple");
    firmalar.add("Microsoft");
    firmalar.add("Tesla");
   
    System.out.println("Firmaların isimleri: " + firmalar);
   
   
    ListIterator itrr = firmalar.listIterator();
	   
    //hasNext() ve next() metotlarını kullanarak listeyi baştan sona sıralıyorum.
    System.out.println("Baştan sona sıralanmıştır:");
    while(itrr.hasNext())
    System.out.println(itrr.next());
 
 
    //hasPrevious() ve previous() metotlarını kullanarak listeyi sondan başa sıralıyorum.
    System.out.println("Sondan başa sıralanmıştır:");
	   
    while(itrr.hasPrevious())
    System.out.println(itrr.previous());
    }
}
