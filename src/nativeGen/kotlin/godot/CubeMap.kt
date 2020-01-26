// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CubeMap internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getFlags(): Int {
    TODO()
  }

  fun getHeight(): Int {
    TODO()
  }

  fun getLossyStorageQuality(): Float {
    TODO()
  }

  fun getSide(): Image {
    TODO()
  }

  fun getStorage(): Storage {
    TODO()
  }

  fun getWidth(): Int {
    TODO()
  }

  fun setFlags() {
    TODO()
  }

  fun setLossyStorageQuality() {
    TODO()
  }

  fun setSide() {
    TODO()
  }

  fun setStorage() {
    TODO()
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(7);
  }

  enum class Side(
    val value: Int
  ) {
    SIDE_LEFT(0),

    SIDE_RIGHT(1),

    SIDE_BOTTOM(2),

    SIDE_TOP(3),

    SIDE_FRONT(4),

    SIDE_BACK(5);
  }

  enum class Storage(
    val value: Int
  ) {
    STORAGE_RAW(0),

    STORAGE_COMPRESS_LOSSY(1),

    STORAGE_COMPRESS_LOSSLESS(2);
  }

  companion object {
    val FLAGS_DEFAULT: Int = 7

    val FLAG_FILTER: Int = 4

    val FLAG_MIPMAPS: Int = 1

    val FLAG_REPEAT: Int = 2

    val SIDE_BACK: Int = 5

    val SIDE_BOTTOM: Int = 2

    val SIDE_FRONT: Int = 4

    val SIDE_LEFT: Int = 0

    val SIDE_RIGHT: Int = 1

    val SIDE_TOP: Int = 3

    val STORAGE_COMPRESS_LOSSLESS: Int = 2

    val STORAGE_COMPRESS_LOSSY: Int = 1

    val STORAGE_RAW: Int = 0

    fun new(): CubeMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CubeMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CubeMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CubeMap(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CubeMap
     */
    private object __method_bind {
      val get_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "get_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flags" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_lossy_storage_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "get_lossy_storage_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lossy_storage_quality" }
            }
          }

      val get_side: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "get_side".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_side" }
            }
          }

      val get_storage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "get_storage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_storage" }
            }
          }

      val get_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val set_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "set_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flags" }
            }
          }

      val set_lossy_storage_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "set_lossy_storage_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lossy_storage_quality" }
            }
          }

      val set_side: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "set_side".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_side" }
            }
          }

      val set_storage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMap".cstr.ptr,
              "set_storage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_storage" }
            }
          }
    }
  }
}
