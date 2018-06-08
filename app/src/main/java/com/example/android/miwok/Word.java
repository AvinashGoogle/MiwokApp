package com.example.android.miwok;

public class Word {
    private String miwokLang;
    private String engLang;
    private int imgId;
    private int songId;

    public Word(String miwokLang,String engLang, int songId) {
        this.engLang = engLang;
        this.miwokLang = miwokLang;
        this.songId = songId;
    }

    public Word(String miwokLang,String engLang,int imgId, int songId) {
        this.engLang = engLang;
        this.miwokLang = miwokLang;
        this.imgId = imgId;
        this.songId = songId;
    }

    public String getMiwokLang(){
        return miwokLang;
    }

    public String getEngLang(){
        return engLang;
    }

    public int getImgId(){ return imgId; }

    public int getSongId(){return  songId;}
}
