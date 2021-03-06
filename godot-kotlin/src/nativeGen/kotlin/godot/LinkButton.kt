// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class LinkButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : BaseButton(null) {
  var text: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  var underline: UnderlineMode
    get() {
       return getUnderlineMode() 
    }
    set(value) {
      setUnderlineMode(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getUnderlineMode(): UnderlineMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUnderlineMode.call(self._handle, emptyList(), _retPtr)
      LinkButton.UnderlineMode.from(_ret.value)
    }
  }

  fun setText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setText.call(self._handle, listOf(text), null)
    }
  }

  fun setUnderlineMode(underlineMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUnderlineMode.call(self._handle, listOf(underlineMode), null)
    }
  }

  enum class UnderlineMode(
    val value: Int
  ) {
    ALWAYS(0),

    ON_HOVER(1),

    NEVER(2);

    companion object {
      fun from(value: Int): UnderlineMode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LinkButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LinkButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for LinkButton
     */
    private object __method_bind {
      val getText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getUnderlineMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "get_underline_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_underline_mode" }
        }
      val setText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setUnderlineMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "set_underline_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_underline_mode" }
        }}
  }
}
