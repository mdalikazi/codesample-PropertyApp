package alikazi.com.sentia.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Properties(var data: ArrayList<Property>) : Parcelable
