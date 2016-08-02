/**
 * Clase: JUnit
 * @author Gladys De La Roca 15755
 * @author Andrea Pena 15127
 * @author Jackeline Hidalgo 15776
 * @author Rene Olivet 15238
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenamientoText {
	//selectionSort Test
	@Test 
    public void testselectionSort() {
        System.out.println("SelectionSort test");
        Lista prueba = new Lista();
        prueba.selectionSort();
        // TODO review the generated test code and remove the default call to fail.
        
    }
	//mergeSort Test
    	@Test 
    public void testmergeSort() {
        System.out.println("MergeSort test");
        Comparable[] lista = null;
        Lista prueba = new Lista();
        prueba.mergeSort(lista);
        // TODO review the generated test code and remove the default call to fail.
        
    }
	//insertionSort Test
    	@Test 
    public void testinsertionSort() {
        System.out.println("InsertionSort test");
        Lista prueba = new Lista();
        prueba.insertionSort();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    	//quickSort test
    	@Test 
      public void testquickSort() {
        System.out.println("QuickSort test");
        List<Integer> lista1 = null;
        Lista prueba = new Lista();
        List<Nodo> paramentro = null;
        List<Nodo> resultado = instance.quickSort(list);
        assertEquals(paramentro, resultado);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
