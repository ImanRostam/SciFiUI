package ie.tudublin;

import processing.core.PApplet;

public class Reload extends PApplet
{
    public void setup()
    {
       //background(255);
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
        fill(100);
        int sizeX = 170;
        int sizeY = height - 300;
        
        for(int s = 0; s < 6; s++)
        {
            rect(sizeX, sizeY, 160, 70);
            sizeY = sizeY - 70;
        }


    }

    public void viewer()
    {
        background(255);
        stroke(255, 26, 26);
        fill(255);
        float cWH = random(450, 500);
        for(int n = 0; n < 10; n++)
        {
            ellipse(((width/2) + 100) , height/2, cWH, cWH);
        }
    }

    public void RandomButton()
    {
        stroke(0);
        fill(random(255), random(255), random(255));
        //rect()
    }
    public void draw()
    {
        viewer();
        reloadButton();
        reloadBar();
    }
}