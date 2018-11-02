package model;

/**
 * Created by msemenov on 11/2/18.
 */
public interface Board {
    void drawCongrat();
    void drawBang();
    void drawBoard(Cell[][] cells);
    void drawCell(int x, int y);
}
