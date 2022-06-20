package DrawEditor.Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public
class DrawModel extends Observable {
    protected ArrayList<Figure> figures;
    protected Figure drawingFigure;
    protected Color currentColor;

    public DrawModel() {
        this.figures = new ArrayList<Figure>();
        this.drawingFigure = null;
        this.currentColor = Color.red;  // 色はとりあえず赤で固定
    }

    public ArrayList<Figure> getFigures() {
        return this.figures;
    }

    public Figure getFigure(int idx) {
        return this.figures.get(idx);
    }

    public void createFigure(int x, int y) {
        Figure f = new RectangleFigure(x, y, 0, 0, this.currentColor);
        this.figures.add(f);
        this.drawingFigure = f;
        setChanged();
        notifyObservers();
    }

    public void reshapeFigure(int x1, int y1, int x2, int y2) {
        if (this.drawingFigure != null) {
            this.drawingFigure.reshape(x1, y1, x2, y2);
            setChanged();
            notifyObservers();
        }
    }
}