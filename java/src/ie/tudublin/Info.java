package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Info
{
    private String name;
    PApplet ui;

    public Info(TableRow row)
    {
        this.name = row.getString("Name:");
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}