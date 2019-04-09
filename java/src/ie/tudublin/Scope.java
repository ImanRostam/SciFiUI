package ie.tudublin;

import static processing.core.PConstants.PI;

import processing.core.PApplet;

public class Scope extends UIElement {
    public Scope(float x, float y, PApplet ui) // constructor
    {
        super(x, y, ui);
    }

    float rotation;

    public void render() {
        for (int x = 0; x < 60; x = x + 10) {
            ui.noFill();
            ui.stroke(255, 0, 0, 70);
            ui.strokeWeight(2);
            // ui.ellipse(ui.width/2 + 100, ui.height/2, 450 +x, 450+ x);
            ui.ellipse(ui.mouseX, ui.mouseY, 300 + x, 300 + x);
        }

        ui.pushMatrix();
        ui.translate(ui.mouseX, ui.mouseY);
        ui.rotate(rotation);

        int arcS = 300;
        for (int a = 0; a < 5; a++) 
        {
            ui.stroke(0 + (a*30), 0 + (a*50), (0 +a*70));
            ui.arc(0, 0, arcS, arcS, 0, PI);
            arcS += 10;
        }
        ui.popMatrix();
        rotation += 0.2f;


        ui.stroke(255, 0, 0, 70);
        ui.ellipse(ui.mouseX, ui.mouseY, 50, 50);
        ui.ellipse(ui.mouseX, ui.mouseY, 5, 5);

    }
}