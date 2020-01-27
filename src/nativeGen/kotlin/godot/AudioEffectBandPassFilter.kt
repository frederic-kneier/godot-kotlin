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

open class AudioEffectBandPassFilter(
  _handle: COpaquePointer
) : AudioEffectFilter(_handle) {
  companion object {
    fun new(): AudioEffectBandPassFilter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectBandPassFilter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectBandPassFilter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectBandPassFilter(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectBandPassFilter = AudioEffectBandPassFilter(ptr)
    /**
     * Container for method_bind pointers for AudioEffectBandPassFilter
     */
    private object __method_bind
  }
}
