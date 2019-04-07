package ie.tudublin;

import processing.core.PApplet;

public class RandomButton extends UIElement
{
    public RandomButton(float y, float x, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.stroke(0);
        ui.fill(0, 0, 255, 100);
        int space = 100;
        int buttonY = 50;
        
        for(int s = 0; s < 4; s++)
        {
            ui.rect(ui.width - space, buttonY, 50, 50);
            space = space + 60;
        }

        // Test
        
    }
}