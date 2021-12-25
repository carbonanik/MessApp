package com.massage.massenger.common

import com.massage.massenger.data.remote.socket.dto.SocketMessage

typealias TextMessage          = SocketMessage.TextMessage
typealias MessageStatusCarrier = SocketMessage.MessageStatusCarrier
typealias WanderingStatus      = SocketMessage.WanderingStatus

typealias RTCMessage           = SocketMessage.RTCMessage

typealias RtcRequest           = SocketMessage.RTCMessage.RtcRequest
typealias SDPMessage           = SocketMessage.RTCMessage.SDPMessage
typealias ICEMessage           = SocketMessage.RTCMessage.ICEMessage
typealias PeerLeft             = SocketMessage.RTCMessage.PeerLeft