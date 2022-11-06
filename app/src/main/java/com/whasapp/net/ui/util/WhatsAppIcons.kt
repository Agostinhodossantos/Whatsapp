package com.whasapp.net.ui.util

import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector

object WhatsAppIcons {
  val ArrowBack = Icons.Rounded.ArrowBack
  val Camera = Icons.Default.CameraAlt
  val Message = Icons.Filled.Message
  val Search = Icons.Default.Search
  var MoreVert = Icons.Default.MoreVert
  var Call = Icons.Filled.Call
  var Video = Icons.Filled.VideoCall
  var Mic = Icons.Filled.Mic
  var Done = Icons.Default.Done
  var DoneAll = Icons.Default.DoneAll
}

/**
 * A sealed class to make dealing with [ImageVector] and [DrawableRes] icons easier.
 */
sealed class Icon {
  data class ImageVectorIcon(val imageVector: ImageVector) : Icon()
  data class DrawableResourceIcon(@DrawableRes val id: Int) : Icon()
}
