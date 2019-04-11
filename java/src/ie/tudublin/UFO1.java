package ie.tudublin;

import processing.core.PApplet;

public class UFO1 extends UIElement
{
    protected int colR, colG, colB;
    private boolean damage;

    public UFO1(float x, float y, PApplet ui, int colR, int colG, int colB)
    {
        super(x, y, ui);
        this.damage = false;
        this.colR = colR;
        this.colG = colG;
        this.colB = colB;
    }

    public void render()
    {
        ui.stroke(0);
        ui.strokeWeight(1);

        // UFO Head Frame
        ui.fill(120);
        ui.ellipse(x, y-20, 100, 100);

        // UFO Inside Frame
        ui.fill(0);
        ui.ellipse(x, y-20, 90, 90);

        // Alien
        // ui.fill(0, 128, 0);
        ui.fill(colR, colG, colB);
        ui.ellipse(x, y-30, 40, 50);
        //ui.fill(colR, colG, colB);
        ui.fill(0);
        ui.ellipse(x-10, y-40, 10, 5);
        ui.ellipse(x+10, y-40, 10, 5);

        // UFO Body Frame
        ui.fill(120);
        ui.ellipse(x, y, 150, 60);
    }

    public void move1()
    {
        y = y + 2;
        x = x + 2;

        if(x>ui.width)
        {
            y = 0;
            x = 0+ui.random(ui.width);
        }
    }

    /**
     * @return the damage
     */
    public boolean isDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(boolean damage) {
        this.damage = damage;
    }

    // IDEA
    // When clicked on it - it will show a message from the Alien
    // When press letter S and the mouse is at it - it will shot the Alien 
}