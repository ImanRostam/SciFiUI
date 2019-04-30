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
            for(int posX= 0; posX<140; posX = posX +20)
            {
                ui.ellipse(500 + posX, ui.height-160+ posY, 15, 15);
            }
        }

        // Right Buttons
        ui.fill(0, 0, 255);
        for(int posY = 0; posY<60; posY = posY +20)
        {
            for(int posX= 0; posX<140; posX = posX +20)
            {
                ui.ellipse(710 + posX, ui.height-160+ posY, 15, 15);
            }
        }

        // Main Button
        ui.fill(255, 0, 0);
        ui.stroke(0);
        ui.ellipse(665, ui.height-140, 50, 50);

        ui.fill(0);
        ui.textSize(12);
        ui.text(("OFF"), 665, ui.height-135);
    }
}