package ie.tudublin;

import processing.core.PApplet;

public class CircleView extends PApplet
{
    public void settings()
    {
    fullScreen();
    }

    public void render()
    {
    float x = width/2;
    float y = height/2;

        for(int i = 0; i < 5; i++) 
        {
            noFill();
            stroke(255, 0, 0);
            ellipse(x,y, i*(30), i*(30));
        }
    }

    public void draw()
    {
        render();
    }
}