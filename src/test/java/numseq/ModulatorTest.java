package numseq;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ModulatorTest {

    @Test
    public void returnsListOfLongsModM() throws Exception {
        List<Long> expectedList = Arrays.asList(0L, 10L, 8L, 6L, 6L);
        assertEquals(expectedList, new Modulator().mod(12, Arrays.asList(12L, 34L, 56L, 78L, 90L)));
    }

    @Test
    @Ignore
    public void returnsFirstInstanceOfNonRepeatingSequence() throws Exception {
        List<Long> expectedList = Arrays.asList(0L, 10L, 8L, 6L, 8L);
        assertEquals(expectedList, new Modulator().modNRS(12, Arrays.asList(0L, 10L, 8L, 6L, 8L, 0L, 10L, 8L, 6L, 8L)));
    }
}