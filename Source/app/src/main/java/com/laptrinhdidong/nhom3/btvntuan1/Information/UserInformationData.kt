package com.laptrinhdidong.nhom3.btvntuan1

import android.os.Parcel
import android.os.Parcelable

public class UserInformationData(val index: Int): Parcelable
{

    override fun toString(): String {
        return "UserInformation(index=$index)"
    }
    constructor(index: Int, i: Int) : this(index)
    constructor(parcel: Parcel) : this(
        parcel.readInt()
    ) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(index)
    }
    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<UserInformationData> {
        override fun createFromParcel(parcel: Parcel): UserInformationData {
            return UserInformationData(parcel)
        }
        override fun newArray(size: Int): Array<UserInformationData?> {
            return arrayOfNulls(size)
        }
    }

}