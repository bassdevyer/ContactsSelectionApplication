package com.example.android.contactsselectionapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mac on 5/12/16.
 */
public class ContactObject implements Parcelable {

    private String name;
    private String phone;
    private String website;

    public ContactObject(String name, String phone, String website) {
        this.name = name;
        this.phone = phone;
        this.website = website;
    }

    protected ContactObject(Parcel in) {
        name = in.readString();
        phone = in.readString();
        website = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(phone);
        dest.writeString(website);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ContactObject> CREATOR = new Creator<ContactObject>() {
        @Override
        public ContactObject createFromParcel(Parcel in) {
            return new ContactObject(in);
        }

        @Override
        public ContactObject[] newArray(int size) {
            return new ContactObject[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
