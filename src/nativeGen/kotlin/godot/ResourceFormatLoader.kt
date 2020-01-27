// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ResourceFormatLoader internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): ResourceFormatLoader = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ResourceFormatLoader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ResourceFormatLoader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ResourceFormatLoader(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ResourceFormatLoader = ResourceFormatLoader(ptr)
    /**
     * Container for method_bind pointers for ResourceFormatLoader
     */
    private object __method_bind
  }
}
