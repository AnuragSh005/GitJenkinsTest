package com.anurag.samplecodes;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;

public class ReceiveActiveMQ {
	
	public static void main(String args[]) throws JMSException
	{
		ActiveMQConnectionFactory connectionFatory=new ActiveMQConnectionFactory("tcp://"+"<IP addess>"+":<Portno>");
		Connection connectionMQ=connectionFatory.createConnection();
		connectionMQ.start();
		Session sessionMQ=connectionMQ.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination=sessionMQ.createQueue("<Queue name>");
		MessageConsumer consumer=sessionMQ.createConsumer(destination);
		Message message=consumer.receive();
		TextMessage textMessage=(TextMessage) message;
		String text=textMessage.getText();
		System.out.println(text);
		System.out.println(text.equals("git pushed"));
		
		//to send data to active mq "Queue" 
		//curl -u <username>:<password> -d 'body="git pushed"' "http://<IP addess>:<port>/api/message/<queuename>?type=queue&clientId=consumerA"
	}

}
