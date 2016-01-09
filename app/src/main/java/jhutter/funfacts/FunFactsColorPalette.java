package jhutter.funfacts;

import java.util.Random;

/**
 * Created by Jojo on 1/7/2016.
 */
public class FunFactsColorPalette {
    private String[] colors = {
            "#b29f90",
            "#8E847A",
            "#8B85A0",
            "#0b1d51",
            "#16513D"
    };

    // methods
    public String getColorString() {
        Random randomNumber = new Random();
        return colors[randomNumber.nextInt(colors.length)];
    }
}
