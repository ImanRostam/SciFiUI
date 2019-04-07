package ie.tudublin;

import processing.core.PApplet;

public class CircularFrame extends UIElement
{
    public CircularFrame(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.stroke(225);
        ui.strokeWeight(2);
        ui.fill(30);
        ui.ellipse(ui.width/2, ui.height+50, ui.width+100, ui.height-300);
    }
}