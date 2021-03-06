// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class VisibilityEnabler(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisibilityNotifier(null) {
  var freezeBodies: Boolean
    get() {
       return isEnablerEnabled(1) 
    }
    set(value) {
      setEnabler(1, value)
    }

  var pauseAnimations: Boolean
    get() {
       return isEnablerEnabled(0) 
    }
    set(value) {
      setEnabler(0, value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _node_removed(arg0: Node) {
    TODO()
  }

  fun isEnablerEnabled(enabler: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEnablerEnabled.call(self._handle, listOf(enabler), _retPtr)
      _ret.value
    }
  }

  fun setEnabler(enabler: Int, enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(enabler)
      _args.add(enabled)
      __method_bind.setEnabler.call(self._handle, _args, null)
    }
  }

  enum class Enabler(
    val value: Int
  ) {
    PAUSE_ANIMATIONS(0),

    FREEZE_BODIES(1),

    MAX(2);

    companion object {
      fun from(value: Int): Enabler {
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
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityEnabler".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityEnabler" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisibilityEnabler
     */
    private object __method_bind {
      val isEnablerEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler".cstr.ptr,
            "is_enabler_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabler_enabled" }
        }
      val setEnabler: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler".cstr.ptr,
            "set_enabler".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabler" }
        }}
  }
}
