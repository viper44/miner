package gui;

import model.Cell;

import java.awt.*;

/**
 * Created by msemenov on 11/2/18.
 */
public class GuiCell implements Cell<Graphics> {
   public  boolean isBomb(){
       return  false;
    }

    public boolean isSuggestBomb(){
        return false;
    }

    public  boolean isSuggestEmpty(){
        return false;
    }

    public void suggestEmpty(){

    }

    public void suggestBomb(){

    }

    public  void draw(Graphics paint, boolean real){
            paint.setColor(Color.RED);
            paint.drawOval(1, 1, 1, 1);
    }
}
