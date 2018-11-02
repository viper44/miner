package gui;

import model.BaseAction;
import model.GeneratorBoard;
import model.SaperLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by msemenov on 11/2/18.
 */
public class GuiAction extends BaseAction implements ActionListener, MouseListener {
    private GuiBoard board;

    public GuiAction(SaperLogic saperLogic, GuiBoard board, GeneratorBoard generator){
        super(generator, board, saperLogic);
        this.board = board;
        this.board.addMouseListener(this);
    }

    public void actionPerformed(ActionEvent e){
        this.initGame();
    }

    public void mouseClicked(MouseEvent e){
        board.repaint();
    }

    public void mousePressed(MouseEvent e ){

    }
    public void mouseReleased(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){

    }
    public void mouseExited(MouseEvent e){

    }
}
