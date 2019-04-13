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
        // Big Bar
        ui.stroke(127);
        ui.strokeWeight(1);
        ui.fill(0);
        ui.rect(415, ui.height-100, 10, ui.height);

        // Small Bar
        ui.stroke(127);
        ui.strokeWeight(2);
        ui.fill(127);
        ui.line(420, ui.height-96, 420, ui.height);
    }
}