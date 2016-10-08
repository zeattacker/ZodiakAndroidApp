package com.ramazeta.zodiak.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rama on 10/9/16.
 */

public class Percintaan {
    @SerializedName("single")
    @Expose
    private String single;
    @SerializedName("couple")
    @Expose
    private String couple;

    /**
     *
     * @return
     * The single
     */
    public String getSingle() {
        return single;
    }

    /**
     *
     * @param single
     * The single
     */
    public void setSingle(String single) {
        this.single = single;
    }

    /**
     *
     * @return
     * The couple
     */
    public String getCouple() {
        return couple;
    }

    /**
     *
     * @param couple
     * The couple
     */
    public void setCouple(String couple) {
        this.couple = couple;
    }
}
