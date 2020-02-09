// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TextureRect(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  var expand: Boolean
    get() {
       return hasExpand() 
    }
    set(value) {
      setExpand(value)
    }

  var flipH: Boolean
    get() {
       return isFlippedH() 
    }
    set(value) {
      setFlipH(value)
    }

  var flipV: Boolean
    get() {
       return isFlippedV() 
    }
    set(value) {
      setFlipV(value)
    }

  var stretchMode: StretchMode
    get() {
       return getStretchMode() 
    }
    set(value) {
      setStretchMode(value.value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getStretchMode(): StretchMode {
    val _ret = __method_bind.getStretchMode.call(this._handle)
    return TextureRect.StretchMode.from(_ret.asInt())
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.toAny() as Texture
  }

  fun hasExpand(): Boolean {
    val _ret = __method_bind.hasExpand.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.isFlippedH.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.isFlippedV.call(this._handle)
    return _ret.asBoolean()
  }

  fun setExpand(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setExpand.call(this._handle, listOf(_arg))
  }

  fun setFlipH(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setFlipH.call(this._handle, listOf(_arg))
  }

  fun setFlipV(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setFlipV.call(this._handle, listOf(_arg))
  }

  fun setStretchMode(stretchMode: Int) {
    val _arg = Variant(stretchMode)
    __method_bind.setStretchMode.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  enum class StretchMode(
    val value: Int
  ) {
    SCALE_ON_EXPAND(0),

    SCALE(1),

    TILE(2),

    KEEP(3),

    KEEP_CENTERED(4),

    KEEP_ASPECT(5),

    KEEP_ASPECT_CENTERED(6),

    KEEP_ASPECT_COVERED(7);

    companion object {
      fun from(value: Int): StretchMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TextureRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for TextureRect
     */
    private object __method_bind {
      val getStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "get_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stretch_mode" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val hasExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "has_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_expand" }
        }
      val isFlippedH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "is_flipped_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
        }
      val isFlippedV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "is_flipped_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
        }
      val setExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand" }
        }
      val setFlipH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_flip_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
        }
      val setFlipV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_flip_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
        }
      val setStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch_mode" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }}
  }
}
