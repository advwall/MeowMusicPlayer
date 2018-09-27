package com.example.android.meowmusicplayer;


/**
 * {@link MusicInformation} represents the song information which will be displayed on screen.
 */
public class MusicInformation {

    //List of Songs
    private String mSongList;

    //List of Artists
    private String mArtistList;

    /**Image Resource ID for the song
     * -1 is used to indicate that there is no image associated with the song. */
    private int mImageResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new song object
     * @param songList is an available song.
     * @param artistList is the name of the artist for each song.
     * @param imageResourceId is the image which is associated with the vocab word.
     */

    MusicInformation(String songList, String artistList, int imageResourceId) {
        mSongList = songList;
        mArtistList = artistList;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the song name.
     */
    public String getSongList() {
        return mSongList;
    }

    /**
     * Get the Artist name.
     */
    public String getArtistList(){
        return mArtistList;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    /** Returns whether or not there is an image for this word.
     *
     * @return mImageReourceId
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }


}

