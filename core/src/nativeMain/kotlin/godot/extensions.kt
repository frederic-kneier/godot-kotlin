package godot

import godot.core.Godot
import godot.core.Variant
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.invoke

fun Object.toVariant() = Variant(this)

// annoying hack, the instance returned by a factory has godot_object already created.
// this is due to how we call the constructor of the parent type and I'm not sure how to workaround it.
// It was done that way so we can construct Godot objects the kotlin way i.e Object() instead of Object.new()
// this only an issue for instances requested by Godot, i.e when you attach a script to a Node.
// clean the previously allocated object.
internal fun Object.replaceHandle(replacement: COpaquePointer) {
    if (::_handle.isInitialized) {
        checkNotNull(Godot.gdnative.godot_object_destroy)(_handle)
    }
    _handle = replacement
}