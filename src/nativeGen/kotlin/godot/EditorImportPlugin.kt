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

open class EditorImportPlugin(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): EditorImportPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorImportPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorImportPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorImportPlugin(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorImportPlugin = EditorImportPlugin(ptr)
    /**
     * Container for method_bind pointers for EditorImportPlugin
     */
    private object __method_bind
  }
}
