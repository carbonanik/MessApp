package com.massage.massenger.unorganized.rtc

import org.webrtc.IceCandidate
import org.webrtc.SessionDescription

interface SignalingClientListener {
    fun onConnectionEstablished()
    fun onRequestAccepted()
    fun onOfferReceived(description: SessionDescription)
    fun onAnswerReceived(description: SessionDescription)
    fun onIceCandidateReceived(iceCandidate: IceCandidate)
    fun onCallEnded()
}