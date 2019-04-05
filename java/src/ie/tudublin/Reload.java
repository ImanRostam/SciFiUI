package ie.tudublin;

import processing.core.PApplet;

public class Reload extends PApplet
{
    public void setup()
    {
       background(100);
    }

    public void settings()
    {
    fullScreen();
    }

    public void reloadButton()
    {
        stroke(0);
        strokeWeight(2);
        fill(255, 0, 0);
        rect(150, height - 170, 200, 100);
    }

    public void reloadBar()
    {
        stroke(0);
        strokeWeight(2);
        fill(255, 0, 0);
        int sizeX = 170;
        int sizeY = height - 300;
        
        for(int s = 0; s < 6; s++)
        {
            rect(sizeX, sizeY, 160, 70);
            sizeY = sizeY - 70;
        }
    }

    public void draw()
    {
        reloadButton();
        reloadBar();
    }
}