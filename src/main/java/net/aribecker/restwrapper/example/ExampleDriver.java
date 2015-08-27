package net.aribecker.restwrapper.example;

import com.google.inject.Guice;
import net.aribecker.restwrapper.RestWrapperBuilder;
import net.aribecker.restwrapper.RestWrapperServerBuilder;

import javax.inject.Inject;

/**
 * <h1></h1>
 * <p>
 * <p>Created by Ari Becker on 8/27/15.</p>
 */
public class ExampleDriver {
  @Inject
  RestWrapperServerBuilder serverBuilder;
  @Inject
  RestWrapperBuilder wrapperBuilder;

  public static void main(String[] args) {
    Guice.createInjector().getInstance(ExampleDriver.class).run();
  }

  public void run() {
    serverBuilder
        .defaultServer()
        .addRestWrapper(
            wrapperBuilder
              .build())
        .build()
        .run();
  }
}
