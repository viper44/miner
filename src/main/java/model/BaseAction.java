package model;

/**
 * Created by msemenov on 11/2/18.
 */
public class BaseAction implements UserAction {
    private final GeneratorBoard generator;
    private final Board board;
    private final SaperLogic saperLogic;

    public BaseAction(GeneratorBoard generator, Board board, SaperLogic saperLogic){
        this.generator = generator;
        this.board = board;
        this.saperLogic = saperLogic;
    }

    public void initGame(){
        final Cell[][] cells = generator.generateBoard();
        this.board.drawBoard(cells);
        this.saperLogic.loadBoard(cells);
    }

    public void select(int x, int y, boolean bomb){
        this.saperLogic.suggest(x, y, bomb);
        board.drawCell(x, y);
        if (this.saperLogic.shouldBang(x, y)) {
            this.board.drawBang();
        }
        if (this.saperLogic.finish()){
            this.board.drawCongrat();
        }
    }
}
