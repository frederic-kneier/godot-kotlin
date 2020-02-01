// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeAdd2(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  var sync: Boolean
    get() {
       return isUsingSync() 
    }
    set(value) {
      setUseSync(value)
    }

  fun isUsingSync(): Boolean {
    val _ret = __method_bind.isUsingSync.call(this._handle)
    return _ret.asBoolean()
  }

  fun setUseSync(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseSync.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): AnimationNodeAdd2 = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeAdd2".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeAdd2" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeAdd2(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeAdd2 = AnimationNodeAdd2(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeAdd2
     */
    private object __method_bind {
      val isUsingSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeAdd2".cstr.ptr,
            "is_using_sync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_sync" }
        }
      val setUseSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeAdd2".cstr.ptr,
            "set_use_sync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_sync" }
        }}
  }
}
