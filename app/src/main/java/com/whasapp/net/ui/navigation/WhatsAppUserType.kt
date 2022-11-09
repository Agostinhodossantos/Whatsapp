package com.whasapp.net.ui.navigation

import android.net.Uri
import android.os.Bundle
import androidx.navigation.NavType
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import com.whasapp.net.domain.model.WhatsAppUser
import kotlinx.serialization.json.Json

class WhatsAppUserType : NavType<WhatsAppUser>(isNullableAllowed = false) {

    override fun get(bundle: Bundle, key: String): WhatsAppUser? =
        bundle.getParcelable(key)

    override fun put(bundle: Bundle, key: String, value: WhatsAppUser) =
        bundle.putParcelable(key, value)

    override fun parseValue(value: String): WhatsAppUser {
        return Json.decodeFromString(value)
    }

    companion object {
        fun encodeToString(whatsAppUser: WhatsAppUser): String {
            return Uri.encode(Json.encodeToString(whatsAppUser))
        }
    }
}
