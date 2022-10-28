// Auth: Rahul Nanda Kantheti
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {

    @org.junit.jupiter.api.Test
    void checkOutfileName(){
        urinals testcase = new urinals();
        String out = "rule1.txt";
        // change the string out if rule.txt files exist to the expected file name or else the test will fail
        assertEquals(out, testcase.outputFileName());
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
        urinals testcase = new urinals();
        assertEquals("File found and processed properly", testcase.readFile("urinals.dat"));
    }

    // Error when file is not found
    @org.junit.jupiter.api.Test
    void fileDoesntExists() {
        urinals testcase = new urinals();
        assertEquals("nonexistentfile.dat (No such file or directory)", testcase.readFile("nonexistentfile.dat"));
    }

    // Error when file is empty
    @Test
    void fileEmpty() {
        urinals testcase = new urinals();
        assertEquals("File is empty, please enter a valid file", testcase.readFile("emptyUrinals.dat"));

    }

    // only integer values should be written to file
    @Test
    void badFileContent(){
        urinals testcase = new urinals();
        assertEquals("Invalid input to write",testcase.writeToFile("rule.txt","aaa"));
    }

    // file name should be in format of ruleX.txt
    @Test
    void badFileName(){
        urinals testcase = new urinals();
        assertEquals("Invalid input file name to write",testcase.writeToFile("ajjsj.txt","4"));
    }
}
