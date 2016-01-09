package jhutter.funfacts;

import java.util.Random;

/**
 * Created by JHutter on 1/7/2016.
 * Facts from Tumbleworld's Uncle Sheogorath Skyrim mod
 */
public class FactBook {
    // fields
    String[] mFacts = {
            "Reading can take you places. It took me to Riften once! It was awful.",
            "My Priest's got no nose. How does he smell? WITH HIS GILLS. So tread carefully.",
            "I enjoy a good sacrament as much as the next fellow. But they're better with some cheese. OR ENTRAILS.",
            "Ysgramor smelled faintly of violets his entire life. It was very embarassing.",
            "All those great big pointy and thumpy things. Do you every think that the Ocrsimer are trying to make up for something?",
            "Did you know that giants' toes are made of gold? They are! Particularly mixed with a bear's claws and some hanging moss.",
            "Sleeplessness is not a disease. It's a mistake, but not a disease. Now clotfoot, THAT is a disease. Of pigs. Or not.",
            "Hrothgar. So good they named it twice.",
            "Try chatting to your Helm. You never know. It may just talk back. Shame it's not the crazy one, though.",
            "Big weapons are slow, lumpy and uncomfortable, but some men seem absolutely convinced that women secretly adore the things.",
            "The famous game 'Snakes and Ladders' was invented in Markarth. By chickens. They're surprisingly observant.",
            "Do you get to the Cloud District? Oh, of course you do. IT'S RIGHT OVER THERE. Poor survival instinct, I'd say.",
            "Windhelm. All that hate and rage and violence and murder. Just like home! Oh, I need a holiday. WAIT! I'm having one right now! Spoilsport.",
            "The best thing to do with deer is to train them in smithing. You'll never look back."
    };

    // methods
    public String getFact() {
        Random randomNumber = new Random();
        return mFacts[randomNumber.nextInt(mFacts.length)];
    }
}
