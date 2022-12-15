package com.example.cycleviewcriticalrole;

public class DataModel
{
    private String characterName;
    private String characterCharacterClass;
    private Integer characterImageID;
    private String characterInfo;
    private Integer characterBigImageID;

    public DataModel(String name, String characterClass, Integer imageID, Integer bigImageID, String info)
    {
        setName(name);
        setCharacterClass(characterClass);
        setImageID(imageID);
        setCharacterInfo(info);
        setBigImageID(bigImageID);
    }

    public void setName(String inputName)
    {
        this.characterName = inputName;
    }

    public void setCharacterClass(String inputCharacterClass) { this.characterCharacterClass = inputCharacterClass; }

    public void setImageID(Integer inputImageID)
    {
        this.characterImageID = inputImageID;
    }

    public void setCharacterInfo(String inputCharacterInfo) { this.characterInfo = inputCharacterInfo; }

    public void setBigImageID(Integer inputBigImageID) { this.characterBigImageID = inputBigImageID; }

    public String getName()
    {
        return this.characterName;
    }

    public String getCharacterClass()
    {
        return this.characterCharacterClass;
    }

    public Integer getImageID()
    {
        return this.characterImageID;
    }

    public String getCharacterInfo()
    {
        return this.characterInfo;
    }

    public Integer getBigImageID()
    {
        return this.characterBigImageID;
    }
}
