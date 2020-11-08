package com.example.submission4;

import android.os.Parcel;
import android.os.Parcelable;

public class molen implements Parcelable{
    private String name;
    private String price;
    private String detail;
    private int photo;

    public molen() {
    }

    protected molen(Parcel in) {
        name = in.readString();
        price = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<molen> CREATOR = new Creator<molen>() {
        @Override
        public molen createFromParcel(Parcel in) {
            return new molen(in);
        }

        @Override
        public molen[] newArray(int size) {
            return new molen[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(price);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
