import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {
    // This Junit tests if the file exists or not
    // This particular testcase checks if "urinals.dat" is found or not
    urinals testcase = new urinals();

    @org.junit.jupiter.api.Test
    void nullInput(){
        assertEquals("Input String Null",testcase.countUrinals(null));
    }

    @org.junit.jupiter.api.Test
    void logicTest1(){
        assertEquals("2",testcase.countUrinals("0000"));
    }

    @org.junit.jupiter.api.Test
    void invalidInput(){
        assertEquals("Invalid input",testcase.countUrinals("aaabbb"));
    }
}
