package com.example.logonrmlocal.pizzafaminta

import android.os.Parcel
import android.os.Parcelable
data class Pedido(val nomeCliente: String,
                  val sabores: List<String>,
                  val tamanho: String,
                  val tipoPagamento: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.createStringArrayList(),
            parcel.readString(),
            parcel.readString())
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nomeCliente)
        parcel.writeStringList(sabores)
        parcel.writeString(tamanho)
        parcel.writeString(tipoPagamento)
    }
    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<Pedido> {
        override fun createFromParcel(parcel: Parcel): Pedido {
            return Pedido(parcel)
        }
        override fun newArray(size: Int): Array<Pedido?> {
            return arrayOfNulls(size)
        }
    }
}
