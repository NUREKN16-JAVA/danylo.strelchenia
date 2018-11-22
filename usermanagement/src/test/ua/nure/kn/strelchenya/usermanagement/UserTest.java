package ua.nure.kn.strelchenya.usermanagement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class UserTest {
    User user;
    private static final String FIRST_NAME_ETALONE = "Ivan";
    private static final String LAST_NAME_ETALONE = "Ivanov";
    private static final String FULL_NAME_ETALONE = "Ivanov, Ivan";

    private static final int CURRENT_YEAR = 2018;

    /*тест ДР*/
    private static final int ETALONE_AGE_1 = 47;
    private static final int YEAR_OF_BIRTH_1 = 1971;
    private static final int MONTH_OF_BIRTH_1 = 10;
    private static final int DAY_OF_BIRTH_1 = 22;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFullName() {
        user.setFirstName(FIRST_NAME_ETALONE);
        user.setLastName(LAST_NAME_ETALONE);
        assertEquals(FULL_NAME_ETALONE, user.getFullName());
    }

    @Test
    public void testGetAge1() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH_1, MONTH_OF_BIRTH_1, DAY_OF_BIRTH_1);
        user.setDateOfBirth(calendar.getTime());
        assertEquals(ETALONE_AGE_1, user.getAge());
    }
}