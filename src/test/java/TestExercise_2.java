import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestExercise_2 {

   @Test
   public void testExercise_2()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Exercise_2.main(null);

     // assertion
     assertEquals("18.0\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}