package ie.tudublin;

public class Astroids extends UI
{
    float x = width/2;
    float y = height/2;
    float diameter = 60;

    public void settings()
    {
        fullScreen();
    }

    public void astroids()
    {
        stroke(0);
        fill(128, 43, 0);
        ellipse(x, y, diameter, diameter);
    }
    
    public void move()
    {
        y++;
        x++;
    }

    public void shot()
    { 
        if(mouseX == x || mouseY == y)
        {
            diameter -= 20;
        }
    }

    public void draw()
    {
        background(0);
        astroids();
        //move();
    }

    public void mousePressed()
    {
        shot();
    }
}