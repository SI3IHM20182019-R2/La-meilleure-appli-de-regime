package com.example.regime_app.Models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class JourRepas  {
    private String repasmatin;
    private String rapsmidi;
    private String repassoir;

    public JourRepas(String repasmatin, String rapsmidi, String repassoir) {
        this.repasmatin = repasmatin;
        this.rapsmidi = rapsmidi;
        this.repassoir = repassoir;
    }

    public String getRepasmatin() {
        return repasmatin;
    }

    public String getRapsmidi() {
        return rapsmidi;
    }

    public String getRepassoir() {
        return repassoir;
    }
}