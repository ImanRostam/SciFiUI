package ie.tudublin;

import processing.core.PApplet;

public class Astroids extends UIElement
{
    private float diameter;

    public Astroids(float x, float y, PApplet ui, float diameter)
    {
        super(x, y, ui);
        this.diameter = diameter;
    }

    public void render()
    {
        ui.stroke(0);
        ui.fill(128, 43, 0);
        ui.ellipse(x, y, diameter, diameter);
    }
}