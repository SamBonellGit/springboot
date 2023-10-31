package com.sam.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{

  public UserNotFoundException(Long id){
      super("Could not find the user with ID " + id);
  }
}
