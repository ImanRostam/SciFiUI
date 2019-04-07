package ie.tudublin;

import processing.core.PApplet;

public class UFO extends UIElement
{
    public UFO(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.stroke(0);
        ui.strokeWeight(1);

        // UFO Head Frame
        ui.fill(120);
        ui.ellipse(x, y-20, 100, 100);

        // UFO Inside Frame
        ui.fill(0);
        ui.ellipse(x, y-20, 90, 90);

        
        // Alien
        ui.fill(0, 128, 0);
        ui.ellipse(x, y-30, 40, 50);
        ui.fill(255, 0, 0);
        ui.ellipse(x-10, y-40, 10, 5);
        ui.ellipse(x+10, y-40, 10, 5);

        // UFO Body Frame
        ui.fill(120);
        ui.ellipse(x, y, 150, 60);

    }

    public void move()
    {
        y = y + 3;
        x = x + 3;
    }
}