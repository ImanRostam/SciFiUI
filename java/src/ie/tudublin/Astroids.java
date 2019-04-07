package ie.tudublin;

import processing.core.PApplet;

public class Astroids extends UIElement
{
    protected float diameter;
    private float r, g, b;

    public Astroids(float x, float y, PApplet ui, float diameter, float r, float g, float b)
    {
        super(x, y, ui);
        this.diameter = diameter;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void render()
    {
        ui.stroke(0);
        ui.fill(r, g, b);
        ui.ellipse(x, y, diameter, diameter);
    }

    public void move1()
    {
        y = y + 0.5f;
        x = x + 0.5f;
    }

    public void move2()
    {
        y = y - 0.5f;
        x = x + 0.5f;
    }

    // public void shoot()
    // {
    //     while(ui.mouseX < x || ui.mouseY < y)
    //     {
    //         diameter -= 20;
    //     }
    // }
}