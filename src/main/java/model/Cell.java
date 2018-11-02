package model;

/**
 * Created by msemenov on 11/2/18.
 */
public interface Cell<T> {
    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestEmpty();

    void suggestBomb();

    void draw(T paint, boolean real);
}
