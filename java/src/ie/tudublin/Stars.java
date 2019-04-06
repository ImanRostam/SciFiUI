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
        for(int i = 0; i < 40; i++)
        {
            ui.ellipse(ui.random(ui.width), ui.random(ui.height), 5, 5);
        }
    }
}