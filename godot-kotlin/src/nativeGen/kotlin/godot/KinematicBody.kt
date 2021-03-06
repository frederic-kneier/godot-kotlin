// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
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

open class KinematicBody(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PhysicsBody(null) {
  var collisionSafeMargin: Float
    get() {
       return getSafeMargin() 
    }
    set(value) {
      setSafeMargin(value)
    }

  var moveLockX: Boolean
    get() {
       return getAxisLock(1) 
    }
    set(value) {
      setAxisLock(1, value)
    }

  var moveLockY: Boolean
    get() {
       return getAxisLock(2) 
    }
    set(value) {
      setAxisLock(2, value)
    }

  var moveLockZ: Boolean
    get() {
       return getAxisLock(4) 
    }
    set(value) {
      setAxisLock(4, value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAxisLock(axis: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAxisLock.call(self._handle, listOf(axis), _retPtr)
      _ret.value
    }
  }

  fun getFloorNormal(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getFloorNormal.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFloorVelocity(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getFloorVelocity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSafeMargin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSafeMargin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSlideCollision(slideIdx: Int): KinematicCollision {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: KinematicCollision
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSlideCollision.call(self._handle, listOf(slideIdx), _retPtr)
      _ret = objectToType<KinematicCollision>(_tmp.value!!)
      _ret
    }
  }

  fun getSlideCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSlideCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOnCeiling(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOnCeiling.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOnFloor(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOnFloor.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOnWall(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOnWall.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun moveAndCollide(
    relVec: Vector3,
    infiniteInertia: Boolean = true,
    excludeRaycastShapes: Boolean = true,
    testOnly: Boolean = false
  ): KinematicCollision {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: KinematicCollision
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(relVec)
      _args.add(infiniteInertia)
      _args.add(excludeRaycastShapes)
      _args.add(testOnly)
      __method_bind.moveAndCollide.call(self._handle, _args, _retPtr)
      _ret = objectToType<KinematicCollision>(_tmp.value!!)
      _ret
    }
  }

  fun moveAndSlide(
    linearVelocity: Vector3,
    upDirection: Vector3 = Vector3(0, 0, 0),
    stopOnSlope: Boolean = false,
    maxSlides: Int = 4,
    floorMaxAngle: Float = 0.785398f,
    infiniteInertia: Boolean = true
  ): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(linearVelocity)
      _args.add(upDirection)
      _args.add(stopOnSlope)
      _args.add(maxSlides)
      _args.add(floorMaxAngle)
      _args.add(infiniteInertia)
      __method_bind.moveAndSlide.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun moveAndSlideWithSnap(
    linearVelocity: Vector3,
    snap: Vector3,
    upDirection: Vector3 = Vector3(0, 0, 0),
    stopOnSlope: Boolean = false,
    maxSlides: Int = 4,
    floorMaxAngle: Float = 0.785398f,
    infiniteInertia: Boolean = true
  ): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(linearVelocity)
      _args.add(snap)
      _args.add(upDirection)
      _args.add(stopOnSlope)
      _args.add(maxSlides)
      _args.add(floorMaxAngle)
      _args.add(infiniteInertia)
      __method_bind.moveAndSlideWithSnap.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setAxisLock(axis: Int, lock: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(axis)
      _args.add(lock)
      __method_bind.setAxisLock.call(self._handle, _args, null)
    }
  }

  fun setSafeMargin(pixels: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSafeMargin.call(self._handle, listOf(pixels), null)
    }
  }

  fun testMove(
    from: Transform,
    relVec: Vector3,
    infiniteInertia: Boolean = true
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(relVec)
      _args.add(infiniteInertia)
      __method_bind.testMove.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for KinematicBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for KinematicBody
     */
    private object __method_bind {
      val getAxisLock: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_axis_lock" }
        }
      val getFloorNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_floor_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_floor_normal" }
        }
      val getFloorVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_floor_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_floor_velocity" }
        }
      val getSafeMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_safe_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_safe_margin" }
        }
      val getSlideCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_slide_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slide_collision" }
        }
      val getSlideCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_slide_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slide_count" }
        }
      val isOnCeiling: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_ceiling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_ceiling" }
        }
      val isOnFloor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_floor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_floor" }
        }
      val isOnWall: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_wall".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_wall" }
        }
      val moveAndCollide: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_collide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_collide" }
        }
      val moveAndSlide: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_slide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_slide" }
        }
      val moveAndSlideWithSnap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_slide_with_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_slide_with_snap" }
        }
      val setAxisLock: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "set_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis_lock" }
        }
      val setSafeMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "set_safe_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_safe_margin" }
        }
      val testMove: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "test_move".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method test_move" }
        }}
  }
}
