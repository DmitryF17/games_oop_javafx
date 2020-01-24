package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BishopBlackTest {
    @Test
    public void positionTest() {
        BishopBlack fig = new BishopBlack(Cell.A1);
        Cell result = fig.position();
        assertThat(Cell.A1, is(result));
    }

    @Test
    public void copyTest() {
        BishopBlack fig = new BishopBlack(Cell.C3);
        Figure figure = fig.copy(Cell.C3);
        Cell result = figure.position();
        assertThat(Cell.C3, is(result));
    }

    @Test
    public void wayTest() {

        BishopBlack fig = new BishopBlack(Cell.C1);
        Cell[] result = fig.way(Cell.C1, Cell.G5);
        Cell[] expected = {Cell.C1, Cell.D2, Cell.E3, Cell.F4};
        assertThat(expected, is(result));
    }
}