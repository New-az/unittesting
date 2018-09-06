import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
/**
 * Test method in ListUtil 
 * @author Vichakorn
 */
public class ListUtilTest {

	@Test
	public void testEmptyList() {
		List<?> list = new ArrayList<>();
		assertEquals(0, ListUtil.countUnique(list));
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullException() {
		ListUtil.countUnique(null);
	}
	
	@Test
	public void testArrayOfNull() {
		List<?> list = new ArrayList<>();
		list.add(null);
		assertEquals(1,ListUtil.countUnique(list));
		
	}
	
	@Test
	public void testIndexOfOne() {
		List<?> list = makeList("a");
		assertEquals(1, ListUtil.countUnique(list));
	}
	
	
	@Test
	public void testDuplicateElement() {
		List<?> a = makeList(1.0,1.0,2.0,3.0);
		assertEquals(3,ListUtil.countUnique(a));
	}
	
	@Test
	public void testDuplicateList() {
		List<?> a = makeList("SKE","SKE");
		List<?> b = makeList("SKE");
		assertEquals(ListUtil.countUnique(a),ListUtil.countUnique(b));
	}
	
	@Test 
	public void testIndexOfManyElement() {
		List<?> list = makeList(1,2,3,4,4,5,6,7,8,9,9,9,10,1);
		assertEquals(10, ListUtil.countUnique(list));
	}
	
	
	private List<?> makeList(Object ... elements){
		return java.util.Arrays.asList(elements);
	}

}
