package ie.tudublin;

import processing.core.PApplet;

public class CircularFrame extends UIElement
{
    public CircularFrame(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        // Control Panel - Oval
        ui.stroke(225);
        ui.strokeWeight(2);
        ui.fill(30);
        ui.ellipse(ui.width/2, ui.height+50, ui.width+100, ui.height-300);

        // Control Panel - Big Box
        ui.stroke(0);
        ui.fill(0);
        ui.rect(ui.width-900, ui.height-100, 400, 370);

        // Control Panel - Smaller Box
        ui.fill(140);
        ui.rect(ui.width-880, ui.height-80, 360, 320);

        // Bolts
        int space =0;

        ui.fill(200);
        ui.stroke(0);
        ui.ellipse(ui.width-890, ui.height-88, 15, 15+space);
    }
}