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
        float lx = 0;
        float rx = 0;
        for(int i = 0; i < 40; i++)
        {
            ui.stroke(255);
            ui.strokeWeight(0);
            ui.fill(255);
            ui.ellipse(lx, y, 5, 5);
            ui.ellipse(rx, y, 5, 5);
            lx = i * 15;
            rx = i * 15;
        }
    }
}