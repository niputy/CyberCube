import static org.junit.Assert.*;
import org.junit.Test;

public class Task1Test {

    @Test (timeout=1000)
    public void Example1() {
        String s = "abcd";
        String t = "abcde";
        Task1 task = new Task1();
        char result = task.findAddedCharacter(s, t);
        assertEquals ("Result should be e!", 'e', result);
    }
    @Test (timeout=1000)
    public void Example2() {
        String s = "";
        String t = "y";
        Task1 task = new Task1();
        char result = task.findAddedCharacter(s, t);
        assertEquals ("Result should be y!", 'y', result);
    }
    @Test (timeout=1000)
    public void Example3() {
        String s = "a";
        String t = "aa";
        Task1 task = new Task1();
        char result = task.findAddedCharacter(s, t);
        assertEquals ("Result should be a!", 'a', result);
    }
    @Test (timeout=1000)
    public void Example4() {
        String s = "ae";
        String t = "aea";
        Task1 task = new Task1();
        char result = task.findAddedCharacter(s, t);
        assertEquals ("Result should be a!", 'a', result);
    }
}
