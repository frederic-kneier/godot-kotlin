// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptMathConstant(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var constant: MathConstant
    get() {
       return getMathConstant() 
    }
    set(value) {
      setMathConstant(value.value)
    }

  fun getMathConstant(): MathConstant {
    val _ret = __method_bind.getMathConstant.call(this._handle)
    return VisualScriptMathConstant.MathConstant.from(_ret.asInt())
  }

  fun setMathConstant(which: Int) {
    val _arg = Variant.new(which)
    __method_bind.setMathConstant.call(this._handle, listOf(_arg))
  }

  enum class MathConstant(
    val value: Int
  ) {
    ONE(0),

    PI(1),

    HALF_PI(2),

    TAU(3),

    E(4),

    SQRT2(5),

    INF(6),

    NAN(7),

    MAX(8);

    companion object {
      fun from(value: Int): MathConstant {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    fun new(): VisualScriptMathConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptMathConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptMathConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptMathConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptMathConstant = VisualScriptMathConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptMathConstant
     */
    private object __method_bind {
      val getMathConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptMathConstant".cstr.ptr,
            "get_math_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_math_constant" }
        }
      val setMathConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptMathConstant".cstr.ptr,
            "set_math_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_math_constant" }
        }}
  }
}