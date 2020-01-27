// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimatedTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getFps(): Float {
    val _ret = __method_bind.get_fps.call(this._handle)
    return _ret.asFloat()
  }

  fun getFrameDelay(frame: Int): Float {
    val _arg = Variant.new(frame)
    val _ret = __method_bind.get_frame_delay.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getFrameTexture(frame: Int): Texture {
    val _arg = Variant.new(frame)
    val _ret = __method_bind.get_frame_texture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getFrames(): Int {
    val _ret = __method_bind.get_frames.call(this._handle)
    return _ret.asInt()
  }

  fun setFps(fps: Float) {
    val _arg = Variant.new(fps)
    __method_bind.set_fps.call(this._handle, _arg, 1)
  }

  fun setFrameDelay(frame: Int, delay: Float) {
    val _args = VariantArray.new()
    _args.append(frame)
    _args.append(delay)
    __method_bind.set_frame_delay.call(this._handle, _args.toVariant(), 2)
  }

  fun setFrameTexture(frame: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(frame)
    _args.append(texture)
    __method_bind.set_frame_texture.call(this._handle, _args.toVariant(), 2)
  }

  fun setFrames(frames: Int) {
    val _arg = Variant.new(frames)
    __method_bind.set_frames.call(this._handle, _arg, 1)
  }

  companion object {
    val MAX_FRAMES: Int = 256

    fun new(): AnimatedTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimatedTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimatedTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimatedTexture = AnimatedTexture(ptr)
    /**
     * Container for method_bind pointers for AnimatedTexture
     */
    private object __method_bind {
      val get_fps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "get_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fps" }
        }
      val get_frame_delay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "get_frame_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame_delay" }
        }
      val get_frame_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "get_frame_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame_texture" }
        }
      val get_frames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "get_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frames" }
        }
      val set_fps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "set_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fps" }
        }
      val set_frame_delay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "set_frame_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame_delay" }
        }
      val set_frame_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "set_frame_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame_texture" }
        }
      val set_frames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "set_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frames" }
        }}
  }
}
