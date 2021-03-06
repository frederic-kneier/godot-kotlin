// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolIntArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class MultiplayerAPI(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var allowObjectDecoding: Boolean
    get() {
       return isObjectDecodingAllowed() 
    }
    set(value) {
      setAllowObjectDecoding(value)
    }

  var networkPeer: NetworkedMultiplayerPeer
    get() {
       return getNetworkPeer() 
    }
    set(value) {
      setNetworkPeer(value)
    }

  var refuseNewNetworkConnections: Boolean
    get() {
       return isRefusingNewNetworkConnections() 
    }
    set(value) {
      setRefuseNewNetworkConnections(value)
    }

  /**
   * MultiplayerAPI::connected_to_server signal
   */
  val signalConnectedToServer: Signal0 = Signal0("connected_to_server")

  /**
   * MultiplayerAPI::connection_failed signal
   */
  val signalConnectionFailed: Signal0 = Signal0("connection_failed")

  /**
   * MultiplayerAPI::network_peer_connected signal
   */
  val signalNetworkPeerConnected: Signal1<Int> = Signal1("network_peer_connected")

  /**
   * MultiplayerAPI::network_peer_disconnected signal
   */
  val signalNetworkPeerDisconnected: Signal1<Int> = Signal1("network_peer_disconnected")

  /**
   * MultiplayerAPI::network_peer_packet signal
   */
  val signalNetworkPeerPacket: Signal2<Int, PoolByteArray> = Signal2("network_peer_packet")

  /**
   * MultiplayerAPI::server_disconnected signal
   */
  val signalServerDisconnected: Signal0 = Signal0("server_disconnected")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _add_peer(id: Int) {
    TODO()
  }

  open fun _connected_to_server() {
    TODO()
  }

  open fun _connection_failed() {
    TODO()
  }

  open fun _del_peer(id: Int) {
    TODO()
  }

  open fun _server_disconnected() {
    TODO()
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun getNetworkConnectedPeers(): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getNetworkConnectedPeers.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNetworkPeer(): NetworkedMultiplayerPeer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: NetworkedMultiplayerPeer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNetworkPeer.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<NetworkedMultiplayerPeer>(_tmp.value!!)
      _ret
    }
  }

  fun getNetworkUniqueId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNetworkUniqueId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getRpcSenderId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRpcSenderId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasNetworkPeer(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasNetworkPeer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isNetworkServer(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isNetworkServer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isObjectDecodingAllowed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isObjectDecodingAllowed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRefusingNewNetworkConnections(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRefusingNewNetworkConnections.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun poll() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.poll.call(self._handle, emptyList(), null)
    }
  }

  fun sendBytes(
    bytes: PoolByteArray,
    id: Int = 0,
    mode: Int = 2
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(bytes)
      _args.add(id)
      _args.add(mode)
      __method_bind.sendBytes.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowObjectDecoding.call(self._handle, listOf(enable), null)
    }
  }

  fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNetworkPeer.call(self._handle, listOf(peer), null)
    }
  }

  fun setRefuseNewNetworkConnections(refuse: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRefuseNewNetworkConnections.call(self._handle, listOf(refuse), null)
    }
  }

  fun setRootNode(node: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRootNode.call(self._handle, listOf(node), null)
    }
  }

  enum class RPCMode(
    val value: Int
  ) {
    RPC_MODE_DISABLED(0),

    RPC_MODE_REMOTE(1),

    RPC_MODE_MASTER(2),

    RPC_MODE_PUPPET(3),

    RPC_MODE_SLAVE(3),

    RPC_MODE_REMOTESYNC(4),

    RPC_MODE_SYNC(4),

    RPC_MODE_MASTERSYNC(5),

    RPC_MODE_PUPPETSYNC(6);

    companion object {
      fun from(value: Int): RPCMode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiplayerAPI".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MultiplayerAPI" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MultiplayerAPI
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getNetworkConnectedPeers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "get_network_connected_peers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_connected_peers" }
        }
      val getNetworkPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "get_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_peer" }
        }
      val getNetworkUniqueId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "get_network_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_unique_id" }
        }
      val getRpcSenderId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "get_rpc_sender_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rpc_sender_id" }
        }
      val hasNetworkPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "has_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_network_peer" }
        }
      val isNetworkServer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "is_network_server".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_network_server" }
        }
      val isObjectDecodingAllowed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "is_object_decoding_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_object_decoding_allowed" }
        }
      val isRefusingNewNetworkConnections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "is_refusing_new_network_connections".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_refusing_new_network_connections" }
        }
      val poll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val sendBytes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "send_bytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method send_bytes" }
        }
      val setAllowObjectDecoding: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "set_allow_object_decoding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_object_decoding" }
        }
      val setNetworkPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "set_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_network_peer" }
        }
      val setRefuseNewNetworkConnections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "set_refuse_new_network_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_refuse_new_network_connections"
            }
        }
      val setRootNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "set_root_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_root_node" }
        }}
  }
}
