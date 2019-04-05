package ie.tudublin;

public class CircleView extends UI
{
    float x = width/2;
    float y = height/2;

    float rotation;

    public void render()
    {
        for(int i = 0; i < 5; i++) 
        {
            noFill();
            stroke(255, 0, 0);
            ellipse(x,y, i*(20), i*(20));
        }
    }

    public void draw()
    {
        render();
    }
}