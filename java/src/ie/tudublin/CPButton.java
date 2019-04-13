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
        // Left Buttons
        ui.fill(0, 0, 255);
        for(int posY = 0; posY<60; posY = posY +20)
        {
            for(int posX= 0; posX<120; posX = posX +20)
            {
                ui.ellipse(500 + posX, ui.height-160+ posY, 15, 15);
            }
        }
    }
}