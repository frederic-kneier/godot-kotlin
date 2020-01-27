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

open class TextureArray internal constructor(
  _handle: COpaquePointer
) : TextureLayered(_handle) {
  companion object {
    fun new(): TextureArray = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureArray".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TextureArray" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureArray(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TextureArray = TextureArray(ptr)
    /**
     * Container for method_bind pointers for TextureArray
     */
    private object __method_bind
  }
}
