package com.example.demo.exceptions;

public class CowNotFoundException extends RuntimeException {

		public CowNotFoundException(Long id) {
			super("Could not find cow with id " + id );
		}
}
