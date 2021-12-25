package com.massage.massenger.unorganized.datachannel

import org.webrtc.DataChannel




abstract class CustomDataChannelObserver: DataChannel.Observer {

    override fun onBufferedAmountChange(l: Long) {}

    override fun onStateChange() {}

    override fun onMessage(buffer: DataChannel.Buffer?) {}

}