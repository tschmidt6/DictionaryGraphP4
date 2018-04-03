import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit test class to test class @see Graph that implements @see GraphADT interface
 *
 * @author sapan (sapan@cs.wisc.edu)
 */
public class GraphProcessorTest {
    
    private GraphProcessor gProc;
    private WordProcessor wdProc;
    
    private static List<String> vertices;
    
    private static int numOfVertices = 0;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        vertices = new ArrayList<>();
        vertices.add("at");
        vertices.add("it");
        vertices.add("cat");
        vertices.add("hat");
        vertices.add("hot");
        vertices.add("rat");
        vertices.add("heat");
        vertices.add("neat");
        vertices.add("major");
        vertices.add("wheat");
        vertices.add("streak");
        vertices.add("husband");
        for (String vertex : vertices)
            numOfVertices++;
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        vertices = null;
        numOfVertices = 0;
    }
    
    @Before
    public void setUp() throws Exception {
        gProc = new GraphProcessor();
        wdProc = new WordProcessor();
    }
    
    @After
    public void tearDown() throws Exception {
        gProc = null;
        wdProc = null;
    }
    
    // INSERT TESTS HERE:
    @Test
    public final void test1NAME() {
        assertEquals("", 0, 0);
    }
}
