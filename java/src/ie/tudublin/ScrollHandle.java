package ie.tudublin;

import processing.core.PApplet;

public class ScrollHandle extends UIElement
{
    public ScrollHandle(int x, int y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.stroke(0);
        ui.fill(255, 0, 0);
        ui.rect(405, ui.height-95, 30, 10);
    }
}