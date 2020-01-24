package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LogicTest {

    @Test
    public void notMoveTest() {
        Logic fig = new Logic();
        fig.add(new BishopBlack(Cell.C1));
        boolean res = fig.move(Cell.C1, Cell.A3);
        assertThat(res, is(true));
    }

    @Test
    public void moveTest() {
        Logic fig = new Logic();
        fig.add(new BishopBlack(Cell.A3));
        boolean res = fig.move(Cell.A3, Cell.C1);
        assertThat(res, is(true));
    }
}
