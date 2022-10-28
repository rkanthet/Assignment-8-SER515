import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {
    // This Junit tests if the file exists or not
    // This particular testcase checks if "urinals.dat" is found or not
    urinals testcase = new urinals();

//    @org.junit.jupiter.api.Test
//    void fileexists() {
//        assertEquals(1,testcase.Readfile("urinals.dat"));
//    }
//    // Misspelled the file name to show it does not exist
//    @org.junit.jupiter.api.Test
//    void fileDoesNotExists() {
//        assertEquals(-1,testcase.Readfile("urvinals.dat"));
//    }

    @org.junit.jupiter.api.Test
    void invalidInput(){
        assertEquals("Input String Null",testcase.countUrinals(null));
    }

    @org.junit.jupiter.api.Test
    void logicTest1(){
        assertEquals("2",testcase.countUrinals("0000"));
    }
}
