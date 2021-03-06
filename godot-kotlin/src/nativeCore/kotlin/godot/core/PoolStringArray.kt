package godot.core

import gdnative.godot_error
import gdnative.godot_pool_string_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.readValue

class PoolStringArray(
  value: CValue<godot_pool_string_array>
) : CoreType<godot_pool_string_array>(value), Iterable<String> {
  constructor(): this(__new())
  constructor(from: VariantArray): this(__new(from))

  fun append(string: String) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      GDString.from(string) {
        checkNotNull(Godot.gdnative.godot_pool_string_array_append)(ptr, it._value.ptr)
      }
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolStringArray) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun destroy() {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_pool_string_array_destroy)(_value.ptr)
    }
  }

  fun insert(index: Int, string: String): godot_error {
    lateinit var ret: godot_error
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      GDString.from(string) {
        ret = checkNotNull(Godot.gdnative.godot_pool_string_array_insert)(ptr, index, it._value.ptr)
      }
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, string: String) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      GDString.from(string) {
        checkNotNull(Godot.gdnative.godot_pool_string_array_set)(ptr, index, it._value.ptr)
      }
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): String {
    return Allocator.allocationScope {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_pool_string_array_get)(_value.ptr, index)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
    }
  }

  fun size(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_pool_string_array_size)(_value.ptr)
    }
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return GDString("PoolStringArray(${size()})")
  }

  override fun iterator(): Iterator<String> {
    return IndexedIterator(size(), this::get)
  }
  
  companion object {
    internal fun __new() = allocType2<godot_pool_string_array> {
      checkNotNull(Godot.gdnative.godot_pool_string_array_new)(it)
    }

    internal fun __new(from: VariantArray) = allocType2<godot_pool_string_array> {
      checkNotNull(Godot.gdnative.godot_pool_string_array_new_with_array)(it, from._value.ptr)
    }
  }
}
