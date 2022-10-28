// Auth: Rahul Nanda Kantheti
import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {


    @org.junit.jupiter.api.Test
    void nullInput(){
        assertEquals(urinals.countUrinals(null), "Input String Null");
    }

    @org.junit.jupiter.api.Test
    void logicTest1(){
        assertEquals("2",urinals.countUrinals("0000"));
    }

    @org.junit.jupiter.api.Test
    void invalidInput(){
        assertEquals("Invalid input",urinals.countUrinals("aaabbb"));
    }
}
