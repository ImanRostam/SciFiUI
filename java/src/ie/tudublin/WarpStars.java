package ie.tudublin;

import processing.core.PApplet;

public class WarpStars extends UIElement
{
    public WarpStars(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        for(int i = 0; i < 40; i++)
        {
            ui.stroke(255);
            ui.strokeWeight(0);
            ui.fill(255);
            ui.ellipse(i * 10, i * 10, 5, 5);
        }
    }
}