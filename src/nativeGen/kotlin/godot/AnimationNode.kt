// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNode internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val FilterBlend: Int = 3

    val FilterIgnore: Int = 0

    val FilterPass: Int = 1

    val FilterStop: Int = 2

    fun new(): AnimationNode = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNode".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AnimationNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      AnimationNode(
        fn()
      )
    }}
}