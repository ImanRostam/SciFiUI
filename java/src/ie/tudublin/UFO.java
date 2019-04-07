package ie.tudublin;

import processing.core.PApplet;

public class UFO extends UIElement
{
    protected int colR, colG, colB;
    private boolean damage;
    public UFO(float x, float y, PApplet ui, int eyeR, int eyeG, int eyeB)
    {
        super(x, y, ui);
        this.damage = false;
        this.colR = eyeR;
        this.colG = eyeG;
        this.colB = eyeB;
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
        ui.fill(0, 128, 0);
        ui.ellipse(x, y-30, 40, 50);
        ui.fill(colR, colG, colB);
        ui.ellipse(x-10, y-40, 10, 5);
        ui.ellipse(x+10, y-40, 10, 5);

        // UFO Body Frame
        ui.fill(120);
        ui.ellipse(x, y, 150, 60);
    }

    public void move()
    {
        y = y + 0.5f;
        x = x + 0.5f;
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
}