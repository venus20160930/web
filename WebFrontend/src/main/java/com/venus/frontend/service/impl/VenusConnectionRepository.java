package com.venus.frontend.service.impl;

import java.util.List;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.util.MultiValueMap;

public class VenusConnectionRepository implements ConnectionRepository {

	public MultiValueMap<String, Connection<?>> findAllConnections() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Connection<?>> findConnections(String providerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public <A> List<Connection<A>> findConnections(Class<A> apiType) {
		// TODO Auto-generated method stub
		return null;
	}

	public MultiValueMap<String, Connection<?>> findConnectionsToUsers(MultiValueMap<String, String> providerUserIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public Connection<?> getConnection(ConnectionKey connectionKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public <A> Connection<A> getConnection(Class<A> apiType, String providerUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	public <A> Connection<A> getPrimaryConnection(Class<A> apiType) {
		// TODO Auto-generated method stub
		return null;
	}

	public <A> Connection<A> findPrimaryConnection(Class<A> apiType) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addConnection(Connection<?> connection) {
		// TODO Auto-generated method stub
		
	}

	public void updateConnection(Connection<?> connection) {
		// TODO Auto-generated method stub
		
	}

	public void removeConnections(String providerId) {
		// TODO Auto-generated method stub
		
	}

	public void removeConnection(ConnectionKey connectionKey) {
		// TODO Auto-generated method stub
		
	}

}
