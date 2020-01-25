package godot

import gdnative.godot_quat
import kotlinx.cinterop.*

class Quat(
  value: CValue<godot_quat>
) : Primitive<godot_quat>(value) {
  var x: Float
    get() {
      return memScoped {
        checkNotNull(Godot.gdnative.godot_quat_get_x)(_value.ptr)
      }
    }
    set(value) {
      _value = memScoped {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_quat_set_x)(_value.ptr, value)
        ptr.pointed.readValue()
      }
    }

  var y: Float
    get() {
      return memScoped {
        checkNotNull(Godot.gdnative.godot_quat_get_y)(_value.ptr)
      }
    }
    set(value) {
      _value = memScoped {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_quat_set_y)(_value.ptr, value)
        ptr.pointed.readValue()
      }
    }

  var z: Float
    get() {
      return memScoped {
        checkNotNull(Godot.gdnative.godot_quat_get_z)(_value.ptr)
      }
    }
    set(value) {
      _value = memScoped {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_quat_set_z)(_value.ptr, value)
        ptr.pointed.readValue()
      }
    }

  var w: Float
    get() {
      return memScoped {
        checkNotNull(Godot.gdnative.godot_quat_get_w)(_value.ptr)
      }
    }
    set(value) {
      _value = memScoped {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_quat_set_w)(_value.ptr, value)
        ptr.pointed.readValue()
      }
    }

  fun cubicSlerp(b: Quat, preA: Quat, postB: Quat, t: Float): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_cubic_slerp)(_value.ptr, b._value.ptr, preA._value.ptr, postB._value.ptr, t)
      )
    }
  }

  fun dot(quat: Quat): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_quat_dot)(_value.ptr, quat._value.ptr)
    }
  }

  fun inverse(): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_inverse)(_value.ptr)
      )
    }
  }

  fun isNormalized(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_quat_is_normalized)(_value.ptr)
    }
  }

  fun length(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_quat_length)(_value.ptr)
    }
  }

  fun lengthSquared(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_quat_length_squared)(_value.ptr)
    }
  }

  fun normalized(): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_normalized)(_value.ptr)
      )
    }
  }

  fun setAxisAngle(axis: Vector3, angle: Float) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative11.godot_quat_set_axis_angle)(_value.ptr, axis._value.ptr, angle)
      ptr.pointed.readValue()
    }
  }

  fun slerp(quat: Quat, t: Float): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_slerp)(_value.ptr, quat._value.ptr, t)
      )
    }
  }

  fun slerpni(quat: Quat, t: Float): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_slerpni)(_value.ptr, quat._value.ptr, t)
      )
    }
  }

  fun xform(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_quat_xform)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun plus(other: Quat): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_operator_add)(_value.ptr, other._value.ptr)
      )
    }
  }

  operator fun minus(other: Quat): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_operator_subtract)(_value.ptr, other._value.ptr)
      )
    }
  }

  operator fun times(scalar: Float): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_operator_multiply)(_value.ptr, scalar)
      )
    }
  }

  operator fun div(scalar: Float): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_operator_divide)(_value.ptr, scalar)
      )
    }
  }

  operator fun unaryMinus(): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_quat_operator_neg)(_value.ptr)
      )
    }
  }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_quat_as_string)(_value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }

    return memScoped {
      when (other) {
        is Quat -> checkNotNull(Godot.gdnative.godot_quat_operator_equal)(_value.ptr, other._value.ptr)
        else -> false
      }
    }
  }

  override fun hashCode(): Int {
    return _value.hashCode()
  }

  companion object {
    fun new(x: Float = 0f, y: Float = 0f, z: Float = 0f, w: Float = 1f): Quat {
      val value = memScoped {
        val tmp = alloc<godot_quat>()
        checkNotNull(Godot.gdnative.godot_quat_new)(tmp.ptr, x, y, z, w)
        tmp.readValue()
      }
      return Quat(value)
    }

    fun new(basis: Basis): Quat {
      val value = memScoped {
        val tmp = alloc<godot_quat>()
        checkNotNull(Godot.gdnative11.godot_quat_new_with_basis)(tmp.ptr, basis._value.ptr)
        tmp.readValue()
      }
      return Quat(value)
    }

    fun new(vec: Vector3): Quat {
      val value = memScoped {
        val tmp = alloc<godot_quat>()
        checkNotNull(Godot.gdnative11.godot_quat_new_with_euler)(tmp.ptr, vec._value.ptr)
        tmp.readValue()
      }
      return Quat(value)
    }

    fun new(axis: Vector3, angle: Float): Quat {
      val value = memScoped {
        val tmp = alloc<godot_quat>()
        checkNotNull(Godot.gdnative.godot_quat_new_with_axis_angle)(tmp.ptr, axis._value.ptr, angle)
        tmp.readValue()
      }
      return Quat(value)
    }
  }
}