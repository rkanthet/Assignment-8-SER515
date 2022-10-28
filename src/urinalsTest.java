// Auth: Rahul Nanda Kantheti
import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {

    // countUrinals tests
    @org.junit.jupiter.api.Test
    void nullInput() {
        assertEquals(urinals.countUrinals(null), "Input String Null");
    }

    @org.junit.jupiter.api.Test
    void logicTest1() {
        assertEquals("2", urinals.countUrinals("0000"));
    }

    @org.junit.jupiter.api.Test
    void invalidInput() {
        assertEquals("Invalid input", urinals.countUrinals("aaabbb"));
    }

    @org.junit.jupiter.api.Test
    void negativenessCase() {
        assertEquals(urinals.countUrinals("111"), "-1");
    }

    // test cases for read file
    @org.junit.jupiter.api.Test
    void fileFound() {
        urinals testcase = new urinals();
        assertEquals("File found and processed properly", testcase.readFile("urinals.dat"));
    }

    // Error when file is not found
    @org.junit.jupiter.api.Test
    void fileDoesntExists() {
        urinals testcase = new urinals();
        assertEquals("urvinals.dat (No such file or directory)", testcase.readFile("urvinals.dat"));
    }

    // Error when file is empty
    @org.junit.jupiter.api.Test
    void fileEmpty() {
        urinals testcase = new urinals();
        assertEquals("File is empty, please enter a valid file", testcase.readFile("emptyUrinals.dat"));

    }
}
