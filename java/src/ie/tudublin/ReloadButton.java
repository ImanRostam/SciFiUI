package ie.tudublin;

import processing.core.PApplet;

public class ReloadButton extends UIElement
{
    public ReloadButton(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        ui.stroke(0);
        ui.strokeWeight(2);
        ui.fill(255, 30, 30, 200);
        ui.rect(80, ui.height-170, 200, 100);
    }
}