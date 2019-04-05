package ie.tudublin;

public class CircleView extends UI
{
    public void settings()
    {
        fullScreen();
    }

    public void circle()
    {
    float x = width/2;
    float y = height/2;
    float space = 10;

        for(float i = 0; i < 5; i++) 
        {
            noFill();
            stroke(255, 0, 0);
            ellipse(x,y, 500, 500);
            x = x + space ;
        }
    }

    public void draw()
    {
        circle();
    }
}