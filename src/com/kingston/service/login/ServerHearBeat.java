package com.kingston.service.login;

import com.kingston.net.Packet;
import com.kingston.net.PacketType;

import io.netty.buffer.ByteBuf;

public class ServerHearBeat extends Packet{

	@Override
	public void writePacketMsg(ByteBuf buf) {
//		buf.writeInt(222);
//		buf.writeInt(333);
	}

	@Override
	public void readFromBuff(ByteBuf buf) {
//		System.err.println("args="+buf.readInt());
//		System.err.println("args="+buf.readInt());
		
	}

	@Override
	public PacketType getPacketType() {
		return PacketType.ServerHearBeat;
	}

	@Override
	public void execPacket() {
		System.err.println("ServerHearBeat exec.........");
	}

}
