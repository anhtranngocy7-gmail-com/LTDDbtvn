package com.laptrinhdidong.nhom3.btvntuan1

import android.os.Parcel
import android.os.Parcelable

class InformationUser(val email: String?, val fullName: String?, val phoneNumber: Int): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(email)
        parcel.writeString(fullName)
        parcel.writeInt(phoneNumber)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<InformationUser> {
        override fun createFromParcel(parcel: Parcel): InformationUser {
            return InformationUser(parcel)
        }

        override fun newArray(size: Int): Array<InformationUser?> {
            return arrayOfNulls(size)
        }
    }


}