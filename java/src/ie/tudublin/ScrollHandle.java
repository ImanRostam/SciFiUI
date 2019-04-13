package ie.tudublin;

import processing.core.PApplet;

public class ScrollHandle extends UIElement
{
    private boolean slide;

    public ScrollHandle(int x, int y, PApplet ui) {
        super(x, y, ui);
        this.slide = false;
    }

    int handleY = ui.height - 95;
    public void render()
    {
        ui.stroke(0);
        ui.strokeWeight(1);
        ui.fill(255, 0, 0, 230);
        ui.rect(405, handleY, 30, 10);
    }

    /**
     * @return the slide
     */
    public boolean isSlide() {
        return slide;
    }

    /**
     * @param slide the slide to set
     */
    public void setSlide(boolean slide) {
        this.slide = slide;
    }
}