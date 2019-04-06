package ie.tudublin;

public class CircleView extends UI
{
    public void settings()
    {
        fullScreen();
    }

    public void circle()
    {
        //background(255);

        for(int x = 0; x < 60; x = x + 10) 
        {
            noFill();
            stroke(255, 0, 0);
            // ellipse(width/2, height/2, 500 +x, 500+ x);
            ellipse(mouseX, mouseY, 500 +x, 500+ x);
        }
    }

    public void draw()
    {
        circle();
    }
}