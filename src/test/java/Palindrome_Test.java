
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Palindrome_Test {

    @Test
    public void textConversion_inputText_lowCaseWithoutSpace(){
        String checkWord = "KobyLa mA maLy BoK";
        String checkWordFinal = "kobylamamalybok";
        assertEquals(checkWordFinal, Palindrome.textConversion(checkWord));
    }

}
