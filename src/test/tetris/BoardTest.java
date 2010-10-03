package test.tetris;

import junit.framework.TestCase;
import org.junit.*;

import tetris.Board;



public class BoardTest extends TestCase {

    private final Board board = new Board(3, 3);

        @Test
        public void testIs_empty() {
            assertEquals("" +
                    "...\n" +
                    "...\n" +
                    "...\n", board.toString());
        }

}