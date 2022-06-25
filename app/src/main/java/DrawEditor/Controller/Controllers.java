package DrawEditor.Controller;

import DrawEditor.Model.DrawModel;

public class Controllers {
  public DrawController drawController;
  public ColorController colorController;

  public Controllers(DrawModel m) {
    this.drawController = new DrawController(m);
    this.colorController = new ColorController(m);
  }
}
