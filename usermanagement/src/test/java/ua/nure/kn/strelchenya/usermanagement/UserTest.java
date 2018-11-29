package ua.nure.kn.strelchenya.usermanagement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

/**Тесты работают на дату 22.11.2018*/

public class UserTest {
    User user;

    private static final String FIRST_NAME_ETALONE = "Ivan";
    private static final String LAST_NAME_ETALONE = "Ivanov";
    private static final String FULL_NAME_ETALONE = "Ivanov, Ivan";


    /*тест ДР 1*/
    private static final int ETALONE_AGE_1 = 47;
    private static final int YEAR_OF_BIRTH_1 = 1971;
    private static final int MONTH_OF_BIRTH_1 = 10;
    private static final int DAY_OF_BIRTH_1 = 22;

    /*тест ДР тот же год, человеку несколько дней от рождения*/
    private static final int ETALONE_AGE_2 = 0;
    private static final int YEAR_OF_BIRTH_2 = 2018;
    private static final int MONTH_OF_BIRTH_2 = 10;
    private static final int DAY_OF_BIRTH_2 = 22;

    /*тест ДР 3 ровно год*/
    private static final int ETALONE_AGE_3 = 47;
    private static final int YEAR_OF_BIRTH_3 = 1971;
    private static final int MONTH_OF_BIRTH_3 = 10;
    private static final int DAY_OF_BIRTH_3 = 22;

    /*тест ДР 4 за день до дня рождения*/
    private static final int ETALONE_AGE_4 = 46;
    private static final int YEAR_OF_BIRTH_4 = 1971;
    private static final int MONTH_OF_BIRTH_4 = 10;
    private static final int DAY_OF_BIRTH_4 = 21;

    /*тест ДР 5 будущая дата*/
    private static final int ETALONE_AGE_5 = 0;
    private static final int YEAR_OF_BIRTH_5 = 2019;
    private static final int MONTH_OF_BIRTH_5 = 10;
    private static final int DAY_OF_BIRTH_5 = 23;

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

    @Test
    public void testGetAge2() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH_2, MONTH_OF_BIRTH_2, DAY_OF_BIRTH_2);
        user.setDateOfBirth(calendar.getTime());
        assertEquals(ETALONE_AGE_2, user.getAge());
    }

    @Test
    public void testGetAge3() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH_3, MONTH_OF_BIRTH_3, DAY_OF_BIRTH_3);
        user.setDateOfBirth(calendar.getTime());
        assertEquals(ETALONE_AGE_3, user.getAge());
    }

    @Test
    public void testGetAge4() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH_4, MONTH_OF_BIRTH_4, DAY_OF_BIRTH_4);
        user.setDateOfBirth(calendar.getTime());
        assertEquals(ETALONE_AGE_4, user.getAge());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetAge5() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH_5, MONTH_OF_BIRTH_5, DAY_OF_BIRTH_5);
        user.setDateOfBirth(calendar.getTime());
        assertEquals(ETALONE_AGE_5, user.getAge());
    }
}