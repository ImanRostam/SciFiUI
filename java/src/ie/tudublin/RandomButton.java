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
        ui.fill(ui.random(255));
        int space = 80;
        int buttonY = 50;
        
        for(int sp = 0; sp < 4; sp++)
        {
            ui.rect(ui.width - space, buttonY, 50, 50);
            space = space + 80;
        }
    }
}