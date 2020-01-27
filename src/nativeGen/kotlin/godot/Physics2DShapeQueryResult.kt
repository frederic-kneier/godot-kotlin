// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Physics2DShapeQueryResult(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getResultCount(): Int {
    val _ret = __method_bind.get_result_count.call(this._handle)
    return _ret.asInt()
  }

  fun getResultObject(idx: Int): Object {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_result_object.call(this._handle, _arg, 1)
    return _ret.asObject(::Object)!!
  }

  fun getResultObjectId(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_result_object_id.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getResultObjectShape(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_result_object_shape.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getResultRid(idx: Int): RID {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_result_rid.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DShapeQueryResult
     */
    private object __method_bind {
      val get_result_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryResult".cstr.ptr,
            "get_result_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_count" }
        }
      val get_result_object: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryResult".cstr.ptr,
            "get_result_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_object" }
        }
      val get_result_object_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryResult".cstr.ptr,
            "get_result_object_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_object_id" }
        }
      val get_result_object_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryResult".cstr.ptr,
            "get_result_object_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_object_shape" }
        }
      val get_result_rid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryResult".cstr.ptr,
            "get_result_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_rid" }
        }}
  }
}
