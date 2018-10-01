package com.example.android.meowmusicplayer;


/**
 * {@link MusicInformation} represents the song information which will be displayed on screen.
 */
public class MusicInformation {

    //List of Songs
    private String SongList;

    //List of Artists
    private String ArtistList;

    /**Image Resource ID for the song
     * -1 is used to indicate that there is no image associated with the song. */
    private int ImageResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new song object
     * @param songList is an available song.
     * @param artistList is the name of the artist for each song.
     * @param imageResourceId is the image which is associated with the album.
     */

    MusicInformation(String songList, String artistList, int imageResourceId) {
        SongList = songList;
        ArtistList = artistList;
        ImageResourceId = imageResourceId;
    }

    /**
     * Get the song name.
     */
    public String getSongList() {
        return SongList;
    }

    /**
     * Get the Artist name.
     */
    public String getArtistList(){
        return ArtistList;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return ImageResourceId;
    }


    /** Returns whether or not there is an image for this album.
     *
     * @return mImageResourceId
     */
    public boolean hasImage(){
        return ImageResourceId != NO_IMAGE_PROVIDED;

    }


}

