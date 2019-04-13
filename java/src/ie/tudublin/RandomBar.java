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
        float colour = 0.6f;

        ui.stroke(120);
        ui.strokeWeight(2);

        for(int s = 0; s < 5; s++)
        {
            ui.fill((ui.mouseX * 0.1f + colour), (ui.mouseY * 0.3f + colour), (s * 1.5f + colour));
            ui.rect(ui.width - space, ui.height - 200, 50, -130+length);
            space = space + 60;
            length = length + 20;
            colour = colour * 3;
        }
    }
}

// x and y coordinates  shows
// the random bar moves according to the mouseX, mouseY