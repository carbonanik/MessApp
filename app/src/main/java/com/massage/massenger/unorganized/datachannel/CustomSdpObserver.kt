package com.massage.massenger.unorganized.datachannel

import org.webrtc.SdpObserver
import org.webrtc.SessionDescription




abstract class CustomSdpObserver: SdpObserver {

    override fun onCreateSuccess(sessionDescription: SessionDescription?) {}

    override fun onSetSuccess() {}

    override fun onCreateFailure(s: String?) {}

    override fun onSetFailure(s: String?) {}
}