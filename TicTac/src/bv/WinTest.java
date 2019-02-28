package bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinTest {

    TicTac game = new TicTac();
    Win w = new Win(game);

    @Test
    void sameValueNotZero() {
        Assertions.assertTrue(w.sameValueNotZero(0,0,0));
    }

    @Test
    void sameValue() {
        Assertions.assertTrue(w.sameValueNotZero(1,1,1));
    }

    @Test
    void sameValueDifferentNumbers() {
        Assertions.assertTrue(w.sameValueNotZero(12,1,16));
    }

    @Test
    void isWin() {
        Assertions.assertTrue(w.isWin());
    }
}