package com.ramazeta.zodiak.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rama on 10/9/16.
 */

public class Zodiak {
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("lahir")
    @Expose
    private String lahir;
    @SerializedName("usia")
    @Expose
    private String usia;
    @SerializedName("zodiak")
    @Expose
    private String zodiak;
    @SerializedName("ramalan")
    @Expose
    private Ramalan ramalan;

    /**
     *
     * @return
     * The nama
     */
    public String getNama() {
        return nama;
    }

    /**
     *
     * @param nama
     * The nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     *
     * @return
     * The lahir
     */
    public String getLahir() {
        return lahir;
    }

    /**
     *
     * @param lahir
     * The lahir
     */
    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    /**
     *
     * @return
     * The usia
     */
    public String getUsia() {
        return usia;
    }

    /**
     *
     * @param usia
     * The usia
     */
    public void setUsia(String usia) {
        this.usia = usia;
    }

    /**
     *
     * @return
     * The zodiak
     */
    public String getZodiak() {
        return zodiak;
    }

    /**
     *
     * @param zodiak
     * The zodiak
     */
    public void setZodiak(String zodiak) {
        this.zodiak = zodiak;
    }

    /**
     *
     * @return
     * The ramalan
     */
    public Ramalan getRamalan() {
        return ramalan;
    }

    /**
     *
     * @param ramalan
     * The ramalan
     */
    public void setRamalan(Ramalan ramalan) {
        this.ramalan = ramalan;
    }
}
