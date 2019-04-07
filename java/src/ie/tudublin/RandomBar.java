package ie.tudublin;

import processing.core.PApplet;

public class RandomBar extends UIElement
{
    public RandomBar(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        int space = 100;
        int length = 0;

        ui.stroke(120);
        ui.strokeWeight(2);

        for(int s = 0; s < 6; s++)
        {
            ui.rect(ui.width - space, ui.height - 50, 50, -200+length);
            space = space + 60;
            length = length + 30;
        }
    }
}