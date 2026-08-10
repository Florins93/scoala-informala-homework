package bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveTest {

    TicTac game = new TicTac();

    Move m = new Move(game);

    @Test
    void makeYourMoveTrue() {

        Assertions.assertTrue(m.makeYourMove(0,1));
    }

    @Test
    void makeYourMoveOutOfArray() {

        Assertions.assertTrue(m.makeYourMove(4,1));
    }
}