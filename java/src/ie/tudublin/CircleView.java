package ie.tudublin;

import processing.core.PApplet;

public class CircleView extends UIElement
{
    public CircleView(float x, float y, PApplet ui) // constructor
    {
        super(x, y, ui);
    }

    public void render()
    {
        for(int x = 0; x < 60; x = x + 10) 
        {
            ui.noFill();
            ui.stroke(255, 0, 0);
            ui.strokeWeight(2);
            ui.ellipse(ui.width/2 + 100, ui.height/2, 450 +x, 450+ x);
            // ui.ellipse(ui.mouseX, ui.mouseY, 500 +x, 500+ x);
        }
    }
}