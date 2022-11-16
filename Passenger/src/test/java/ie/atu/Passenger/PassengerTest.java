package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    Passenger isPassenger;

    @BeforeEach
    void setUp(){
        isPassenger = new Passenger(null,null,null,null,0);

    }
    @Test
    void testTitleMr(){
        isPassenger.setTitle("Mr");
        assertEquals("Mr",isPassenger.getTitle());
    }
    @Test
    void testTitleMrs(){
        isPassenger.setTitle("Mrs");
        assertEquals("Mrs",isPassenger.getTitle());
    }
    @Test
    void testTitleMs(){
        isPassenger.setTitle("Ms");
        assertEquals("Ms",isPassenger.getTitle());
    }
    @Test
    void testTitleFail(){

        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {isPassenger.setTitle("title");});
        assertEquals("Title must be Mr, Mrs or Ms.", exMessage.getMessage());
    }
    @Test
    void testName(){
        isPassenger.setName("John");
        assertEquals("John", isPassenger.getName());
    }
    @Test
    void testNameFail(){

        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {isPassenger.setName("A");});
        assertEquals("Name has to be a minimum of 3 characters.", exMessage.getMessage());
    }
    @Test
    void testID(){
        isPassenger.setID("007JAMESBOND");
        assertEquals("007JAMESBOND", isPassenger.getID());
    }
    @Test
    void testIDFail(){

        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {isPassenger.setID("12345");});
        assertEquals("ID has to be a minimum of 10 characters.", exMessage.getMessage());
    }
    @Test
    void testPhone(){
        isPassenger.setPhone("0891234123");
        assertEquals("0891234123",isPassenger.getPhone());
    }
    @Test
    void testPhoneFail(){

        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {isPassenger.setPhone("0000");});
        assertEquals("Phone number has to be a minimum of 7 numbers.", exMessage.getMessage());
    }
    @Test
    void testAge(){
        isPassenger.setAge(21);
        assertEquals(21,isPassenger.getAge());
    }
    @Test
    void testAgeFail(){

        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {isPassenger.setAge(12);});
        assertEquals("Passengers must be over 16 years old to fly.", exMessage.getMessage());
    }
    @AfterEach
    void tearDown(){

    }
}
