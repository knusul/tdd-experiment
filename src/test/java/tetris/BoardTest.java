package tetris;

import junit.framework.TestCase;

import tetris.Board;



public class BoardTest extends TestCase {

    private final Board board = new Board(3, 3);


        public void testIs_empty() {
            assertEquals("" +
                    "...\n" +
                    "...\n" +
                    "...\n", board.toString());
        }

}