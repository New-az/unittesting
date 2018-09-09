import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * ListUtil is for count the number of distinct elements in a list
 * @author Vichakorn
 */
public class ListUtil {
	/**
	 * Count the number of distinct elements in a list. The list may be empty but
	 * not null.
	 *
	 * @param list a list of elements
	 * @return the number of distinct elements in list
	 */
	public static int countUnique(List<?> list) {
		if (list == null) throw new NullPointerException("List can't be null");
		List<Object> count = new ArrayList<>();
		for(Object x : list) {
			if(!count.contains(x))
			count.add(x);
		}
		return count.size();
	}
	
	/**
     * Binary Search algorithm is for search element in an array that already sorted.
     * If the value to find is null, throw an exception.
     * 
     * @param array is list of some element.
     * @param element is the element that user want to know index of array.
     * @return index of array that match element.(-1 is for can't not find element)
     * @throws IllegalArgumentException if element is null.
     */
    public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element) {
    	if(element == null) throw new IllegalArgumentException("Search element must not be null");
    	int lowercase = 0;
    	int highestcase = array.length - 1;
    	int middle = 0;
    	Arrays.sort(array);
    	
    	while(lowercase <= highestcase) {
    		middle = (lowercase + highestcase) / 2;
    		int manage = array[middle].compareTo(element);
    		if(manage < 0) {
    			lowercase = middle + 1;
    		}
    		else if(manage > 0) {
    			highestcase = middle - 1;
    		}
    		else return middle;
    	}
    	return -1;
    }
}