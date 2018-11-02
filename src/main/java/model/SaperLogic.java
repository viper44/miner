package model;

/**
 * Created by msemenov on 11/2/18.
 */
public interface SaperLogic {
    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x , int y);

    boolean finish();

    void suggest(int x, int y, boolean bomb);
}
