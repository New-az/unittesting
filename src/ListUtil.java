import java.util.ArrayList;
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
}