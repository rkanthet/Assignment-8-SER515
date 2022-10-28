// Auth: Rahul Nanda Kantheti
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UrinalsTest {

    @org.junit.jupiter.api.Test
    void acheckOutfileName(){
        String out = "rule1.txt";
        // change the string out if rule.txt files exist to the expected file name or else the test will fail
        assertEquals(out, urinals.outputFileName());
    }
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

    //outputfilename test

    // test cases for read file
    @org.junit.jupiter.api.Test
    void fileFound() {
        assertEquals("File found and processed properly", urinals.readFile("urinals.dat"));
    }

    // Error when file is not found
    @org.junit.jupiter.api.Test
    void fileDoesntExists() {
        assertEquals("nonexistentfile.dat (No such file or directory)", urinals.readFile("nonexistentfile.dat"));
    }

    // Error when file is empty
    @Test
    void fileEmpty() {
        assertEquals("File is empty, please enter a valid file", urinals.readFile("emptyUrinals.dat"));

    }

    // only integer values should be written to file
    @Test
    void badFileContent(){
        assertEquals("Invalid input to write",urinals.writeToFile("rule.txt","aaa"));
    }

    // file name should be in format of ruleX.txt
    @Test
    void badFileName(){
        assertEquals("Invalid input file name to write",urinals.writeToFile("ajjsj.txt","4"));
    }
}
