import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain
{

    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testDiagonal();
    }

    @Test
    public void testDiagonal() {
       Main.runJerooCode();
       assertTrue(Map.getInstance().isFlower(0,0));
       assertTrue(Map.getInstance().isFlower(1,1));
       assertTrue(Map.getInstance().isFlower(2,2));
       assertTrue(Map.getInstance().isFlower(3,3));
    }


}
