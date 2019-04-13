package ie.tudublin;

import processing.core.PApplet;

public class ControlPanel extends UIElement
{
    public ControlPanel(float x, float y, PApplet ui)
    {
        super(x, y, ui);
    }

    public void render()
    {
        // Control Panel - Oval
        ui.stroke(225);
        ui.strokeWeight(2);
        ui.fill(30);
        ui.ellipse(ui.width/2, ui.height+50, ui.width+100, ui.height-290);

        // Control Panel - Big Box
        ui.stroke(0);
        ui.fill(0);
        ui.rect(ui.width-900, ui.height-100, 400, 370);

        // Control Panel - Smaller Box
        ui.fill(140);
        ui.rect(ui.width-880, ui.height-80, 360, 320);

        // Bolts
        int spaceB = 0;
        int spaceL = 0;

        ui.fill(200);
        ui.strokeWeight(2.5f);
        ui.stroke(255);
        for(int b = 0; b < 3; b++)
        {
            ui.ellipse(ui.width-890+spaceB, ui.height-88, 13, 13);
            spaceB = spaceB + 190;
        }

        ui.stroke(123);
        ui.strokeWeight(2.5f);
        for(int l = 0; l < 3; l++)
        {
            ui.line(ui.width-896.5f+spaceL, ui.height-88, ui.width-884+spaceL,ui.height-88); // H
            ui.line(ui.width-890+spaceL, ui.height-94.5f, ui.width-890+spaceL, ui.height-81.5f); // V
            spaceL = spaceL +190;
        }
    }
}