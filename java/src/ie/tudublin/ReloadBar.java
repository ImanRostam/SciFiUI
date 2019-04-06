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
        ui.fill(100);
        int sizeX = 170;
        int sizeY = ui.height - 300;
        
        for(int s = 0; s < 6; s++)
        {
            ui.rect(sizeX, sizeY, 160, 70);
            sizeY = sizeY - 70;
        }

    }
}