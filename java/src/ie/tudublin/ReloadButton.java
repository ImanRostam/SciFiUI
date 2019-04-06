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
        ui.fill(255, 0, 0);
        ui.rect(150, ui.height - 170, 200, 100);
    }

    // // public void reloadBar()
    // // {
    // //     stroke(0);
    // //     strokeWeight(2);
    // //     fill(100);
    // //     int sizeX = 170;
    // //     int sizeY = height - 300;
        
    // //     for(int s = 0; s < 6; s++)
    // //     {
    // //         rect(sizeX, sizeY, 160, 70);
    // //         sizeY = sizeY - 70;
    // //     }


    // // }

    // // public void viewer()
    // // {
    // //     background(255);
    // //     stroke(255, 26, 26);
    // //     fill(255);
    // //     float cWH = random(500, 550);
    // //     for(int n = 0; n < 10; n++)
    // //     {
    // //         ellipse((width/2) +100, height/2, cWH, cWH);
    // //         cWH++;
    // //     }
    // // }

    // // public void randomButton()
    // // {
    // //     stroke(0);
    // //     fill(random(255));
    // //     int space = 80;
    // //     int buttonY = 50;
        
    // //     for(int sp = 0; sp < 4; sp++)
    // //     {
    // //         rect(width - space, buttonY, 50, 50);
    // //         space = space + 80;
    // //     }
    // // }
    // // public void draw()
    // // {
    // //     viewer();
    // //     reloadButton();
    // //     reloadBar();
    // //     randomButton();
    // }
}