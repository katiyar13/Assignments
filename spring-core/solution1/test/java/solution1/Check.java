package solution1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Check {

	@Test
	public void test() {
		String[] args = new String[0];
        Address address = new Address("rajendra nagar","Uttar Pradesh","Bareilly","India",200233);
        Customer customer = new Customer("Raja",123,900898797,address);
        solution1.Test.main(args);
        assertEquals(customer.toString(),solution1.Test.obj().toString());
	}

}
