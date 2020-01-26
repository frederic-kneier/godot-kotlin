// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpriteFrames internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addAnimation() {
    TODO()
  }

  fun addFrame() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun clearAll() {
    TODO()
  }

  fun getAnimationLoop(): Boolean {
    TODO()
  }

  fun getAnimationNames(): PoolStringArray {
    TODO()
  }

  fun getAnimationSpeed(): Float {
    TODO()
  }

  fun getFrame(): Texture {
    TODO()
  }

  fun getFrameCount(): Int {
    TODO()
  }

  fun hasAnimation(): Boolean {
    TODO()
  }

  fun removeAnimation() {
    TODO()
  }

  fun removeFrame() {
    TODO()
  }

  fun renameAnimation() {
    TODO()
  }

  fun setAnimationLoop() {
    TODO()
  }

  fun setAnimationSpeed() {
    TODO()
  }

  fun setFrame() {
    TODO()
  }

  companion object {
    fun new(): SpriteFrames = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpriteFrames".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SpriteFrames" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpriteFrames(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for SpriteFrames
     */
    private object __method_bind {
      val add_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "add_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_animation" }
            }
          }

      val add_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "add_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_frame" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val clear_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "clear_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_all" }
            }
          }

      val get_animation_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_animation_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_loop" }
            }
          }

      val get_animation_names: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_animation_names".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_names" }
            }
          }

      val get_animation_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_animation_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_speed" }
            }
          }

      val get_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val get_frame_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_frame_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame_count" }
            }
          }

      val has_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "has_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_animation" }
            }
          }

      val remove_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "remove_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_animation" }
            }
          }

      val remove_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "remove_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_frame" }
            }
          }

      val rename_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "rename_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_animation" }
            }
          }

      val set_animation_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "set_animation_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_loop" }
            }
          }

      val set_animation_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "set_animation_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_speed" }
            }
          }

      val set_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "set_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame" }
            }
          }
    }
  }
}
