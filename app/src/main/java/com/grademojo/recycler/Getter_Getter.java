package com.grademojo.recycler;

/**
 * Created by sapling_a0 on 28/7/17.
 */

public class Getter_Getter {


    public static final int MALE_CLICKED = 0;

    public static final int FEMALE_CLICKED = 1;





    private String roll_no;

    private String name;

    private String class2;

    private String gender;

    private String section;




    public String getClass2() {
        return class2;
    }


    public String getGender() {
        return gender;
    }

    public String getSection() {
        return section;
    }




    public int getClick_option() {
        return click_option;
    }




    public String getRoll_no() {
        return roll_no;
    }




    public String getName() {
        return name;
    }



    public void setClass2(String class2) {
        this.class2 = class2;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setSection(String section) {
        this.section = section;
    }


    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }






    public void setName(String name) {
        this.name = name;
    }


    public void setClick_option(int click_option) {
        this.click_option = click_option;
    }



    private int click_option;

















}
