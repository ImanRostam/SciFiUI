package ie.tudublin;

import processing.core.PApplet;

public class ScrollBar extends UIElement
{
    public ScrollBar(int x, int y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.stroke(0);
        ui.fill(0);
        ui.rect(415, ui.height-100, 10, ui.height);
    }
}