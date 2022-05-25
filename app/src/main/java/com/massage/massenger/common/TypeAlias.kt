package com.massage.massenger.common

import com.massage.massenger.data.remote.socket.events.SocketEvent

typealias TextMessage          = SocketEvent.TextMessage
typealias MessageStatusCarrier = SocketEvent.MessageStatusCarrier
typealias WanderingStatus      = SocketEvent.WanderingStatus

typealias RTCMessage           = SocketEvent.RTCMessage

typealias RtcRequest           = SocketEvent.RTCMessage.RtcRequest
typealias SDPMessage           = SocketEvent.RTCMessage.SDPMessage
typealias ICEMessage           = SocketEvent.RTCMessage.ICEMessage
typealias PeerLeft             = SocketEvent.RTCMessage.PeerLeft