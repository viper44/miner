package model;

/**
 * Created by msemenov on 11/2/18.
 */
public interface UserAction {
    void initGame();

    void select(int x, int y, boolean bomb);
}
