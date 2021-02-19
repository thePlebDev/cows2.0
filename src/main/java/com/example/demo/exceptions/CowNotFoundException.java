package com.example.demo.exceptions;

public class CowNotFoundException extends RuntimeException {

		public CowNotFoundException(int id) {
			super("Could not find cow with id " + id );
		}
}
