// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ProgressBar(
  _handle: COpaquePointer
) : Range(_handle) {
  fun isPercentVisible(): Boolean {
    val _ret = __method_bind.is_percent_visible.call(this._handle)
    return _ret.asBool()
  }

  fun setPercentVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.set_percent_visible.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ProgressBar = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProgressBar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ProgressBar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ProgressBar(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ProgressBar = ProgressBar(ptr)
    /**
     * Container for method_bind pointers for ProgressBar
     */
    private object __method_bind {
      val is_percent_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProgressBar".cstr.ptr,
            "is_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_percent_visible" }
        }
      val set_percent_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProgressBar".cstr.ptr,
            "set_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_percent_visible" }
        }}
  }
}
