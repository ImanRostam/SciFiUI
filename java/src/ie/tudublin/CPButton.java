package ie.tudublin;

import processing.core.PApplet;

public class CPButton extends UIElement
{
    public CPButton(int x, int y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        int posX = 0;
        ui.fill(0, 0, 255);
        for(int i = 0; i<3; i++)
        {
            ui.ellipse(550 + posX, ui.height-140, 35, 35);
            posX = posX + 115;
        }
    }
}