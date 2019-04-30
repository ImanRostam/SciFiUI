package ie.tudublin;

import processing.data.TableRow;

public class LicensePlate
{
    private String number;

    public LicensePlate(TableRow row)
    {
        this.number = row.getString("License Plate");
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }
}