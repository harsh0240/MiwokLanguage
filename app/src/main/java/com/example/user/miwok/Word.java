/**
 * Created by user on 02-01-2018.
 */
package com.example.user.miwok;


public class Word{
    private String english;
    private String miwok;
    private int resource;
    private int audioRes;

    public Word(String eng, String miw, int audRes){
        english = eng;
        miwok = miw;
        audioRes = audRes;
    }

    public Word(String eng, String miw, int res, int audRes){
        english = eng;
        miwok = miw;
        resource = res;
        audioRes = audRes;
    }

    public String getMiwok(){
        return miwok;
    }

    public String getEnglish() {
        return english;
    }

    public int getResource() {
        return resource;
    }

    public int getAudioResource(){return audioRes;}
}
