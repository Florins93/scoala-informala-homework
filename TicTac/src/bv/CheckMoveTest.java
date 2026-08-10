package bv;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CheckMoveTest {

    TicTac game = new TicTac();

    private CheckMove c = new CheckMove(game);

    @org.junit.jupiter.api.Test
    void checkMoveIsTrue() {
        Assertions.assertTrue(c.checkMove(2,2));
    }

    @org.junit.jupiter.api.Test
    void checkMoveArrayToLong() {
        Assertions.assertTrue(c.checkMove(7,2));
    }

}