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
        fill(255, 0, 0);
        rect(150, height -200, 200, 100);
    }

    public void reloadBar()
    {
        stroke(0);
        fill(255, 0, 0);
        int sizeX = 170;
        int sizeY;
        
        for(sizeY = height - 350; sizeY < height - 100; sizeY--)
        {
            rect(sizeX, sizeY, 160, 100);
        }
    }

    public void draw()
    {
        reloadButton();
        reloadBar();
    }
}