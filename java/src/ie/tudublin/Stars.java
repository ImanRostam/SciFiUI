package ie.tudublin;

import processing.core.PApplet;

public class Stars extends UIElement
{
    public Stars(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        for(int i = 0; i < 70; i++)
        {
            ui.stroke(255);
            ui.strokeWeight(0);
            ui.fill(255);
            ui.ellipse(ui.random(ui.width), ui.random(ui.height), 3, 3);
        }
    }
}