package ie.tudublin;

import processing.core.PApplet;

public class LightsOff extends UIElement
{
    public LightsOff(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        for(int i = 0; i < 20; i++)
        {
            ui.stroke(255);
            ui.strokeWeight(0);
            ui.fill(255);
            ui.ellipse(ui.random(ui.width), ui.random(ui.height), 3, 3);
        }
    }
}