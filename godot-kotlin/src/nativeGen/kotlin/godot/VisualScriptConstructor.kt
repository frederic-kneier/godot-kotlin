// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class VisualScriptConstructor(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var constructor: Dictionary
    get() {
       return getConstructor() 
    }
    set(value) {
      setConstructor(value)
    }

  var type: Variant.Type
    get() {
       return getConstructorType() 
    }
    set(value) {
      setConstructorType(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for constructor
   */
  fun constructor(cb: Dictionary.() -> Unit) {
    val _p = constructor
    cb(_p)
    constructor = _p
  }

  fun getConstructor(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getConstructor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConstructorType(): Variant.Type {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConstructorType.call(self._handle, emptyList(), _retPtr)
      Variant.Type.from(_ret.value)
    }
  }

  fun setConstructor(constructor: Dictionary) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConstructor.call(self._handle, listOf(constructor), null)
    }
  }

  fun setConstructorType(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConstructorType.call(self._handle, listOf(type), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptConstructor".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptConstructor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptConstructor
     */
    private object __method_bind {
      val getConstructor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "get_constructor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constructor" }
        }
      val getConstructorType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "get_constructor_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constructor_type" }
        }
      val setConstructor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "set_constructor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constructor" }
        }
      val setConstructorType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "set_constructor_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constructor_type" }
        }}
  }
}
