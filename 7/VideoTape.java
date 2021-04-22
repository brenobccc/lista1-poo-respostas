/**
 * * The VideoTape class holds information about a single television programme
 * recorded on a video tape * and it is used in a video shop system. It holds
 * the video tape details.
 */

public class VideoTape {
    private String title; // the title of the programme
    private String classification; // classification of the programme (comedy, drama, action, or romance)
    private int time;// the running time of the programme in minutes
    /* Create a new video tape with a given title, classification, and time. */

    public VideoTape(String fullTitle, String programClassification, int runningTime) {
        title = fullTitle;
        classification = programClassification;
        time = runningTime;
    }

    // Return the title of this video tape.
    public String getTitle() {
        return this.title;
    }

    // Return the classification of this video tape.
    public String getClassification() {
        return this.classification;
    }

    // Return the time of this video tape as a string in the following format: 2:06.
    public int getTime() {
        return this.time;
    }

    //// .............
    // Set a new classification for this video tape



    
    /*
     * Print the details of the video tape to the output terminal in the following
     * format: * Adil Emam (COMEDY) 2:16
     */
    public String showAllInformations() {
        return this.title + this.classification + this.time;
    }
}
