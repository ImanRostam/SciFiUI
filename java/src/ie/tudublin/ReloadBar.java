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
        int sizeX = 100;
        int sizeY = ui.height - 250;
        
        for(int s = 0; s < 10; s++)
        {
            ui.rect(sizeX, sizeY, 150, 50);
            sizeY = sizeY - 50;
        }

    }
}