package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greet somebody.
   * @param someone
   * @return formatted greet message
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
