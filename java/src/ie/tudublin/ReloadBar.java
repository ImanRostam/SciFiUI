package ie.tudublin;

import processing.core.PApplet;

public class ReloadBar extends UIElement
{
    public ReloadBar(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.stroke(0);
        ui.strokeWeight(2);
        ui.fill(100, 200);
        int sizeX = 70;
        int sizeY = ui.height - 400;
        
        for(int s = 0; s < 7; s++)
        {
            ui.rect(sizeX, sizeY, 100, 50);
            sizeY = sizeY - 50;
        }

    }
}